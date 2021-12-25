package co.com.sofka.ProyectoAplicativo.Events;

import co.com.sofka.GenericVO.Email;
import co.com.sofka.domain.generic.DomainEvent;

public class EmailSupervisorActualizado extends DomainEvent {
    private final Email email;

    public EmailSupervisorActualizado(Email email) {
        super("sofka.ProyectoAplicativo.EmailSupervisorActualizado");
        this.email = email;
    }

    public Email getEmail() {
        return email;
    }
}
