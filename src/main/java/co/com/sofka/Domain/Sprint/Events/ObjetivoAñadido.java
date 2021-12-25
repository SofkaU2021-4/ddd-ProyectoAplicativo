package co.com.sofka.Domain.Sprint.Events;

import co.com.sofka.Domain.Sprint.Values.Descripcion;
import co.com.sofka.Domain.Sprint.Values.FechaCreacion;
import co.com.sofka.Domain.Sprint.Values.IdObjetivo;
import co.com.sofka.domain.generic.DomainEvent;

public class ObjetivoAñadido extends DomainEvent {
    private final IdObjetivo entityId;
    private final Descripcion descripcion;
    private final FechaCreacion fechaCreacion;

    public ObjetivoAñadido(IdObjetivo entityId, Descripcion descripcion, FechaCreacion fechaCreacion) {
        super("sofka.GrupoDeTrabajo.ObjetivoAñadido");
        this.entityId = entityId;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
    }

    public IdObjetivo getEntityId() {
        return entityId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public FechaCreacion getFechaCreacion() {
        return fechaCreacion;
    }
}
