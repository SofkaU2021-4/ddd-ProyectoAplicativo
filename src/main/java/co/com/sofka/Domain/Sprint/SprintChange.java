package co.com.sofka.Domain.Sprint;


import co.com.sofka.Domain.Sprint.Entities.Avance;
import co.com.sofka.Domain.Sprint.Entities.Objetivo;
import co.com.sofka.Domain.Sprint.Entities.Tarea;
import co.com.sofka.Domain.Sprint.Events.*;
import co.com.sofka.domain.generic.EventChange;

public class SprintChange extends EventChange {
    public SprintChange(Sprint sprint) {

        apply(( AvanceCreado event)->{
            sprint.avances.add(new Avance(event.getEntityId(),event.getDescripcion()));
        });

        apply(( AvanceEliminada event)->{
            sprint.avances.removeIf(avance -> avance.identity().equals(event.getEntityId()));
        });

        apply((DescripcionAvanceActualizado event)->{
            var avance=  sprint.getAvancePorId(event.getEntityId()).orElseThrow(()->new IllegalArgumentException("No se encuentra el avance"));
            avance.ActualizarDescripcion(event.getDescripcion());
        });
        apply((DescripcionTareaActualizada event)->{
            var tarea=  sprint.getTareaPorId(event.getEntityId()).orElseThrow(()->new IllegalArgumentException("No se encuentra la tarea"));
            tarea.ActualizarDescripcion(event.getDescripcion());
        });

        apply((DescripcionObjetivoActualizada event)->{
            var objetivo=  sprint.getObjetivoPorId(event.getEntityId()).orElseThrow(()->new IllegalArgumentException("No se encuentra el objetivo"));
            objetivo.ActualizarDescripcion(event.getDescripcion());
        });

        apply((ObjetivoAñadido event)->{
            sprint.objetivos.add(new Objetivo(event.getEntityId(),event.getDescripcion(), event.getFechaCreacion()));
        });

        apply(( ObjetivoEliminado event)->{
            sprint.objetivos.removeIf(objetivo -> objetivo.identity().equals(event.getEntityId()));
        });

        apply((SprintCreado event)->{
            sprint.descripcion = event.getDescripcion();
        });

        apply((TareaAñadida event)->{
            sprint.tareas.add(new Tarea(event.getEntityId(),event.getActividad(),event.getDescripcion()));
        });

        apply((TareaEliminada event)->{
            sprint.tareas.removeIf(objetivo -> objetivo.identity().equals(event.getEntityId()));
        });

    }
}
