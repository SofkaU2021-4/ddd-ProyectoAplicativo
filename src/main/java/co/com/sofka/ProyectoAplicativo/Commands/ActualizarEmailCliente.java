package co.com.sofka.ProyectoAplicativo.Commands;

import co.com.sofka.GenericVO.Email;
import co.com.sofka.ProyectoAplicativo.Values.IdProyectoAplicativo;
import co.com.sofka.domain.generic.Command;

public class ActualizarEmailCliente extends Command {

    private final IdProyectoAplicativo idProyectoAplicativo;
    private final Email email;

    public ActualizarEmailCliente(IdProyectoAplicativo idProyectoAplicativo , Email email) {
        this.idProyectoAplicativo = idProyectoAplicativo;
        this.email = email;
    }

    public Email getEmail() {
        return email;
    }
}
