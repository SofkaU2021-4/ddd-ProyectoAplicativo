package co.com.sofka.UseCases.Commands.ProyectoAplicativo;

import co.com.sofka.Domain.ProyectoAplicativo.Commands.CrearCliente;
import co.com.sofka.Domain.ProyectoAplicativo.ProyectoAplicativo;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CrearClienteUseCase extends UseCase<RequestCommand<CrearCliente>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearCliente> RequestCommand) {
        var command=RequestCommand.getCommand();

        var proyecto= ProyectoAplicativo.from(command.getIdProyectoAplicativo(),retrieveEvents(command.getEntityId().value()));
        proyecto.CrearCliente(
                command.getEntityId(),
                command.getRazonSocial(),
                command.getNit(),
                command.getEmail(),
                command.getCelular());

        emit().onResponse(new ResponseEvents(proyecto.getUncommittedChanges()));
    }
}
