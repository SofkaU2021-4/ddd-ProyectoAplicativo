package co.com.sofka.GrupoDeTrabajo.Commands;

import co.com.sofka.GrupoDeTrabajo.Values.IdGrupoDeTrabajo;
import co.com.sofka.GrupoDeTrabajo.Values.IdProgramador;
import co.com.sofka.domain.generic.Command;

public class EliminarProgramador extends Command {

    private final IdGrupoDeTrabajo idGrupoDeTrabajo;
    private final IdProgramador entityId;

    public EliminarProgramador(IdGrupoDeTrabajo idGrupoDeTrabajo ,IdProgramador entityId) {
        this.idGrupoDeTrabajo = idGrupoDeTrabajo;
        this.entityId = entityId;
    }

    public IdGrupoDeTrabajo getIdGrupoDeTrabajo() {
        return idGrupoDeTrabajo;
    }

    public IdProgramador getEntityId() {
        return entityId;
    }
}
