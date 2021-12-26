package co.com.sofka.Domain.Sprint.Commands;

import co.com.sofka.Domain.GrupoDeTrabajo.Values.IdGrupoDeTrabajo;
import co.com.sofka.Domain.Sprint.Values.Descripcion;
import co.com.sofka.Domain.Sprint.Values.IdSprint;
import co.com.sofka.domain.generic.Command;

public class CrearSprint extends Command {
    private final IdSprint idSprint;

    private final Descripcion descripcion;
    private final IdGrupoDeTrabajo grupoDeTrabajoId;

    public CrearSprint(IdSprint idSprint, Descripcion descripcion, IdGrupoDeTrabajo grupoDeTrabajoId) {
        this.idSprint = idSprint;


        this.descripcion = descripcion;
        this.grupoDeTrabajoId = grupoDeTrabajoId;
    }

    public IdSprint getIdSprint() {
        return idSprint;
    }


    public Descripcion getDescripcion() {
        return descripcion;
    }

    public IdGrupoDeTrabajo getGrupoDeTrabajoId() {
        return grupoDeTrabajoId;
    }

}
