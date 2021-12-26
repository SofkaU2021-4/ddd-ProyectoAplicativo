package co.com.sofka.UseCases.Commands.GrupoDeTrabajo;

import co.com.sofka.Domain.GrupoDeTrabajo.Commands.CrearLiderGrupoTrabajo;
import co.com.sofka.Domain.GrupoDeTrabajo.GrupoDeTrabajo;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CrearLiderGrupoTrabajoUseCase extends UseCase<RequestCommand<CrearLiderGrupoTrabajo>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearLiderGrupoTrabajo> RequestCommand) {
        var command = RequestCommand.getCommand();
        var grupoDeTrabajo= GrupoDeTrabajo.from(command.getIdGrupoDeTrabajo(),retrieveEvents(command.getEntityId().value()));
        grupoDeTrabajo.CrearLiderGrupoTrabajo(
                command.getEntityId(),
                command.getNombre(),
                command.getIdentificacion(),
                command.getEmail(),
                command.getCelular());

        emit().onResponse(new ResponseEvents(grupoDeTrabajo.getUncommittedChanges()));
    }
}
