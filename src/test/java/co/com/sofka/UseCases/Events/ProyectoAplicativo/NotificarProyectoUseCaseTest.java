package co.com.sofka.UseCases.Events.ProyectoAplicativo;

import co.com.sofka.Domain.ProyectoAplicativo.Events.ProyectoAplicativoCreado;
import co.com.sofka.Domain.ProyectoAplicativo.Values.IdProyectoAplicativo;
import co.com.sofka.Domain.ProyectoAplicativo.Values.Presupuesto;
import co.com.sofka.business.generic.ServiceBuilder;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.TriggeredEvent;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class NotificarProyectoUseCaseTest {

    @Mock
    SendEmailProyectoService servicio;
    @Test

    void enviarCorreoProyectoCreado(){
        IdProyectoAplicativo idProyectoAplicativo =  IdProyectoAplicativo.of("XXXX");
        Presupuesto presupuesto = new Presupuesto("125245454346");

        var event=new ProyectoAplicativoCreado( presupuesto);
        event.setAggregateRootId(idProyectoAplicativo.value());
        var usecase = new NotificarProyectoUseCase();
        when(servicio.send(
                idProyectoAplicativo,
                "Soporte@sofka.com",
                "Nuevo Proyecto  creado, con presupuesto: "+ event.getPresupuesto())).thenReturn(true);

        ServiceBuilder builder = new ServiceBuilder();
        builder.addService(servicio);
        usecase.addServiceBuilder(builder);

        UseCaseHandler.getInstance()
                .syncExecutor(usecase,new TriggeredEvent<>(event))
                .orElseThrow();

        verify(servicio).send(idProyectoAplicativo,
                "Soporte@sofka.com",
                "Nuevo Proyecto  creado, con presupuesto: "+ event.getPresupuesto());
    }

}