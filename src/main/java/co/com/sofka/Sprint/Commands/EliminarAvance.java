package co.com.sofka.Sprint.Commands;

import co.com.sofka.Sprint.Values.IdAvance;
import co.com.sofka.Sprint.Values.IdSprint;
import co.com.sofka.domain.generic.Command;

public class EliminarAvance  extends Command {
    private final IdSprint idSprint;
    private final IdAvance entityId;

    public EliminarAvance(IdSprint idSprint , IdAvance entityId) {
        this.idSprint = idSprint;

        this.entityId = entityId;
    }

    public IdSprint getIdSprint() {
        return idSprint;
    }

    public IdAvance getEntityId() {
        return entityId;
    }
}
