package co.com.sofka.Domain.Sprint.Events;

import co.com.sofka.Domain.Sprint.Values.IdTarea;
import co.com.sofka.domain.generic.DomainEvent;

public class TareaEliminada extends DomainEvent {
    private final IdTarea entityId;

    public TareaEliminada(IdTarea entityId) {
        super("sofka.GrupoDeTrabajo.TareaEliminada");
        this.entityId = entityId;
    }

    public IdTarea getEntityId() {
        return entityId;
    }
}
