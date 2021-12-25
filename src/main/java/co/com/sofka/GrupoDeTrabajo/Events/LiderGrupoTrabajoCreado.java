package co.com.sofka.GrupoDeTrabajo.Events;

import co.com.sofka.GenericVO.Celular;
import co.com.sofka.GenericVO.Email;
import co.com.sofka.GenericVO.Identificacion;
import co.com.sofka.GenericVO.Nombre;
import co.com.sofka.GrupoDeTrabajo.Values.IdLiderGrupoTrabajo;
import co.com.sofka.domain.generic.DomainEvent;

public class LiderGrupoTrabajoCreado extends DomainEvent {
    private final IdLiderGrupoTrabajo entityId;
    private final Nombre nombre;
    private final Celular celular;
    private final Identificacion identificacion;
    private final Email email;

    public LiderGrupoTrabajoCreado(IdLiderGrupoTrabajo entityId, Nombre nombre, Celular celular, Identificacion identificacion, Email email) {
        super( "sofka.Sprint.LiderGrupoTrabajoCreado");
        this.entityId = entityId;
        this.nombre = nombre;
        this.celular = celular;
        this.identificacion = identificacion;
        this.email = email;
    }

    public IdLiderGrupoTrabajo getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Celular getCelular() {
        return celular;
    }

    public Identificacion getIdentificacion() {
        return identificacion;
    }

    public Email getEmail() {
        return email;
    }
}
