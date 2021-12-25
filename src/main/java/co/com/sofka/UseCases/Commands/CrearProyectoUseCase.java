package co.com.sofka.UseCases.Commands;

import co.com.sofka.Domain.ProyectoAplicativo.Commands.CrearProyectoAplicativo;
import co.com.sofka.Domain.ProyectoAplicativo.ProyectoAplicativo;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CrearProyectoUseCase extends UseCase<RequestCommand<CrearProyectoAplicativo>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearProyectoAplicativo> RequestCommand) {
        var command=RequestCommand.getCommand();
        var Proyecto=new ProyectoAplicativo(command.getIdProyectoAplicativo(),command.getPresupuesto());
        emit().onResponse(new ResponseEvents(Proyecto.getUncommittedChanges()));

    }
}
