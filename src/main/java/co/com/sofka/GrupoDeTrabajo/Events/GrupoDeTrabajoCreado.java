package co.com.sofka.GrupoDeTrabajo.Events;

import co.com.sofka.GenericVO.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class GrupoDeTrabajoCreado extends DomainEvent {
    private final Nombre nombre;

    public GrupoDeTrabajoCreado(Nombre nombre) {
        super("sofka.Sprint.SprintCreado");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
