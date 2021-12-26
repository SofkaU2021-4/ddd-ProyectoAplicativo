package co.com.sofka.UseCases.Commands.GrupoDeTrabajo;

import co.com.sofka.Domain.GrupoDeTrabajo.Commands.CrearGrupoDeTrabajo;
import co.com.sofka.Domain.GrupoDeTrabajo.GrupoDeTrabajo;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CrearGrupoDeTrabajoUseCase extends UseCase<RequestCommand<CrearGrupoDeTrabajo>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearGrupoDeTrabajo> RequestCommand) {
        var command=RequestCommand.getCommand();
        var grupoTrabajo=new GrupoDeTrabajo(command.getIdGrupoDeTrabajo(),command.getNombre());
        emit().onResponse(new ResponseEvents(grupoTrabajo.getUncommittedChanges()));
    }
}
