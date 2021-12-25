package co.com.sofka.Sprint.Commands;

import co.com.sofka.Sprint.Values.Actividad;
import co.com.sofka.Sprint.Values.Descripcion;
import co.com.sofka.Sprint.Values.IdSprint;
import co.com.sofka.Sprint.Values.IdTarea;
import co.com.sofka.domain.generic.Command;

public class AñadirTarea extends Command {

    private final IdSprint idSprint;
    private final IdTarea entityId;
    private final Descripcion descripcion;
    private final Actividad actividad;

    public AñadirTarea(IdSprint idSprint , IdTarea entityId, Descripcion descripcion, Actividad actividad) {
        this.idSprint = idSprint;

        this.entityId = entityId;
        this.descripcion = descripcion;
        this.actividad = actividad;
    }

    public IdSprint getIdSprint() {
        return idSprint;
    }

    public IdTarea getEntityId() {
        return entityId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public Actividad getActividad() {
        return actividad;
    }
}
