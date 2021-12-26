package co.com.sofka.UseCases.Commands.ProyectoAplicativo;

import co.com.sofka.Domain.ProyectoAplicativo.Commands.CrearCliente;
import co.com.sofka.Domain.ProyectoAplicativo.Commands.CrearSupervisor;
import co.com.sofka.Domain.ProyectoAplicativo.Events.ClienteCreado;
import co.com.sofka.Domain.ProyectoAplicativo.Events.ProyectoAplicativoCreado;
import co.com.sofka.Domain.ProyectoAplicativo.Events.SupervisorCreado;
import co.com.sofka.Domain.ProyectoAplicativo.Values.*;
import co.com.sofka.GenericVO.Celular;
import co.com.sofka.GenericVO.Email;
import co.com.sofka.GenericVO.Identificacion;
import co.com.sofka.GenericVO.Nombre;
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
class CrearClienteUseCaseTest {

    @Mock
    private DomainEventRepository repository;

    @Test
    @DisplayName("test agregar cliente")
    public void CrearCliente(){

        //arrange
        IdProyectoAplicativo idProyectoAplicativo =   new IdProyectoAplicativo();
        IdClienteId idClienteId = new IdClienteId();
        RazonSocial razonSocial =new RazonSocial("el chiringuito");
        NIT nit = new NIT("1234567891234");
        Email email = new Email("jsacasd@gmail.com");
        Celular celular = new Celular("3135635569");

        var command = new CrearCliente(idProyectoAplicativo,idClienteId,razonSocial,nit,email,celular);
        var useCase= new CrearClienteUseCase();

        Mockito.when(repository.getEventsBy(idClienteId.value())).thenReturn(EventStored());
        useCase.addRepository(repository);


        //Act

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(idClienteId.value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        ClienteCreado event = (ClienteCreado) events.get(0);

        Assertions.assertEquals(idClienteId.value() , event.getEntityId().value());
        Assertions.assertEquals("el chiringuito" , event.getRazonSocial().value());
        Assertions.assertEquals("1234567891234" , event.getNit().value());
        Assertions.assertEquals("jsacasd@gmail.com" , event.getEmail().value());
        Assertions.assertEquals("3135635569" , event.getCelular().value());
        Mockito.verify(repository).getEventsBy(idClienteId.value());

    }

    private List<DomainEvent> EventStored() {
        return List.of(
                new ProyectoAplicativoCreado(
                        new Presupuesto("574889994")
                )
        );
    }

}