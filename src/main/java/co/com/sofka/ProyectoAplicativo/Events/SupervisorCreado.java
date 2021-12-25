package co.com.sofka.ProyectoAplicativo.Events;

import co.com.sofka.GenericVO.Celular;
import co.com.sofka.GenericVO.Email;
import co.com.sofka.GenericVO.Identificacion;
import co.com.sofka.GenericVO.Nombre;
import co.com.sofka.ProyectoAplicativo.Values.IdSupervisor;
import co.com.sofka.domain.generic.DomainEvent;

public class SupervisorCreado extends DomainEvent {
    private final IdSupervisor entityId;
    private final Nombre nombre;
    private final Identificacion identificacion;
    private final Email email;
    private final Celular celular;

    public SupervisorCreado(IdSupervisor entityId, Nombre nombre, Identificacion identificacion, Email email, Celular celular) {
        super("sofka.ProyectoAplicativo.CrearSupervisor");
        this.entityId = entityId;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.email = email;
        this.celular = celular;
    }

    public IdSupervisor getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Identificacion getIdentificacion() {
        return identificacion;
    }

    public Email getEmail() {
        return email;
    }

    public Celular getCelular() {
        return celular;
    }
}
