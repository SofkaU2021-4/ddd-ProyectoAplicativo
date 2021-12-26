package co.com.sofka.UseCases.Commands.GrupoDeTrabajo;

import co.com.sofka.Domain.GrupoDeTrabajo.Commands.AñadirProgramador;

import co.com.sofka.Domain.GrupoDeTrabajo.GrupoDeTrabajo;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CrearProgramadorUseCase extends UseCase<RequestCommand<AñadirProgramador>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AñadirProgramador> RequestCommand) {
        var command = RequestCommand.getCommand();
        var grupoDeTrabajo= GrupoDeTrabajo.from(command.getIdGrupoDeTrabajo(),retrieveEvents(command.getEntityId().value()));
        grupoDeTrabajo.AñadirProgramador(
                command.getEntityId(),
                command.getRol(),
                command.getNombre(),
                command.getCelular(),
                command.getIdentificacion(),
                command.getEmail());

        emit().onResponse(new ResponseEvents(grupoDeTrabajo.getUncommittedChanges()));

    }
}
