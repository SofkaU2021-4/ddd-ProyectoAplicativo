package co.com.sofka.UseCases.Commands.Sprint;


import co.com.sofka.Domain.Sprint.Commands.CrearAvance;
import co.com.sofka.Domain.Sprint.Sprint;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CrearAvanceUseCase extends UseCase<RequestCommand<CrearAvance>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearAvance> RequestCommand) {

        var command = RequestCommand.getCommand();
        var sprint= Sprint.from(command.getIdSprint(),retrieveEvents(command.getEntityId().value()));

        sprint.CrearAvance(
                command.getEntityId(),
                command.getDescripcion());


        emit().onResponse(new ResponseEvents(sprint.getUncommittedChanges()));


    }
}
