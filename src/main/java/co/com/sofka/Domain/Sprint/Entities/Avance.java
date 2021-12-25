package co.com.sofka.Domain.Sprint.Entities;

import co.com.sofka.Domain.Sprint.Values.Comentario;
import co.com.sofka.Domain.Sprint.Values.Descripcion;
import co.com.sofka.Domain.Sprint.Values.IdAvance;
import co.com.sofka.domain.generic.Entity;

import java.util.Set;

public class Avance extends Entity<IdAvance> {


    private  Descripcion descripcion;
    private Set<Comentario> comentarios;

    public Avance(IdAvance entityId, Descripcion descripcion) {
        super(entityId);
        this.descripcion = descripcion;
    }


    public void ActualizarDescripcion(Descripcion descripcion){
        this.descripcion=descripcion;
    }

    public void AgregarComentario(Comentario comentario){
        this.comentarios.add(comentario);
    }

    public Descripcion descripcion() {
        return descripcion;
    }

    public Set<Comentario> getComentarios() {
        return comentarios;
    }


}
