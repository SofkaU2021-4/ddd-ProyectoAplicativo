package co.com.sofka.UseCases.Commands;

import co.com.sofka.Domain.ProyectoAplicativo.Commands.CrearProyectoAplicativo;
import co.com.sofka.Domain.ProyectoAplicativo.Events.ProyectoAplicativoCreado;
import co.com.sofka.Domain.ProyectoAplicativo.Values.IdProyectoAplicativo;
import co.com.sofka.Domain.ProyectoAplicativo.Values.Presupuesto;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrearProyectoUseCaseTest {

    @Test
    public void crearProyecto(){
        //arrange
        IdProyectoAplicativo idProyectoAplicativo =  IdProyectoAplicativo.of("XXXX");
        Presupuesto presupuesto = new Presupuesto("125245454346");
        var command = new CrearProyectoAplicativo(idProyectoAplicativo,presupuesto);
        var useCase= new CrearProyectoUseCase();


        //Add

        var events = UseCaseHandler.getInstance().syncExecutor(useCase,new RequestCommand<>(command))
                .orElseThrow();

        ProyectoAplicativoCreado event = (ProyectoAplicativoCreado) events.getDomainEvents().get(0);
        Assertions.assertEquals("XXXX" , event.aggregateRootId());

        Assertions.assertEquals("125245454346" , event.getPresupuesto().value());
    }


}