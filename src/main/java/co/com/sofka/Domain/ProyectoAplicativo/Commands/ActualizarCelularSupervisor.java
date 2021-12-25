package co.com.sofka.Domain.ProyectoAplicativo.Commands;

import co.com.sofka.GenericVO.Celular;
import co.com.sofka.Domain.ProyectoAplicativo.Values.IdProyectoAplicativo;
import co.com.sofka.domain.generic.Command;

public class ActualizarCelularSupervisor extends Command {

    private final IdProyectoAplicativo idProyectoAplicativo;
    private final Celular celular;

    public ActualizarCelularSupervisor(IdProyectoAplicativo idProyectoAplicativo ,Celular celular) {
        this.idProyectoAplicativo = idProyectoAplicativo;
        this.celular = celular;
    }

    public Celular getCelular() {
        return celular;
    }
}
