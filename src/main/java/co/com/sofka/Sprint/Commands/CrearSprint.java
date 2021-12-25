package co.com.sofka.Sprint.Commands;

import co.com.sofka.GrupoDeTrabajo.Values.IdGrupoDeTrabajo;
import co.com.sofka.Sprint.Values.Descripcion;
import co.com.sofka.Sprint.Values.IdSprint;
import co.com.sofka.domain.generic.Command;

public class CrearSprint extends Command {
    private final IdSprint idSprint;
    private final IdSprint entityId;
    private final Descripcion descripcion;
    private final IdGrupoDeTrabajo grupoDeTrabajoId;

    public CrearSprint(IdSprint idSprint, IdSprint entityId, Descripcion descripcion, IdGrupoDeTrabajo grupoDeTrabajoId) {
        this.idSprint = idSprint;

        this.entityId = entityId;
        this.descripcion = descripcion;
        this.grupoDeTrabajoId = grupoDeTrabajoId;
    }

    public IdSprint getIdSprint() {
        return idSprint;
    }

    public IdSprint getEntityId() {
        return entityId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public IdGrupoDeTrabajo getGrupoDeTrabajoId() {
        return grupoDeTrabajoId;
    }

}
