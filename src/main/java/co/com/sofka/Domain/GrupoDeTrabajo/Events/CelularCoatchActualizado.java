package co.com.sofka.Domain.GrupoDeTrabajo.Events;

import co.com.sofka.GenericVO.Celular;
import co.com.sofka.Domain.GrupoDeTrabajo.Values.IdProgramador;
import co.com.sofka.domain.generic.DomainEvent;

public class CelularCoatchActualizado extends DomainEvent {
    private IdProgramador entityId;
    private Celular celular;

    public CelularCoatchActualizado(IdProgramador entityId, Celular celular) {
        super("sofka.Sprint.CelularCoatchActualizado"  );
        this.entityId = entityId;
        this.celular = celular;
    }

    public IdProgramador getEntityId() {
        return entityId;
    }

    public Celular getCelular() {
        return celular;
    }
}
