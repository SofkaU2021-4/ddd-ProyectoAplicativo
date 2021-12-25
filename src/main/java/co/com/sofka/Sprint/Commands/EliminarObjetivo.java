package co.com.sofka.Sprint.Commands;

import co.com.sofka.Sprint.Values.IdObjetivo;
import co.com.sofka.Sprint.Values.IdSprint;
import co.com.sofka.domain.generic.Command;

public class EliminarObjetivo extends Command {
    private final IdSprint idSprint;
    private final IdObjetivo entityId;

    public EliminarObjetivo(IdSprint idSprint , IdObjetivo entityId) {
        this.idSprint = idSprint;
        this.entityId = entityId;
    }

    public IdSprint getIdSprint() {
        return idSprint;
    }

    public IdObjetivo getEntityId() {
        return entityId;
    }
}
