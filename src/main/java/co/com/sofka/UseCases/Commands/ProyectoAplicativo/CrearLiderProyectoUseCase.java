package co.com.sofka.UseCases.Commands.ProyectoAplicativo;

import co.com.sofka.Domain.ProyectoAplicativo.Commands.CrearCliente;
import co.com.sofka.Domain.ProyectoAplicativo.Commands.CrearLiderProyecto;
import co.com.sofka.Domain.ProyectoAplicativo.ProyectoAplicativo;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CrearLiderProyectoUseCase extends UseCase<RequestCommand<CrearLiderProyecto>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearLiderProyecto> RequestCommand) {
        var command=RequestCommand.getCommand();

        var proyecto= ProyectoAplicativo.from(command.getIdProyectoAplicativo(),retrieveEvents(command.getEntityId().value()));
        proyecto.CrearLiderProyecto(
                command.getEntityId(),
                command.getNombre(),
                command.getIdentificacion(),
                command.getEmail(),
                command.getCelular());
        emit().onResponse(new ResponseEvents(proyecto.getUncommittedChanges()));


    }
}
