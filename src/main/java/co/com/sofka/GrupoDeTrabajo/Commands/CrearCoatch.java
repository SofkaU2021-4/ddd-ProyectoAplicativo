package co.com.sofka.GrupoDeTrabajo.Commands;

import co.com.sofka.GenericVO.Celular;
import co.com.sofka.GenericVO.Email;
import co.com.sofka.GenericVO.Identificacion;
import co.com.sofka.GenericVO.Nombre;
import co.com.sofka.GrupoDeTrabajo.Values.AreaDeEspecialidad;
import co.com.sofka.GrupoDeTrabajo.Values.IdCoatch;
import co.com.sofka.domain.generic.Command;

public class CrearCoatch  extends Command  {
    private final IdCoatch entityId;
    private final AreaDeEspecialidad areaDeEspecialidad;
    private final Nombre nombre;
    private final Celular celular;
    private final Identificacion identificacion;
    private final Email email;

    public CrearCoatch(IdCoatch entityId, AreaDeEspecialidad areaDeEspecialidad, Nombre nombre, Celular celular, Identificacion identificacion, Email email) {
        this.entityId = entityId;
        this.areaDeEspecialidad = areaDeEspecialidad;
        this.nombre = nombre;
        this.celular = celular;
        this.identificacion = identificacion;
        this.email = email;
    }

    public IdCoatch getEntityId() {
        return entityId;
    }

    public AreaDeEspecialidad getAreaDeEspecialidad() {
        return areaDeEspecialidad;
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
