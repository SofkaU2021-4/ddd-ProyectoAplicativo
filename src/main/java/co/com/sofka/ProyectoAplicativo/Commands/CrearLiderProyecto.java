package co.com.sofka.ProyectoAplicativo.Commands;

import co.com.sofka.GenericVO.Celular;
import co.com.sofka.GenericVO.Email;
import co.com.sofka.GenericVO.Identificacion;
import co.com.sofka.GenericVO.Nombre;
import co.com.sofka.ProyectoAplicativo.Values.IdLiderProyecto;
import co.com.sofka.ProyectoAplicativo.Values.IdProyectoAplicativo;
import co.com.sofka.domain.generic.Command;

public class CrearLiderProyecto extends Command {


    private final IdProyectoAplicativo idProyectoAplicativo;
    private final IdLiderProyecto entityId;
    private final Nombre nombre;
    private final Identificacion identificacion;
    private final Email email;
    private final Celular celular;

    public CrearLiderProyecto(IdProyectoAplicativo idProyectoAplicativo , IdLiderProyecto entityId, Nombre nombre, Identificacion identificacion, Email email, Celular celular) {
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

    public IdLiderProyecto getEntityId() {
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
