package co.com.sofka.ProyectoAplicativo.Commands;

import co.com.sofka.GenericVO.Celular;
import co.com.sofka.ProyectoAplicativo.Values.IdProyectoAplicativo;
import co.com.sofka.domain.generic.Command;

public class ActualizarCelularCliente extends Command {

    private final IdProyectoAplicativo idProyectoAplicativo;
    private final Celular celular;

    public ActualizarCelularCliente(IdProyectoAplicativo idProyectoAplicativo, Celular celular) {
        this.idProyectoAplicativo = idProyectoAplicativo;
        this.celular = celular;
    }

    public IdProyectoAplicativo getIdProyectoAplicativo() {
        return idProyectoAplicativo;
    }

    public Celular getCelular() {
        return celular;
    }
}
