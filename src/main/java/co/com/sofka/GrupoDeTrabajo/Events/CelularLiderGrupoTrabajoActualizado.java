package co.com.sofka.GrupoDeTrabajo.Events;

import co.com.sofka.GenericVO.Celular;
import co.com.sofka.GrupoDeTrabajo.Values.IdProgramador;
import co.com.sofka.domain.generic.DomainEvent;

public class CelularLiderGrupoTrabajoActualizado extends DomainEvent {
    private final IdProgramador entityId;
    private final Celular celular;

    public CelularLiderGrupoTrabajoActualizado(IdProgramador entityId, Celular celular) {
        super("sofka.Sprint.CelularLiderGrupoTrabajoActualizado");
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
