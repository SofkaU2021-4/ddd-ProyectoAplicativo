package co.com.sofka.GrupoDeTrabajo.Commands;

import co.com.sofka.GenericVO.Email;
import co.com.sofka.GrupoDeTrabajo.Values.IdGrupoDeTrabajo;
import co.com.sofka.GrupoDeTrabajo.Values.IdLiderGrupoTrabajo;
import co.com.sofka.domain.generic.Command;

public class ActualizarEmailCoatch extends Command {

    private final IdGrupoDeTrabajo idGrupoDeTrabajo;
    private final IdLiderGrupoTrabajo entityId;
    private final Email email;

    public ActualizarEmailCoatch(IdGrupoDeTrabajo idGrupoDeTrabajo , IdLiderGrupoTrabajo entityId, Email email) {
        this.idGrupoDeTrabajo = idGrupoDeTrabajo;
        this.entityId = entityId;
        this.email = email;
    }

    public IdGrupoDeTrabajo getIdGrupoDeTrabajo() {
        return idGrupoDeTrabajo;
    }

    public IdLiderGrupoTrabajo getEntityId() {
        return entityId;
    }

    public Email getEmail() {
        return email;
    }
}
