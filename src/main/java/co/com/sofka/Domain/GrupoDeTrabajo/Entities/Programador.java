package co.com.sofka.Domain.GrupoDeTrabajo.Entities;

import co.com.sofka.Domain.GenericVO.Celular;
import co.com.sofka.Domain.GenericVO.Email;
import co.com.sofka.Domain.GenericVO.Identificacion;
import co.com.sofka.Domain.GenericVO.Nombre;
import co.com.sofka.Domain.GrupoDeTrabajo.Values.IdProgramador;
import co.com.sofka.Domain.GrupoDeTrabajo.Values.Rol;
import co.com.sofka.domain.generic.Entity;


public class Programador extends Entity<IdProgramador> {

    private Rol rol;
    private Nombre nombre;
    private Celular celular;
    private Identificacion identificacion;
    private Email email;

    public Programador(IdProgramador entityId, Rol rol , Nombre nombre, Celular celular, Identificacion identificacion, Email email) {
        super(entityId);
        this.rol = rol;
        this.nombre = nombre;
        this.celular = celular;
        this.identificacion = identificacion;
        this.email = email;
    }

    public void ActualizarCelular(Celular celular){
        this.celular = celular;
    }

    public void ActualizarEmail(Email email){
        this.email = email;
    }
    public void ActualizarRol(Rol rol){
        this.rol = rol;
    }

    public Rol rol() {
        return rol;
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
}
