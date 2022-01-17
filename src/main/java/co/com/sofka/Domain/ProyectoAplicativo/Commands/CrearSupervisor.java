package co.com.sofka.Domain.ProyectoAplicativo.Commands;

import co.com.sofka.Domain.GenericVO.Celular;
import co.com.sofka.Domain.GenericVO.Email;
import co.com.sofka.Domain.GenericVO.Identificacion;
import co.com.sofka.Domain.GenericVO.Nombre;
import co.com.sofka.Domain.ProyectoAplicativo.Values.IdProyectoAplicativo;
import co.com.sofka.Domain.ProyectoAplicativo.Values.IdSupervisor;
import co.com.sofka.domain.generic.Command;

public class CrearSupervisor extends Command {
    private final IdProyectoAplicativo idProyectoAplicativo;
    private final IdSupervisor entityId;
    private final Nombre nombre;
    private final Identificacion identificacion;
    private final Email email;
    private final Celular celular;

    public CrearSupervisor(IdProyectoAplicativo idProyectoAplicativo ,IdSupervisor entityId, Nombre nombre, Identificacion identificacion, Email email, Celular celular) {
        this.idProyectoAplicativo = idProyectoAplicativo;

        this.entityId = entityId;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.email = email;
        this.celular = celular;
    }

    public IdProyectoAplicativo getIdProyectoAplicativo() {
        return idProyectoAplicativo;
    }

    public IdSupervisor getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Identificacion getIdentificacion() {
        return identificacion;
    }

    public Email getEmail() {
        return email;
    }

    public Celular getCelular() {
        return celular;
    }

}
