package co.com.sofka.Domain.GrupoDeTrabajo.Events;

import co.com.sofka.GenericVO.Email;
import co.com.sofka.Domain.GrupoDeTrabajo.Values.IdLiderGrupoTrabajo;
import co.com.sofka.domain.generic.DomainEvent;

public class EmailCoatchActualizado extends DomainEvent {
    private final IdLiderGrupoTrabajo entityId;
    private final Email email;

    public EmailCoatchActualizado(IdLiderGrupoTrabajo entityId, Email email) {
        super("sofka.Sprint.EmailCoatchActualizado");
        this.entityId = entityId;
        this.email = email;
    }

    public IdLiderGrupoTrabajo getEntityId() {
        return entityId;
    }

    public Email getEmail() {
        return email;
    }
}
