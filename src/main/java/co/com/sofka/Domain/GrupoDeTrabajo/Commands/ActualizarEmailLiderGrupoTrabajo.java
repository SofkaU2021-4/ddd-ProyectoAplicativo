package co.com.sofka.Domain.GrupoDeTrabajo.Commands;

import co.com.sofka.Domain.GenericVO.Email;
import co.com.sofka.Domain.GrupoDeTrabajo.Values.IdGrupoDeTrabajo;
import co.com.sofka.Domain.GrupoDeTrabajo.Values.IdLiderGrupoTrabajo;
import co.com.sofka.domain.generic.Command;

public class ActualizarEmailLiderGrupoTrabajo extends Command {

    private final IdGrupoDeTrabajo idGrupoDeTrabajo;
    private final IdLiderGrupoTrabajo entityId;
    private final Email email;

    public ActualizarEmailLiderGrupoTrabajo(IdGrupoDeTrabajo idGrupoDeTrabajo ,IdLiderGrupoTrabajo entityId, Email email) {
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
