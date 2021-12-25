package co.com.sofka.Sprint.Commands;

import co.com.sofka.Sprint.Values.Descripcion;
import co.com.sofka.Sprint.Values.IdAvance;
import co.com.sofka.Sprint.Values.IdSprint;
import co.com.sofka.domain.generic.Command;

public class ActualizarDescripcionAvance extends Command {
    private final IdSprint idSprint;
    private final IdAvance entityId;
    private final Descripcion descripcion;

    public ActualizarDescripcionAvance(IdSprint idSprint, IdAvance entityId, Descripcion descripcion) {
        this.idSprint = idSprint;

        this.entityId = entityId;
        this.descripcion = descripcion;
    }

    public IdSprint getIdSprint() {
        return idSprint;
    }

    public IdAvance getEntityId() {
        return entityId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
