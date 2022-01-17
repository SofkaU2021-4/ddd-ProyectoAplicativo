package co.com.sofka.Domain.ProyectoAplicativo.Events;

import co.com.sofka.Domain.GenericVO.Email;
import co.com.sofka.domain.generic.DomainEvent;

public class EmailLiderActualizado extends DomainEvent {
    private final Email email;

    public EmailLiderActualizado(Email email) {
        super("sofka.ProyectoAplicativo.EmailLiderActualizado");
        this.email = email;
    }

    public Email getEmail() {
        return email;
    }
}
