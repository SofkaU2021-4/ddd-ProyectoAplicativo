package co.com.sofka.GrupoDeTrabajo.Commands;

import co.com.sofka.GenericVO.Nombre;
import co.com.sofka.GrupoDeTrabajo.Values.IdGrupoDeTrabajo;
import co.com.sofka.domain.generic.Command;

public class CrearGrupoDeTrabajo  extends Command  {
    private final IdGrupoDeTrabajo idGrupoDeTrabajo;
    private final Nombre nombre;

    public CrearGrupoDeTrabajo(IdGrupoDeTrabajo idGrupoDeTrabajo ,Nombre nombre) {
        this.idGrupoDeTrabajo = idGrupoDeTrabajo;
        this.nombre = nombre;
    }

    public IdGrupoDeTrabajo getIdGrupoDeTrabajo() {
        return idGrupoDeTrabajo;
    }

    public Nombre getNombre() {
        return nombre;
    }

}
