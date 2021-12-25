package co.com.sofka.Domain.Sprint.Events;

import co.com.sofka.Domain.Sprint.Values.IdObjetivo;
import co.com.sofka.domain.generic.DomainEvent;

public class ObjetivoEliminado extends DomainEvent {
    private final IdObjetivo entityId;

    public ObjetivoEliminado(IdObjetivo entityId) {
        super("sofka.GrupoDeTrabajo.ObjetivoEliminado");
        this.entityId = entityId;
    }

    public IdObjetivo getEntityId() {
        return entityId;
    }
}
