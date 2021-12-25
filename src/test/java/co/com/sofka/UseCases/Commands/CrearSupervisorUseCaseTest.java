package co.com.sofka.UseCases.Commands;

import co.com.sofka.Domain.ProyectoAplicativo.Commands.CrearProyectoAplicativo;
import co.com.sofka.Domain.ProyectoAplicativo.Commands.CrearSupervisor;
import co.com.sofka.Domain.ProyectoAplicativo.Events.ProyectoAplicativoCreado;
import co.com.sofka.Domain.ProyectoAplicativo.Events.SupervisorCreado;
import co.com.sofka.Domain.ProyectoAplicativo.Values.IdProyectoAplicativo;
import co.com.sofka.Domain.ProyectoAplicativo.Values.IdSupervisor;
import co.com.sofka.Domain.ProyectoAplicativo.Values.Presupuesto;
import co.com.sofka.GenericVO.Celular;
import co.com.sofka.GenericVO.Email;
import co.com.sofka.GenericVO.Identificacion;
import co.com.sofka.GenericVO.Nombre;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrearSupervisorUseCaseTest {

    @Test
    public void CrearSupervisor(){
        //arrange
        IdProyectoAplicativo idProyectoAplicativo =  new  IdProyectoAplicativo();
        IdSupervisor idSupervisor = IdSupervisor.of("hola");
        Nombre nombre= new Nombre("el sebas");
        Identificacion identificacion = new Identificacion("123456789");
        Email email =new Email("jasda@gmail.com");
        Celular celular = new Celular("789456123");

        var command = new CrearSupervisor(idProyectoAplicativo,idSupervisor,nombre,identificacion,email,celular);
        var useCase= new CrearSupervisorUseCase();





        //Act

        var events = UseCaseHandler.getInstance().syncExecutor(useCase,new RequestCommand<>(command))
                .orElseThrow();

        SupervisorCreado event = (SupervisorCreado) events.getDomainEvents().get(1);

        Assertions.assertEquals("hola" , event.getEntityId().value());
        Assertions.assertEquals("el sebas" , event.getNombre().value());
        Assertions.assertEquals("123456789" , event.getIdentificacion().value());
        Assertions.assertEquals("jasda@gmail.com" , event.getEmail().value());
        Assertions.assertEquals("789456123" , event.getCelular().value());
    }



}