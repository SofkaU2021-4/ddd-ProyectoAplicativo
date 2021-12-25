package co.com.sofka.Domain.GrupoDeTrabajo;

import co.com.sofka.GenericVO.Celular;
import co.com.sofka.GenericVO.Email;
import co.com.sofka.GenericVO.Identificacion;
import co.com.sofka.GenericVO.Nombre;
import co.com.sofka.Domain.GrupoDeTrabajo.Entities.Coatch;
import co.com.sofka.Domain.GrupoDeTrabajo.Entities.LiderGrupoTrabajo;
import co.com.sofka.Domain.GrupoDeTrabajo.Entities.Programador;
import co.com.sofka.Domain.GrupoDeTrabajo.Events.*;
import co.com.sofka.Domain.GrupoDeTrabajo.Values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class GrupoDeTrabajo extends AggregateEvent<IdGrupoDeTrabajo> {
    protected Nombre nombre;
    protected Set<Programador> programadores;
    protected LiderGrupoTrabajo liderGrupo;
    protected Coatch coatch;


    public GrupoDeTrabajo(IdGrupoDeTrabajo entityId, Nombre nombre) {
        super(entityId);
        this.nombre = nombre;
        appendChange(new GrupoDeTrabajoCreado(nombre));
    }
    public GrupoDeTrabajo(IdGrupoDeTrabajo entityId){
        super(entityId);
        subscribe(new GrupoDeTrabajoChange(this));
    }

    public static GrupoDeTrabajo from(IdGrupoDeTrabajo entityId, List<DomainEvent> events){
        var sprint = new GrupoDeTrabajo(entityId);
        events.forEach(sprint::applyEvent);
        return sprint;
    }

    public void AñadirProgramador(IdProgramador entityId, Rol rol , Nombre nombre, Celular celular, Identificacion identificacion, Email email){

        Objects.requireNonNull(entityId);
        Objects.requireNonNull(rol);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(celular);
        Objects.requireNonNull(identificacion);
        Objects.requireNonNull(email);

        appendChange(new ProgramadorAñadido(entityId,rol,nombre,celular,identificacion,email)).apply();

    }

    public void CrearCoatch(IdCoatch entityId , Nombre nombre , Celular celular, Identificacion identificacion , Email email, AreaDeEspecialidad areaDeEspecialidad){

        Objects.requireNonNull(entityId);
        Objects.requireNonNull(areaDeEspecialidad);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(celular);
        Objects.requireNonNull(identificacion);
        Objects.requireNonNull(email);

        appendChange(new CoatchCreado(entityId,areaDeEspecialidad,nombre,celular,identificacion,email)).apply();

    }

    public void CrearLiderGrupoTrabajo(IdLiderGrupoTrabajo entityId , Nombre nombre , Identificacion identificacion, Email email, Celular celular){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(celular);
        Objects.requireNonNull(identificacion);
        Objects.requireNonNull(email);

        appendChange(new LiderGrupoTrabajoCreado(entityId,nombre,celular,identificacion,email)).apply();
    }

    public void EliminarProgramador(IdProgramador entityId){
        Objects.requireNonNull(entityId);

        appendChange(new ProgramadorEliminado(entityId)).apply();
    }

    public void ActualizarRolProgramador(IdProgramador entityId , Rol rol){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(rol);

        appendChange(new RolProgramadorActualizado(entityId,rol)).apply();
    }

    public void ActualizarCelularProgramador(IdProgramador entityId , Celular celular){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(celular);

        appendChange(new CelularProgramadorActualizado(entityId,celular)).apply();
    }

    public void ActualizarEmailProgramador(IdProgramador entityId , Email email){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(email);

        appendChange(new EmailProgramadorActualizado(entityId,email)).apply();
    }

    public void ActualizarEmailLiderGrupoTrabajo(IdLiderGrupoTrabajo entityId , Email email){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(email);

        appendChange(new EmailLiderGrupoTrabajoActualizado(entityId,email)).apply();
    }

    public void ActualizarCelularLiderGrupoTrabajo(IdProgramador entityId , Celular celular){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(celular);

        appendChange(new CelularLiderGrupoTrabajoActualizado(entityId,celular)).apply();
    }

    public void ActualizarCelularCoatch(IdProgramador entityId , Celular celular){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(celular);

        appendChange(new CelularCoatchActualizado(entityId,celular)).apply();
    }

    public void ActualizarEmailCoatch(IdLiderGrupoTrabajo entityId , Email email){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(email);

        appendChange(new EmailCoatchActualizado(entityId,email)).apply();
    }


    public Optional<Programador> getProgramadorPorId(IdProgramador entityId ){
        return programadores.stream()
                .filter(factura-> factura.equals(entityId))
                .findFirst();
    }





}
