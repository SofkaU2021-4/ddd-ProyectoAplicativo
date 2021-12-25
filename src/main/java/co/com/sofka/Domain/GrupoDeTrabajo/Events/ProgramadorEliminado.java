package co.com.sofka.Domain.GrupoDeTrabajo.Events;

import co.com.sofka.Domain.GrupoDeTrabajo.Values.IdProgramador;
import co.com.sofka.domain.generic.DomainEvent;

public class ProgramadorEliminado extends DomainEvent {
    private final IdProgramador entityId;

    public ProgramadorEliminado(IdProgramador entityId) {
        super( "sofka.Sprint.ProgramadorEliminado");
        this.entityId = entityId;
    }

    public IdProgramador getEntityId() {
        return entityId;
    }
}
