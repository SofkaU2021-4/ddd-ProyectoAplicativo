package co.com.sofka.Sprint.Commands;

import co.com.sofka.Sprint.Values.FechaCreacion;
import co.com.sofka.Sprint.Values.IdObjetivo;
import co.com.sofka.Sprint.Values.IdSprint;
import co.com.sofka.domain.generic.Command;

public class ActualizarDescripcionObjetivo extends Command {
    private final IdSprint idSprint;
    private final IdObjetivo entityId;
    private final FechaCreacion fechaCreacion;

    public ActualizarDescripcionObjetivo(IdSprint idSprint, IdObjetivo entityId, FechaCreacion fechaCreacion) {
        this.idSprint = idSprint;
        this.entityId = entityId;
        this.fechaCreacion = fechaCreacion;
    }

    public IdObjetivo getEntityId() {
        return entityId;
    }

    public IdSprint getIdSprint() {
        return idSprint;
    }

    public FechaCreacion getFechaCreacion() {
        return fechaCreacion;
    }
}
