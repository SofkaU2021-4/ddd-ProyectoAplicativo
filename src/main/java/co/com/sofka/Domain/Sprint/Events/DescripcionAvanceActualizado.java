package co.com.sofka.Domain.Sprint.Events;

import co.com.sofka.Domain.Sprint.Values.Descripcion;
import co.com.sofka.Domain.Sprint.Values.IdAvance;
import co.com.sofka.domain.generic.DomainEvent;

public class DescripcionAvanceActualizado extends DomainEvent {
    private final IdAvance entityId;
    private final Descripcion descripcion;

    public DescripcionAvanceActualizado(IdAvance entityId, Descripcion descripcion) {
        super("sofka.GrupoDeTrabajo.DescripcionAvanceActualizado" );
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
