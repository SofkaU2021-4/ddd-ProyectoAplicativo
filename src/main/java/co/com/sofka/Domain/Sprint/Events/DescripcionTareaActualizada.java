package co.com.sofka.Domain.Sprint.Events;

import co.com.sofka.Domain.Sprint.Values.Descripcion;
import co.com.sofka.Domain.Sprint.Values.IdTarea;
import co.com.sofka.domain.generic.DomainEvent;

public class DescripcionTareaActualizada extends DomainEvent {
    private final IdTarea entityId;
    private final Descripcion descripcion;

    public DescripcionTareaActualizada(IdTarea entityId , Descripcion descripcion) {
        super("sofka.GrupoDeTrabajo.DescripcionTareaActualizada");
        this.entityId = entityId;
        this.descripcion = descripcion;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public IdTarea getEntityId() {
        return entityId;
    }
}
