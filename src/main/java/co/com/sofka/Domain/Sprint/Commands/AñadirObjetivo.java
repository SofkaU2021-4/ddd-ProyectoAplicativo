package co.com.sofka.Domain.Sprint.Commands;

import co.com.sofka.Domain.Sprint.Values.*;
import co.com.sofka.domain.generic.Command;

public class AñadirObjetivo  extends Command {

    private final IdSprint idSprint;

    private final IdObjetivo entityId;
    private final Descripcion descripcion;
    private final FechaCreacion fechaCreacion;

    public AñadirObjetivo(IdSprint idSprint, IdObjetivo entityId, Descripcion descripcion , FechaCreacion fechaCreacion) {
        this.idSprint = idSprint;
        this.entityId = entityId;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
    }

    public IdObjetivo getEntityId() {
        return entityId;
    }

    public FechaCreacion getFechaCreacion() {
        return fechaCreacion;
    }

    public IdSprint getIdSprint() {
        return idSprint;
    }


    public Descripcion getDescripcion() {
        return descripcion;
    }
}
