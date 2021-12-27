package co.com.sofka.UseCases.Events.GrupoDeTrabajo;

import co.com.sofka.Domain.GrupoDeTrabajo.Events.GrupoDeTrabajoCreado;
import co.com.sofka.Domain.GrupoDeTrabajo.Values.IdGrupoDeTrabajo;
import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;

import java.util.List;

public class NotificarGrupoDeTrabajoUseCase extends UseCase<TriggeredEvent<GrupoDeTrabajoCreado>, ResponseEvents> {
    @Override
    public void executeUseCase(TriggeredEvent<GrupoDeTrabajoCreado> TriggeredEvent) {
        var event=TriggeredEvent.getDomainEvent();
        var service=getService(SendEmailGrupoDeTrabajo.class).orElseThrow();
        boolean isValue = service.send(IdGrupoDeTrabajo.of(event.aggregateRootId()),
                "Soporte@sofka.com",
                "Nuevo Grupo de trabajo   creado, : ");
        if(!isValue)
            throw  new BusinessException(event.aggregateRootId(),"No se puede enviar");
        emit().onResponse(new ResponseEvents(List.of()));
    }
}
