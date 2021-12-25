package co.com.sofka.Sprint.Entities;


import co.com.sofka.Sprint.Values.Actividad;
import co.com.sofka.Sprint.Values.Descripcion;
import co.com.sofka.Sprint.Values.IdTarea;
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
