package co.com.sofka.UseCases.Commands.Sprint;


import co.com.sofka.Domain.ProyectoAplicativo.ProyectoAplicativo;
import co.com.sofka.Domain.Sprint.Commands.CrearSprint;
import co.com.sofka.Domain.Sprint.Sprint;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CrearSprintUseCase extends UseCase<RequestCommand<CrearSprint>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearSprint> RequestCommand) {
        var command=RequestCommand.getCommand();
        var sprint=new Sprint(command.getIdSprint(),command.getDescripcion(),command.getGrupoDeTrabajoId());
        emit().onResponse(new ResponseEvents(sprint.getUncommittedChanges()));

    }
}
