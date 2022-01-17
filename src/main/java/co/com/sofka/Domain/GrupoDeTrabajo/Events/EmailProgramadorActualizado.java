package co.com.sofka.Domain.GrupoDeTrabajo.Events;

import co.com.sofka.Domain.GenericVO.Email;
import co.com.sofka.Domain.GrupoDeTrabajo.Values.IdProgramador;
import co.com.sofka.domain.generic.DomainEvent;

public class EmailProgramadorActualizado extends DomainEvent {
    private final IdProgramador entityId;
    private final Email email;

    public EmailProgramadorActualizado(IdProgramador entityId, Email email) {
        super("sofka.Sprint.EmailProgramadorActualizado");
        this.entityId = entityId;
        this.email = email;
    }

    public IdProgramador getEntityId() {
        return entityId;
    }

    public Email getEmail() {
        return email;
    }
}
