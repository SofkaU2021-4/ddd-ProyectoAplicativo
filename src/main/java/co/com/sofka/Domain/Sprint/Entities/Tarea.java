package co.com.sofka.Domain.Sprint.Entities;


import co.com.sofka.Domain.Sprint.Values.Actividad;
import co.com.sofka.Domain.Sprint.Values.Descripcion;
import co.com.sofka.Domain.Sprint.Values.IdTarea;
import co.com.sofka.domain.generic.Entity;

public class Tarea extends Entity<IdTarea> {
    private  Actividad actividad;
    private  Descripcion descripcion;

    public Tarea(IdTarea entityId , Actividad actividad , Descripcion descripcion) {
        super(entityId);
        this.actividad = actividad;
        this.descripcion = descripcion;
    }

    public void ActualizarDescripcion(Descripcion descripcion){
        this.descripcion=descripcion;
    }

    public Actividad actividad() {
        return actividad;
    }

    public Descripcion descripcion() {
        return descripcion;
    }
}
