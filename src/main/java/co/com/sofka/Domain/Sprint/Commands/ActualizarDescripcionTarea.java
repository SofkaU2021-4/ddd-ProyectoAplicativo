package co.com.sofka.Domain.Sprint.Commands;

import co.com.sofka.Domain.Sprint.Values.IdSprint;
import co.com.sofka.Domain.Sprint.Values.IdTarea;
import co.com.sofka.domain.generic.Command;

public class ActualizarDescripcionTarea extends Command {

    private final IdSprint idSprint;
    private final IdTarea entityId;

    public ActualizarDescripcionTarea(IdSprint idSprint ,IdTarea entityId) {
        this.idSprint = idSprint;

        this.entityId = entityId;
    }

    public IdSprint getIdSprint() {
        return idSprint;
    }

    public IdTarea getEntityId() {
        return entityId;
    }
}
