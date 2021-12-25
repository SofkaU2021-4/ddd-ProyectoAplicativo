package co.com.sofka.ProyectoAplicativo.Events;

import co.com.sofka.GenericVO.Celular;
import co.com.sofka.domain.generic.DomainEvent;

public class CelularLiderProyectoActualizado extends DomainEvent {
    private final Celular celular;

    public CelularLiderProyectoActualizado(Celular celular) {
        super(  "sofka.ProyectoAplicativo.CelularLiderActualizado");
        this.celular = celular;
    }

    public Celular getCelular() {
        return celular;
    }
}
