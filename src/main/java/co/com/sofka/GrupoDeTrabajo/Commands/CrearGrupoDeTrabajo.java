package co.com.sofka.GrupoDeTrabajo.Commands;

import co.com.sofka.GenericVO.Nombre;
import co.com.sofka.domain.generic.Command;

public class CrearGrupoDeTrabajo  extends Command  {
    private final Nombre nombre;

    public CrearGrupoDeTrabajo(Nombre nombre) {
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }

}
