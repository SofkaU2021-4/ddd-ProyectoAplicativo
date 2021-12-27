package co.com.sofka.UseCases.Events.ProyectoAplicativo;

import co.com.sofka.Domain.ProyectoAplicativo.Events.ProyectoAplicativoCreado;
import co.com.sofka.Domain.ProyectoAplicativo.Values.IdProyectoAplicativo;
import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;

import java.util.List;

public class NotificarProyectoUseCase extends UseCase<TriggeredEvent<ProyectoAplicativoCreado>, ResponseEvents> {
    @Override
    public void executeUseCase(TriggeredEvent<ProyectoAplicativoCreado> TriggeredEvent) {
        var event=TriggeredEvent.getDomainEvent();
        var service=getService(SendEmailProyectoService.class).orElseThrow();
        boolean isValue = service.send(IdProyectoAplicativo.of(event.aggregateRootId()),
                "Soporte@sofka.com",
                "Nuevo Proyecto  creado, con presupuesto: "+ event.getPresupuesto());
        if(!isValue)
            throw  new BusinessException(event.aggregateRootId(),"No se puede enviar");
        emit().onResponse(new ResponseEvents(List.of()));
    }

}

