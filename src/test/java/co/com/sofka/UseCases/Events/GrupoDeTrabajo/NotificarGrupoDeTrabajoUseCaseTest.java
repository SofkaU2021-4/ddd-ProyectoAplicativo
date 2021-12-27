package co.com.sofka.UseCases.Events.GrupoDeTrabajo;

import co.com.sofka.Domain.GrupoDeTrabajo.Events.GrupoDeTrabajoCreado;
import co.com.sofka.Domain.GrupoDeTrabajo.Values.IdGrupoDeTrabajo;
import co.com.sofka.GenericVO.Nombre;
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
class NotificarGrupoDeTrabajoUseCaseTest {

    @Mock
    SendEmailGrupoDeTrabajo servicio;
    @Test
    public void EnviarCorreoGrupoDeTrabajoCreado(){
        IdGrupoDeTrabajo idGrupoDeTrabajo=IdGrupoDeTrabajo.of("XXX");
        Nombre nombre=new Nombre("GrupoFino");

        var event=new GrupoDeTrabajoCreado( nombre);
        event.setAggregateRootId(idGrupoDeTrabajo.value());
        var usecase = new NotificarGrupoDeTrabajoUseCase();
        when(servicio.send(
                idGrupoDeTrabajo,
                "Soporte@sofka.com",
                "Nuevo Grupo de trabajo   creado, : ")).thenReturn(true);

        ServiceBuilder builder = new ServiceBuilder();
        builder.addService(servicio);
        usecase.addServiceBuilder(builder);


        UseCaseHandler.getInstance()
                .syncExecutor(usecase,new TriggeredEvent<>(event))
                .orElseThrow();


        verify(servicio).send(idGrupoDeTrabajo,
                "Soporte@sofka.com",
                "Nuevo Grupo de trabajo   creado, : ");

    }
}