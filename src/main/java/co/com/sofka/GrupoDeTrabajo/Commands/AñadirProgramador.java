package co.com.sofka.GrupoDeTrabajo.Commands;

import co.com.sofka.GenericVO.Celular;
import co.com.sofka.GenericVO.Email;
import co.com.sofka.GenericVO.Identificacion;
import co.com.sofka.GenericVO.Nombre;
import co.com.sofka.GrupoDeTrabajo.Values.IdProgramador;
import co.com.sofka.GrupoDeTrabajo.Values.Rol;
import co.com.sofka.domain.generic.Command;

public class AñadirProgramador extends Command {

    private final IdProgramador entityId;
    private final Rol rol;
    private final Nombre nombre;
    private final Celular celular;
    private final Identificacion identificacion;
    private final Email email;

    public AñadirProgramador(IdProgramador entityId, Rol rol, Nombre nombre, Celular celular, Identificacion identificacion, Email email) {
        this.entityId = entityId;
        this.rol = rol;
        this.nombre = nombre;
        this.celular = celular;
        this.identificacion = identificacion;
        this.email = email;
    }

    public IdProgramador getEntityId() {
        return entityId;
    }

    public Rol getRol() {
        return rol;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Celular getCelular() {
        return celular;
    }

    public Identificacion getIdentificacion() {
        return identificacion;
    }

    public Email getEmail() {
        return email;
    }
}
