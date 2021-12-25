package co.com.sofka.Domain.GrupoDeTrabajo.Commands;

import co.com.sofka.GenericVO.Celular;
import co.com.sofka.Domain.GrupoDeTrabajo.Values.IdGrupoDeTrabajo;
import co.com.sofka.Domain.GrupoDeTrabajo.Values.IdProgramador;
import co.com.sofka.domain.generic.Command;

public class ActualizarCelularLiderGrupoTrabajo extends Command {

    private final IdGrupoDeTrabajo idGrupoDeTrabajo;
    private final IdProgramador entityId;
    private final Celular celular;

    public ActualizarCelularLiderGrupoTrabajo(IdGrupoDeTrabajo idGrupoDeTrabajo ,IdProgramador entityId, Celular celular) {
        this.idGrupoDeTrabajo = idGrupoDeTrabajo;
        this.entityId = entityId;
        this.celular = celular;
    }

    public IdGrupoDeTrabajo getIdGrupoDeTrabajo() {
        return idGrupoDeTrabajo;
    }

    public IdProgramador getEntityId() {
        return entityId;
    }

    public Celular getCelular() {
        return celular;
    }
}
