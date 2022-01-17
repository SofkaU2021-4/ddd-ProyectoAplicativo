package co.com.sofka.UseCases.Commands.ProyectoAplicativo;

import co.com.sofka.Domain.ProyectoAplicativo.Commands.CrearSupervisor;
import co.com.sofka.Domain.ProyectoAplicativo.Events.ProyectoAplicativoCreado;
import co.com.sofka.Domain.ProyectoAplicativo.Events.SupervisorCreado;
import co.com.sofka.Domain.ProyectoAplicativo.Values.IdProyectoAplicativo;
import co.com.sofka.Domain.ProyectoAplicativo.Values.IdSupervisor;
import co.com.sofka.Domain.ProyectoAplicativo.Values.Presupuesto;
import co.com.sofka.Domain.GenericVO.Celular;
import co.com.sofka.Domain.GenericVO.Email;
import co.com.sofka.Domain.GenericVO.Identificacion;
import co.com.sofka.Domain.GenericVO.Nombre;
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

@ExtendWith(MockitoExtension.class)
class CrearSupervisorUseCaseTest  {


    @Mock
    private DomainEventRepository repository;

    @Test
    @DisplayName("test agregar un supervisor en un proyecto")
    public void CrearSupervisor(){



        //arrange
        IdProyectoAplicativo idProyectoAplicativo =   new IdProyectoAplicativo();
        IdSupervisor idSupervisor = new IdSupervisor();
        Nombre nombre= new Nombre("el sebas");
        Identificacion identificacion = new Identificacion("123456789");
        Email email =new Email("jasda@gmail.com");
        Celular celular = new Celular("789456123");

        var command = new CrearSupervisor(idProyectoAplicativo,idSupervisor,nombre,identificacion,email,celular);
        var useCase= new CrearSupervisorUseCase();

        Mockito.when(repository.getEventsBy(idSupervisor.value())).thenReturn(EventStored());
        useCase.addRepository(repository);



        //Act

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(idSupervisor.value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        SupervisorCreado event = (SupervisorCreado) events.get(0);

        Assertions.assertEquals(idSupervisor.value() , event.getEntityId().value());
        Assertions.assertEquals("el sebas" , event.getNombre().value());
        Assertions.assertEquals("123456789" , event.getIdentificacion().value());
        Assertions.assertEquals("jasda@gmail.com" , event.getEmail().value());
        Assertions.assertEquals("789456123" , event.getCelular().value());
        Mockito.verify(repository).getEventsBy(idSupervisor.value());
    }


    private List<DomainEvent> EventStored() {
        return List.of(
                new ProyectoAplicativoCreado(
                        new Presupuesto("574889994")
                )
        );
    }



}