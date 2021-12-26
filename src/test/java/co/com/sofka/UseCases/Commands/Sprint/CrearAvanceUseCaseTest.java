package co.com.sofka.UseCases.Commands.Sprint;


import co.com.sofka.Domain.GrupoDeTrabajo.Values.IdGrupoDeTrabajo;
import co.com.sofka.Domain.Sprint.Commands.CrearAvance;
import co.com.sofka.Domain.Sprint.Events.SprintCreado;
import co.com.sofka.Domain.Sprint.Values.*;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CrearAvanceUseCaseTest {
    @Mock
    private DomainEventRepository repository;

    @Test
    @DisplayName("test crear un avance")
    public void CrearTest(){

        IdSprint idSprint = new IdSprint();
        IdAvance idAvance = new IdAvance();
        Descripcion descripcion = new Descripcion("la descripcion mas hp de este mundo pues pues pues pues ome pues parcero");

        var command = new CrearAvance(idSprint,idAvance,descripcion);
        var useCase= new CrearAvanceUseCase();

        Mockito.when(repository.getEventsBy(idAvance.value())).thenReturn(EventStored());
        useCase.addRepository(repository);


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