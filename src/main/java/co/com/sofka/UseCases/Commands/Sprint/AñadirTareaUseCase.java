package co.com.sofka.UseCases.Commands.Sprint;


import co.com.sofka.Domain.GrupoDeTrabajo.GrupoDeTrabajo;
import co.com.sofka.Domain.Sprint.Commands.AñadirTarea;
import co.com.sofka.Domain.Sprint.Sprint;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class AñadirTareaUseCase extends UseCase<RequestCommand<AñadirTarea>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AñadirTarea>RequestCommand) {
        var command = RequestCommand.getCommand();
        var sprint= Sprint.from(command.getIdSprint(),retrieveEvents(command.getEntityId().value()));

        sprint.AñadirTarea(
                command.getEntityId(),
                command.getActividad(),
                command.getDescripcion());

        emit().onResponse(new ResponseEvents(sprint.getUncommittedChanges()));


    }
}
