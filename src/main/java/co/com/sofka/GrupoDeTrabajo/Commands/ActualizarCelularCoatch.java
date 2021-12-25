package co.com.sofka.GrupoDeTrabajo.Commands;

import co.com.sofka.GenericVO.Celular;
import co.com.sofka.GrupoDeTrabajo.Values.IdGrupoDeTrabajo;
import co.com.sofka.GrupoDeTrabajo.Values.IdProgramador;
import co.com.sofka.domain.generic.Command;

public class ActualizarCelularCoatch extends Command {
    private final IdGrupoDeTrabajo idGrupoDeTrabajo;
    private IdProgramador entityId;
    private Celular celular;

    public ActualizarCelularCoatch(IdGrupoDeTrabajo idGrupoDeTrabajo , IdProgramador entityId, Celular celular) {
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
