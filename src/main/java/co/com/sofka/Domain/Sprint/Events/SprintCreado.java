package co.com.sofka.Domain.Sprint.Events;

import co.com.sofka.Domain.GrupoDeTrabajo.Values.IdGrupoDeTrabajo;
import co.com.sofka.Domain.Sprint.Values.Descripcion;
import co.com.sofka.Domain.Sprint.Values.IdSprint;
import co.com.sofka.domain.generic.DomainEvent;

public class SprintCreado extends DomainEvent {
    private final IdSprint entityId;
    private final Descripcion descripcion;
    private final IdGrupoDeTrabajo grupoDeTrabajoId;

    public SprintCreado(IdSprint entityId, Descripcion descripcion, IdGrupoDeTrabajo grupoDeTrabajoId) {
        super("sofka.GrupoDeTrabajo.SpintCreado");
        this.entityId = entityId;
        this.descripcion = descripcion;
        this.grupoDeTrabajoId = grupoDeTrabajoId;
    }

    public IdSprint getEntityId() {
        return entityId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public IdGrupoDeTrabajo getGrupoDeTrabajoId() {
        return grupoDeTrabajoId;
    }


}
