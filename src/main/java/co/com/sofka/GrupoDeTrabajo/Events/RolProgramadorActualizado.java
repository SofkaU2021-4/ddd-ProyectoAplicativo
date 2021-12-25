package co.com.sofka.GrupoDeTrabajo.Events;

import co.com.sofka.GrupoDeTrabajo.Values.IdProgramador;
import co.com.sofka.GrupoDeTrabajo.Values.Rol;
import co.com.sofka.domain.generic.DomainEvent;

public class RolProgramadorActualizado extends DomainEvent {
    private final IdProgramador entityId;
    private final Rol rol;

    public RolProgramadorActualizado(IdProgramador entityId, Rol rol) {
        super("sofka.Sprint.RolProgramadorActualizado");
        this.entityId = entityId;
        this.rol = rol;
    }

    public IdProgramador getEntityId() {
        return entityId;
    }

    public Rol getRol() {
        return rol;
    }
}
