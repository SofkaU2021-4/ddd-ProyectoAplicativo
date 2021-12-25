package co.com.sofka.Domain.GrupoDeTrabajo.Entities;

import co.com.sofka.GenericVO.Celular;
import co.com.sofka.GenericVO.Email;
import co.com.sofka.GenericVO.Identificacion;
import co.com.sofka.GenericVO.Nombre;
import co.com.sofka.Domain.GrupoDeTrabajo.Values.AreaDeEspecialidad;
import co.com.sofka.Domain.GrupoDeTrabajo.Values.IdCoatch;
import co.com.sofka.domain.generic.Entity;


public class Coatch extends Entity<IdCoatch> {

    private  Nombre nombre;
    private  Celular celular;
    private  Identificacion identificacion;
    private  Email email;
    private  AreaDeEspecialidad areaDeEspecialidad;

    public Coatch(IdCoatch entityId , Nombre nombre , Celular celular, Identificacion identificacion , Email email, AreaDeEspecialidad areaDeEspecialidad) {
        super(entityId);
        this.nombre = nombre;
        this.celular = celular;
        this.identificacion = identificacion;
        this.email = email;
        this.areaDeEspecialidad = areaDeEspecialidad;
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

    public Celular celular() {
        return celular;
    }

    public Identificacion identificacion() {
        return identificacion;
    }

    public Email email() {
        return email;
    }

    public AreaDeEspecialidad areaDeEspecialidad() {
        return areaDeEspecialidad;
    }
}
