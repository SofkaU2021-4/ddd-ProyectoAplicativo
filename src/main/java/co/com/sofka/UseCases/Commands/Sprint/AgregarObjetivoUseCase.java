package co.com.sofka.UseCases.Commands.Sprint;

import co.com.sofka.Domain.Sprint.Commands.AñadirObjetivo;
import co.com.sofka.Domain.Sprint.Sprint;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class AgregarObjetivoUseCase extends UseCase<RequestCommand<AñadirObjetivo>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AñadirObjetivo> RequestCommand) {

        var command=RequestCommand.getCommand();
        var sprint=Sprint.from(command.getIdSprint(),retrieveEvents(command.getEntityId().value()));
        sprint.AñadirObjetivo(command.getEntityId(), command.getDescripcion(),command.getFechaCreacion());
        emit().onResponse(new ResponseEvents(sprint.getUncommittedChanges()));

    }
}
