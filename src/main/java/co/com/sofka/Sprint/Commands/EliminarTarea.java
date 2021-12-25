package co.com.sofka.Sprint.Commands;

import co.com.sofka.Sprint.Values.IdSprint;
import co.com.sofka.Sprint.Values.IdTarea;
import co.com.sofka.domain.generic.Command;

public class EliminarTarea extends Command {

    private final IdSprint idSprint;
    private final IdTarea entityId;

    public EliminarTarea(IdSprint idSprint , IdTarea entityId) {
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
