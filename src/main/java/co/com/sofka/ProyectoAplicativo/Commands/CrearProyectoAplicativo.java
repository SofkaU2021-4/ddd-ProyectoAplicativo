package co.com.sofka.ProyectoAplicativo.Commands;

import co.com.sofka.ProyectoAplicativo.Values.IdProyectoAplicativo;
import co.com.sofka.ProyectoAplicativo.Values.Presupuesto;
import co.com.sofka.domain.generic.Command;

public class CrearProyectoAplicativo extends Command {
    private final IdProyectoAplicativo idProyectoAplicativo;
    private final Presupuesto presupuesto;

    public CrearProyectoAplicativo(IdProyectoAplicativo idProyectoAplicativo, Presupuesto presupuesto) {
        this.idProyectoAplicativo = idProyectoAplicativo;
        this.presupuesto = presupuesto;
    }

    public Presupuesto getPresupuesto() {
        return presupuesto;
    }

}
