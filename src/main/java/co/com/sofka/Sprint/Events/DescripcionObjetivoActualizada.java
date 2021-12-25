package co.com.sofka.Sprint.Events;

import co.com.sofka.Sprint.Values.Descripcion;
import co.com.sofka.Sprint.Values.FechaCreacion;
import co.com.sofka.Sprint.Values.FechaLimite;
import co.com.sofka.Sprint.Values.IdObjetivo;
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
