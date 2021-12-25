package co.com.sofka.Domain.Sprint;

import co.com.sofka.Domain.GrupoDeTrabajo.Values.IdGrupoDeTrabajo;

import co.com.sofka.Domain.Sprint.Entities.Avance;
import co.com.sofka.Domain.Sprint.Entities.Objetivo;
import co.com.sofka.Domain.Sprint.Entities.Tarea;
import co.com.sofka.Domain.Sprint.Events.*;
import co.com.sofka.Domain.Sprint.Values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Sprint extends AggregateEvent<IdSprint> {
    protected Descripcion descripcion;
    protected IdGrupoDeTrabajo grupoDeTrabajoId;
    protected Set<Avance> avances;
    protected Set<Tarea> tareas;
    protected Set<Objetivo> objetivos;

    public Sprint(IdSprint entityId , Descripcion descripcion , IdGrupoDeTrabajo grupoDeTrabajoId) {
        super(entityId);
        this.descripcion = descripcion;
        this.grupoDeTrabajoId = grupoDeTrabajoId;

        appendChange(new SprintCreado(entityId ,  descripcion ,  grupoDeTrabajoId)).apply();
    }

    public Sprint(IdSprint entityId ){
        super(entityId);
        subscribe(new SprintChange(this));
    }

    public static Sprint from(IdSprint entityId, List<DomainEvent> events){
        var sprint = new Sprint(entityId);
        events.forEach(sprint::applyEvent);
        return sprint;
    }

    public void AñadirObjetivo(IdObjetivo entityId, Descripcion descripcion , FechaCreacion fechaCreacion){

        Objects.requireNonNull(entityId);
        Objects.requireNonNull(descripcion);
        Objects.requireNonNull(fechaCreacion);

        appendChange(new ObjetivoAñadido(entityId,descripcion,fechaCreacion)).apply();
    }

    public void EliminarObjetivo(IdObjetivo entityId){

        Objects.requireNonNull(entityId);

        appendChange(new ObjetivoEliminado(entityId)).apply();
    }

    public void ActualizarFechaLimiteObjtivo(IdObjetivo entityId,Descripcion descripcion){

        Objects.requireNonNull(descripcion);
        Objects.requireNonNull(entityId);

        appendChange( new DescripcionObjetivoActualizada(entityId,descripcion)).apply();
    }

    public void AñadirTarea(IdTarea entityId , Actividad actividad , Descripcion descripcion){

        Objects.requireNonNull(entityId);
        Objects.requireNonNull(descripcion);
        Objects.requireNonNull(actividad);

        appendChange( new TareaAñadida(entityId,descripcion,actividad)).apply();

    }

    public void EliminarTarea(IdTarea entityId){

        Objects.requireNonNull(entityId);

        appendChange( new TareaEliminada(entityId)).apply();
    }

    public void ActualizarDescripcionTarea(IdTarea entityId,Descripcion descripcion){

        Objects.requireNonNull(entityId);
        Objects.requireNonNull(descripcion);

        appendChange( new DescripcionTareaActualizada(entityId,descripcion)).apply();
    }

    public void CrearAvance(IdAvance entityId, Descripcion descripcion){

        Objects.requireNonNull(entityId);
        Objects.requireNonNull(descripcion);

        appendChange( new AvanceCreado(entityId,descripcion)).apply();
    }

    public void EliminarAvance(IdAvance entityId){

        Objects.requireNonNull(entityId);

        appendChange( new AvanceEliminada(entityId)).apply();
    }

    public void ActualizarDescripcionAvance(IdAvance entityId ,Descripcion descripcion){

        Objects.requireNonNull(entityId);
        Objects.requireNonNull(descripcion);

        appendChange( new DescripcionAvanceActualizado(entityId,descripcion)).apply();
    }

    public Optional<Avance> getAvancePorId(IdAvance entityId ){
        return avances.stream()
                .filter(avance-> avance.equals(entityId))
                .findFirst();
    }

    public Optional<Tarea> getTareaPorId(IdTarea entityId ){
        return tareas.stream()
                .filter(tarea-> tarea.equals(entityId))
                .findFirst();
    }
    public Optional<Objetivo> getObjetivoPorId(IdObjetivo entityId ){
        return objetivos.stream()
                .filter(objetivo-> objetivo.equals(entityId))
                .findFirst();
    }



}
