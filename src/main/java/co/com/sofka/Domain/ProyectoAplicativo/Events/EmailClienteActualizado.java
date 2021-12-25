package co.com.sofka.Domain.ProyectoAplicativo.Events;

import co.com.sofka.GenericVO.Email;
import co.com.sofka.domain.generic.DomainEvent;

public class EmailClienteActualizado extends DomainEvent {
    private final Email email;

    public EmailClienteActualizado(Email email) {
        super( "sofka.ProyectoAplicativo.EmailClienteActualizado");
        this.email = email;
    }

    public Email getEmail() {
        return email;
    }
}
