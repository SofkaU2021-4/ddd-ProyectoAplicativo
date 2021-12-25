package co.com.sofka.Sprint.Events;

import co.com.sofka.GrupoDeTrabajo.Values.IdGrupoDeTrabajo;
import co.com.sofka.Sprint.Values.Descripcion;
import co.com.sofka.Sprint.Values.IdSprint;
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
