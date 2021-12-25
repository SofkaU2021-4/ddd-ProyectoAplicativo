package co.com.sofka.Sprint.Events;

import co.com.sofka.Sprint.Values.IdAvance;
import co.com.sofka.domain.generic.DomainEvent;

public class AvanceEliminada extends DomainEvent {
    private final IdAvance entityId;

    public AvanceEliminada(IdAvance entityId) {
        super("sofka.GrupoDeTrabajo.AvanceEliminada");
        this.entityId = entityId;
    }

    public IdAvance getEntityId() {
        return entityId;
    }
}
