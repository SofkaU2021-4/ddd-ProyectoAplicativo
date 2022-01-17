package co.com.sofka.Domain.ProyectoAplicativo.Entities;

import co.com.sofka.Domain.GenericVO.Celular;
import co.com.sofka.Domain.GenericVO.Email;
import co.com.sofka.Domain.ProyectoAplicativo.Values.IdClienteId;
import co.com.sofka.Domain.ProyectoAplicativo.Values.NIT;
import co.com.sofka.Domain.ProyectoAplicativo.Values.RazonSocial;
import co.com.sofka.domain.generic.Entity;

public class Cliente extends Entity<IdClienteId> {

    private  RazonSocial razonSocial;
    private  NIT nit;
    private  Email email;
    private  Celular celular;

    public Cliente(IdClienteId entityId, RazonSocial razonSocial , NIT nit , Email email , Celular celular) {
        super(entityId);
        this.razonSocial = razonSocial;
        this.nit = nit;
        this.email = email;
        this.celular = celular;
    }

    public void ActualizarCelular(Celular celular){
        this.celular=celular;
    }

    public void ActualizarEmail(Email email){
        this.celular=celular;
    }


    public RazonSocial razonSocial() {
        return razonSocial;
    }

    public NIT nit() {
        return nit;
    }

    public Email email() {
        return email;
    }

    public Celular celular() {
        return celular;
    }

    public void ActualizarCorreo(Email email){
        this.email=email;
    }
}
