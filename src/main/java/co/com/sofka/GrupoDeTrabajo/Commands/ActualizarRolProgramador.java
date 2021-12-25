package co.com.sofka.GrupoDeTrabajo.Commands;

import co.com.sofka.GrupoDeTrabajo.Values.IdGrupoDeTrabajo;
import co.com.sofka.GrupoDeTrabajo.Values.IdProgramador;
import co.com.sofka.GrupoDeTrabajo.Values.Rol;
import co.com.sofka.domain.generic.Command;

public class ActualizarRolProgramador extends Command {
    private final IdGrupoDeTrabajo idGrupoDeTrabajo;
    private final IdProgramador entityId;
    private final Rol rol;

    public ActualizarRolProgramador(IdGrupoDeTrabajo idGrupoDeTrabajo ,IdProgramador entityId, Rol rol) {
        this.idGrupoDeTrabajo = idGrupoDeTrabajo;
        this.entityId = entityId;
        this.rol = rol;
    }

    public IdGrupoDeTrabajo getIdGrupoDeTrabajo() {
        return idGrupoDeTrabajo;
    }

    public IdProgramador getEntityId() {
        return entityId;
    }

    public Rol getRol() {
        return rol;
    }
}
