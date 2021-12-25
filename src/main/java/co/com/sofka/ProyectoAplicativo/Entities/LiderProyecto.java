package co.com.sofka.ProyectoAplicativo.Entities;

import co.com.sofka.GenericVO.Celular;
import co.com.sofka.GenericVO.Email;
import co.com.sofka.GenericVO.Identificacion;
import co.com.sofka.GenericVO.Nombre;
import co.com.sofka.ProyectoAplicativo.Values.IdLiderProyecto;
import co.com.sofka.domain.generic.Entity;

public class LiderProyecto extends Entity<IdLiderProyecto> {
    private  Nombre nombre;
    private  Identificacion identificacion;
    private  Email email;
    private  Celular celular;

    public LiderProyecto(IdLiderProyecto entityId, Nombre nombre, Identificacion identificacion, Email email, Celular celular) {
        super(entityId);
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.email = email;
        this.celular = celular;
    }

    public void ActualizarCelular(Celular celular){
        this.celular=celular;
    }

    public void ActualizarEmail(Email email){
        this.email=email;
    }

    public Nombre nombre() {
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
