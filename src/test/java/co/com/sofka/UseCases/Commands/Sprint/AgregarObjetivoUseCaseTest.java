package co.com.sofka.UseCases.Commands.Sprint;

import co.com.sofka.Domain.GrupoDeTrabajo.Values.IdGrupoDeTrabajo;

import co.com.sofka.Domain.Sprint.Commands.AñadirObjetivo;
import co.com.sofka.Domain.Sprint.Events.ObjetivoAñadido;
import co.com.sofka.Domain.Sprint.Events.SprintCreado;
import co.com.sofka.Domain.Sprint.Values.Descripcion;
import co.com.sofka.Domain.Sprint.Values.FechaCreacion;
import co.com.sofka.Domain.Sprint.Values.IdObjetivo;
import co.com.sofka.Domain.Sprint.Values.IdSprint;
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
class AgregarObjetivoUseCaseTest {
    @Mock
    private DomainEventRepository repository;

    @Test
    @DisplayName("test agregar un supervisor en un proyecto")
    public void CrearObjetivo(){

        IdSprint idSprint = new IdSprint();
        IdObjetivo idObjetivo= new IdObjetivo();
        Descripcion descripcion = new Descripcion("la descripcion mas hp de este mundo pues pues pues pues ome pues parcero");
        FechaCreacion fechaCreacion = new FechaCreacion();

        var command = new AñadirObjetivo(idSprint,idObjetivo,descripcion,fechaCreacion);
        var useCase= new AgregarObjetivoUseCase();

        Mockito.when(repository.getEventsBy(idObjetivo.value())).thenReturn(EventStored());
        useCase.addRepository(repository);


        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(idObjetivo.value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();


        ObjetivoAñadido event = (ObjetivoAñadido) events.get(0);

        Assertions.assertEquals(idObjetivo.value() , event.getEntityId().value());
        Assertions.assertEquals(fechaCreacion , event.getFechaCreacion());
        Assertions.assertEquals(descripcion , event.getDescripcion());


        Mockito.verify(repository).getEventsBy(idObjetivo.value());

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