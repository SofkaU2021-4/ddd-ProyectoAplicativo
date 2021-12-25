package co.com.sofka.GrupoDeTrabajo.Entities;

import co.com.sofka.GenericVO.Celular;
import co.com.sofka.GenericVO.Email;
import co.com.sofka.GenericVO.Identificacion;
import co.com.sofka.GenericVO.Nombre;

import co.com.sofka.GrupoDeTrabajo.Values.IdLiderGrupoTrabajo;
import co.com.sofka.domain.generic.Entity;


public class LiderGrupoTrabajo extends Entity<IdLiderGrupoTrabajo> {


    private  Nombre nombre;
    private Identificacion identificacion;
    private Email email;
    private Celular celular;

    public LiderGrupoTrabajo(IdLiderGrupoTrabajo entityId , Nombre nombre , Identificacion identificacion, Email email, Celular celular) {
        super(entityId);
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.email = email;
        this.celular = celular;
    }


    public void ActualizarCelular(Celular celular){
        this.celular = celular;
    }

    public void ActualizarEmail(Email email){
        this.email = email;
    }

    public Nombre nombre() {
        return nombre;
    }

    public Identificacion identificacion() {
        return identificacion;
    }

    public Email email() {
        return email;
    }

    public Celular celular() {
        return celular;
    }
}
