package co.com.sofka.Domain.Sprint.Events;

import co.com.sofka.Domain.Sprint.Values.Descripcion;
import co.com.sofka.Domain.Sprint.Values.IdObjetivo;
import co.com.sofka.domain.generic.DomainEvent;

public class DescripcionObjetivoActualizada extends DomainEvent {

    private final IdObjetivo entityId;
    private final Descripcion descripcion;

    public DescripcionObjetivoActualizada(IdObjetivo entityId , Descripcion descripcion) {
        super("sofka.GrupoDeTrabajo.DescripcionObjetivoActualizada");

        this.entityId = entityId;
        this.descripcion = descripcion;
    }

    public IdObjetivo getEntityId() {
        return entityId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
