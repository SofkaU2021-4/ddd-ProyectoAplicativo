package co.com.sofka.Sprint.Entities;


import co.com.sofka.Sprint.Values.Descripcion;
import co.com.sofka.Sprint.Values.FechaCreacion;
import co.com.sofka.Sprint.Values.IdObjetivo;
import co.com.sofka.domain.generic.Entity;

public class Objetivo extends Entity<IdObjetivo> {

    private  Descripcion descripcion;
    private  FechaCreacion fechaCreacion;

    public Objetivo(IdObjetivo entityId, Descripcion descripcion , FechaCreacion fechaCreacion) {
        super(entityId);
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
    }



    public void ActualizarDescripcion(Descripcion descripcion){

        this.descripcion=descripcion;

    }

    public Descripcion descripcion() {
        return descripcion;
    }

    public FechaCreacion fechaCreacion() {
        return fechaCreacion;
    }
}
