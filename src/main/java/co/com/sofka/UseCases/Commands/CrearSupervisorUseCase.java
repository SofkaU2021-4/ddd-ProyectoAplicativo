package co.com.sofka.UseCases.Commands;

import co.com.sofka.Domain.ProyectoAplicativo.Commands.CrearProyectoAplicativo;
import co.com.sofka.Domain.ProyectoAplicativo.Commands.CrearSupervisor;
import co.com.sofka.Domain.ProyectoAplicativo.Entities.Supervisor;
import co.com.sofka.Domain.ProyectoAplicativo.ProyectoAplicativo;
import co.com.sofka.Domain.ProyectoAplicativo.Values.IdProyectoAplicativo;
import co.com.sofka.Domain.ProyectoAplicativo.Values.IdSupervisor;
import co.com.sofka.Domain.ProyectoAplicativo.Values.Presupuesto;
import co.com.sofka.GenericVO.Celular;
import co.com.sofka.GenericVO.Identificacion;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;


public class CrearSupervisorUseCase extends UseCase<RequestCommand<CrearSupervisor>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearSupervisor> RequestCommand) {
        var command=RequestCommand.getCommand();
        var Proyecto=new ProyectoAplicativo(new IdProyectoAplicativo(),new Presupuesto("123456789"));
        Proyecto.CrearSupervisor(
                command.getEntityId(),
                command.getNombre(),
                command.getIdentificacion(),
                command.getEmail(),
                command.getCelular());

        emit().onResponse(new ResponseEvents(Proyecto.getUncommittedChanges()));

    }

}
