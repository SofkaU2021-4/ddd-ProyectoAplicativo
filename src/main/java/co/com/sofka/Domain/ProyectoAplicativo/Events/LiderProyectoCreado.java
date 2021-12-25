package co.com.sofka.Domain.ProyectoAplicativo.Events;

import co.com.sofka.GenericVO.Celular;
import co.com.sofka.GenericVO.Email;
import co.com.sofka.GenericVO.Identificacion;
import co.com.sofka.GenericVO.Nombre;
import co.com.sofka.Domain.ProyectoAplicativo.Values.IdLiderProyecto;
import co.com.sofka.domain.generic.DomainEvent;

public class LiderProyectoCreado extends DomainEvent {
    private final IdLiderProyecto entityId;
    private final Nombre nombre;
    private final Identificacion identificacion;
    private final Email email;
    private final Celular celular;

    public LiderProyectoCreado(IdLiderProyecto entityId, Nombre nombre, Identificacion identificacion, Email email, Celular celular) {
        super("sofka.ProyectoAplicativo.ProyectoAplicativoCreado");
        this.entityId = entityId;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.email = email;
        this.celular = celular;
    }

    public IdLiderProyecto getEntityId() {
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
