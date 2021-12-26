package co.com.sofka.UseCases.Commands.GrupoDeTrabajo;

import co.com.sofka.Domain.GrupoDeTrabajo.Commands.CrearCoatch;
import co.com.sofka.Domain.GrupoDeTrabajo.GrupoDeTrabajo;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;


public class CrearCoatchUseCase extends UseCase<RequestCommand<CrearCoatch>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearCoatch> RequestCommand) {
        var command = RequestCommand.getCommand();
        var grupoDeTrabajo= GrupoDeTrabajo.from(command.getIdGrupoDeTrabajo(),retrieveEvents(command.getEntityId().value()));
        grupoDeTrabajo.CrearCoatch(command.getEntityId(),
                command.getNombre(),
                command.getCelular(),
                command.getIdentificacion(),
                command.getEmail(),
                command.getAreaDeEspecialidad());
        emit().onResponse(new ResponseEvents(grupoDeTrabajo.getUncommittedChanges()));
    }
}
