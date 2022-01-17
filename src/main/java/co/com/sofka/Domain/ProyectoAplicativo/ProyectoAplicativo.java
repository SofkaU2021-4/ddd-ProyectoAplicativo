package co.com.sofka.Domain.ProyectoAplicativo;


import co.com.sofka.Domain.GenericVO.Celular;
import co.com.sofka.Domain.GenericVO.Email;
import co.com.sofka.Domain.GenericVO.Identificacion;
import co.com.sofka.Domain.GenericVO.Nombre;
import co.com.sofka.Domain.GrupoDeTrabajo.Values.IdGrupoDeTrabajo;
import co.com.sofka.Domain.ProyectoAplicativo.Entities.Cliente;
import co.com.sofka.Domain.ProyectoAplicativo.Entities.LiderProyecto;
import co.com.sofka.Domain.ProyectoAplicativo.Entities.Supervisor;
import co.com.sofka.Domain.ProyectoAplicativo.Events.*;
import co.com.sofka.Domain.ProyectoAplicativo.Values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class ProyectoAplicativo extends AggregateEvent<IdProyectoAplicativo> {

    protected LiderProyecto liderProyecto;
    protected Presupuesto presupuesto;
    protected FechaInicio fechaInicio;
    protected Set<IdGrupoDeTrabajo> calendario;
    protected Cliente cliente;
    protected Supervisor supervisor;
    protected FechaFinalizacion fechaFinalizacion;


    public ProyectoAplicativo(IdProyectoAplicativo entityId,Presupuesto presupuesto) {
        super(entityId);
        this.presupuesto = presupuesto;
        appendChange(new ProyectoAplicativoCreado(presupuesto)).apply();
    }

    public ProyectoAplicativo(IdProyectoAplicativo entityId ){
        super(entityId);
        subscribe(new ProyectoAplicativoChange(this));
    }
    public static ProyectoAplicativo from(IdProyectoAplicativo papeleriaId, List<DomainEvent> events){
        var proyectoAplicativo = new ProyectoAplicativo(papeleriaId);
        events.forEach(proyectoAplicativo::applyEvent);
        return proyectoAplicativo;
    }


    public void CrearLiderProyecto(IdLiderProyecto entityId, Nombre nombre , Identificacion identificacion , Email email , Celular celular){
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(identificacion);
        Objects.requireNonNull(email);
        Objects.requireNonNull(celular);

        appendChange(new LiderProyectoCreado(entityId,nombre,identificacion,email,celular)).apply();

    }

    public void CrearCliente(IdClienteId entityId, RazonSocial razonSocial , NIT nit , Email email , Celular celular){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(razonSocial);
        Objects.requireNonNull(nit);
        Objects.requireNonNull(email);
        Objects.requireNonNull(celular);

        appendChange(new ClienteCreado(entityId,razonSocial,nit,email,celular)).apply();

    }

    public void CrearSupervisor(IdSupervisor entityId, Nombre nombre , Identificacion identificacion , Email email , Celular celular){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(identificacion);
        Objects.requireNonNull(email);
        Objects.requireNonNull(celular);

        appendChange(new SupervisorCreado(entityId,nombre,identificacion,email,celular)).apply();

    }

    public void ActualizarEmailLider(Email email){

        Objects.requireNonNull(email);
        appendChange(new EmailLiderActualizado(email)).apply();
    }

    public void ActualizarEmailCliente(Email email){

        Objects.requireNonNull(email);
        appendChange(new EmailClienteActualizado(email)).apply();
    }

    public void ActualizarEmailSupervisor(Email email){

        Objects.requireNonNull(email);
        appendChange(new EmailSupervisorActualizado(email)).apply();
    }

    public void ActualizarCelularLiderProyecto(Celular celular){

        Objects.requireNonNull(celular);
        appendChange(new CelularLiderProyectoActualizado(celular)).apply();
    }

    public void ActualizarCelularSupervisor(Celular celular){

        Objects.requireNonNull(celular);
        appendChange(new CelularSupervisorActualizado(celular)).apply();
    }

    public void ActualizarCelularCliente(Celular celular){

        Objects.requireNonNull(celular);
        appendChange(new CelularClienteActualizado(celular)).apply();
    }

    public LiderProyecto liderProyecto() {
        return liderProyecto;
    }

    public Presupuesto presupuesto() {
        return presupuesto;
    }

    public FechaInicio fechaInicio() {
        return fechaInicio;
    }

    public Set<IdGrupoDeTrabajo> calendario() {
        return calendario;
    }

    public Cliente cliente() {
        return cliente;
    }

    public Supervisor supervisor() {
        return supervisor;
    }

    public FechaFinalizacion fechaFinalizacion() {
        return fechaFinalizacion;
    }
}
