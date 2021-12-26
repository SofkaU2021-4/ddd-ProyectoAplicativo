package co.com.sofka.UseCases.Commands.ProyectoAplicativo;

import co.com.sofka.Domain.ProyectoAplicativo.Commands.CrearCliente;
import co.com.sofka.Domain.ProyectoAplicativo.Commands.CrearLiderProyecto;
import co.com.sofka.Domain.ProyectoAplicativo.Events.ClienteCreado;
import co.com.sofka.Domain.ProyectoAplicativo.Events.LiderProyectoCreado;
import co.com.sofka.Domain.ProyectoAplicativo.Events.ProyectoAplicativoCreado;
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
class CrearLiderProyectoUseCaseTest {

    @Mock
    private DomainEventRepository repository;

    @Test
    @DisplayName("test crearLiderProyecto ")
    public void CrearLiderProyecto(){

        //arrange
        IdProyectoAplicativo idProyectoAplicativo =   new IdProyectoAplicativo();
        IdLiderProyecto idLiderProyecto = new IdLiderProyecto();
        Nombre nombre =new Nombre("el chiringuito");
        Identificacion identificacion = new Identificacion("1234567891234");
        Email email = new Email("jsacasd@gmail.com");
        Celular celular = new Celular("3135635569");

        var command = new CrearLiderProyecto(idProyectoAplicativo,idLiderProyecto,nombre,identificacion,email,celular);
        var useCase= new CrearLiderProyectoUseCase();

        Mockito.when(repository.getEventsBy(idLiderProyecto.value())).thenReturn(EventStored());
        useCase.addRepository(repository);

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(idLiderProyecto.value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        LiderProyectoCreado event = (LiderProyectoCreado) events.get(0);

        Assertions.assertEquals(idLiderProyecto.value() , event.getEntityId().value());
        Assertions.assertEquals("el chiringuito" , event.getNombre().value());
        Assertions.assertEquals("1234567891234" , event.getIdentificacion().value());
        Assertions.assertEquals("jsacasd@gmail.com" , event.getEmail().value());
        Assertions.assertEquals("3135635569" , event.getCelular().value());
        Mockito.verify(repository).getEventsBy(idLiderProyecto.value());
    }

    private List<DomainEvent> EventStored() {
        return List.of(
                new ProyectoAplicativoCreado(
                        new Presupuesto("574889994")
                )
        );
    }

}