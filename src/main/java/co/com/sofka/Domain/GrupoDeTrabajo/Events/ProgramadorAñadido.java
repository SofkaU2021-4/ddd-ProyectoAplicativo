package co.com.sofka.Domain.GrupoDeTrabajo.Events;

import co.com.sofka.GenericVO.Celular;
import co.com.sofka.GenericVO.Email;
import co.com.sofka.GenericVO.Identificacion;
import co.com.sofka.GenericVO.Nombre;
import co.com.sofka.Domain.GrupoDeTrabajo.Values.IdProgramador;
import co.com.sofka.Domain.GrupoDeTrabajo.Values.Rol;
import co.com.sofka.domain.generic.DomainEvent;

public class ProgramadorAñadido extends DomainEvent {
    private final IdProgramador entityId;
    private final Rol rol;
    private final Nombre nombre;
    private final Celular celular;
    private final Identificacion identificacion;
    private final Email email;

    public ProgramadorAñadido(IdProgramador entityId, Rol rol, Nombre nombre, Celular celular, Identificacion identificacion, Email email) {
        super("sofka.Sprint.ProgramadorAñadido");
        this.entityId = entityId;
        this.rol = rol;
        this.nombre = nombre;
        this.celular = celular;
        this.identificacion = identificacion;
        this.email = email;
    }

    public IdProgramador getEntityId() {
        return entityId;
    }

    public Rol getRol() {
        return rol;
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
