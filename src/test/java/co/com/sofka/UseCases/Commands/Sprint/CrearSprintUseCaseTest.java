package co.com.sofka.UseCases.Commands.Sprint;

import co.com.sofka.Domain.GrupoDeTrabajo.Values.IdGrupoDeTrabajo;
import co.com.sofka.Domain.ProyectoAplicativo.Events.ProyectoAplicativoCreado;

import co.com.sofka.Domain.Sprint.Commands.CrearSprint;
import co.com.sofka.Domain.Sprint.Events.SprintCreado;
import co.com.sofka.Domain.Sprint.Values.Descripcion;
import co.com.sofka.Domain.Sprint.Values.IdSprint;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrearSprintUseCaseTest {

    @Test
    public void crearProyecto(){
        //arrange
        IdSprint idSprint =  IdSprint.of("XXXX");
        Descripcion descripcion = new Descripcion("1252454543kaskdhjashdjashjhasjdsad46");
        var command = new CrearSprint(idSprint,descripcion,new IdGrupoDeTrabajo());
        var useCase= new CrearSprintUseCase();


        //Add

        var events = UseCaseHandler.getInstance().syncExecutor(useCase,new RequestCommand<>(command))
                .orElseThrow();

        SprintCreado event = (SprintCreado) events.getDomainEvents().get(0);
        Assertions.assertEquals("XXXX" , event.aggregateRootId());

        Assertions.assertEquals("1252454543kaskdhjashdjashjhasjdsad46" , event.getDescripcion().value());
    }

}