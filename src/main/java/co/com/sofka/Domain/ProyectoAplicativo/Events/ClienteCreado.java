package co.com.sofka.Domain.ProyectoAplicativo.Events;

import co.com.sofka.Domain.GenericVO.Celular;
import co.com.sofka.Domain.GenericVO.Email;
import co.com.sofka.Domain.ProyectoAplicativo.Values.IdClienteId;
import co.com.sofka.Domain.ProyectoAplicativo.Values.NIT;
import co.com.sofka.Domain.ProyectoAplicativo.Values.RazonSocial;
import co.com.sofka.domain.generic.DomainEvent;

public class ClienteCreado extends DomainEvent {
    private final IdClienteId entityId;
    private final RazonSocial razonSocial;
    private final NIT nit;
    private final Email email;
    private final Celular celular;

    public ClienteCreado(IdClienteId entityId, RazonSocial razonSocial, NIT nit, Email email, Celular celular) {
        super("sofka.ProyectoAplicativo.ClienteCreado");
        this.entityId = entityId;
        this.razonSocial = razonSocial;
        this.nit = nit;
        this.email = email;
        this.celular = celular;
    }

    public IdClienteId getEntityId() {
        return entityId;
    }

    public RazonSocial getRazonSocial() {
        return razonSocial;
    }

    public NIT getNit() {
        return nit;
    }

    public Email getEmail() {
        return email;
    }

    public Celular getCelular() {
        return celular;
    }
}
