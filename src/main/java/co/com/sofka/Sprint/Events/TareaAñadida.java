package co.com.sofka.Sprint.Events;

import co.com.sofka.Sprint.Values.Actividad;
import co.com.sofka.Sprint.Values.Descripcion;
import co.com.sofka.Sprint.Values.IdTarea;
import co.com.sofka.domain.generic.DomainEvent;

public class TareaAñadida extends DomainEvent {
    private final IdTarea entityId;
    private final Descripcion descripcion;
    private final Actividad actividad;

    public TareaAñadida(IdTarea entityId, Descripcion descripcion, Actividad actividad) {
        super("sofka.GrupoDeTrabajo.TareaAñadida");
        this.entityId = entityId;
        this.descripcion = descripcion;
        this.actividad = actividad;
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
