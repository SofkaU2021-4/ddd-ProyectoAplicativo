package co.com.sofka.UseCases.Commands.Sprint;

import co.com.sofka.Domain.GrupoDeTrabajo.Values.IdGrupoDeTrabajo;
import co.com.sofka.Domain.Sprint.Commands.AñadirObjetivo;
import co.com.sofka.Domain.Sprint.Commands.AñadirTarea;
import co.com.sofka.Domain.Sprint.Events.ObjetivoAñadido;
import co.com.sofka.Domain.Sprint.Events.SprintCreado;
import co.com.sofka.Domain.Sprint.Events.TareaAñadida;
import co.com.sofka.Domain.Sprint.Values.*;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
class AñadirTareaUseCaseTest {

    @Mock
    private DomainEventRepository repository;

    @Test
    @DisplayName("test añadir un tarea")
    public void AñadirTarea(){

        IdSprint idSprint = new IdSprint();
        IdTarea idTarea = new IdTarea();
        Actividad actividad= new Actividad("ESTA ES una actividad de pruebas jajajjajaja");
        Descripcion descripcion = new Descripcion("la descripcion mas hp de este mundo pues pues pues pues ome pues parcero");

        var command = new AñadirTarea(idSprint,idTarea,descripcion,actividad);
        var useCase= new AñadirTareaUseCase();

        Mockito.when(repository.getEventsBy(idTarea.value())).thenReturn(EventStored());
        useCase.addRepository(repository);



        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(idTarea.value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();


        TareaAñadida event = (TareaAñadida) events.get(0);

        Assertions.assertEquals(idTarea.value() , event.getEntityId().value());
        Assertions.assertEquals(actividad , event.getActividad());
        Assertions.assertEquals(descripcion , event.getDescripcion());


        Mockito.verify(repository).getEventsBy(idTarea.value());




    }

    private List<DomainEvent> EventStored() {
        return List.of(
                new SprintCreado(
                        new Descripcion("575478787878878787878787878787878778787878787874889994"),
                        new IdGrupoDeTrabajo()
                )
        );
    }

}