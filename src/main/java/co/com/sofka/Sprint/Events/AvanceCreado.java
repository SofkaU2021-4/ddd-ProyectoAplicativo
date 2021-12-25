package co.com.sofka.Sprint.Events;

import co.com.sofka.Sprint.Values.Descripcion;
import co.com.sofka.Sprint.Values.IdAvance;
import co.com.sofka.domain.generic.DomainEvent;

public class AvanceCreado extends DomainEvent {
    private final IdAvance entityId;
    private final Descripcion descripcion;

    public AvanceCreado(IdAvance entityId, Descripcion descripcion) {
        super("sofka.GrupoDeTrabajo.AvanceCreado");
        this.entityId = entityId;
        this.descripcion = descripcion;
    }

    public IdAvance getEntityId() {
        return entityId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
