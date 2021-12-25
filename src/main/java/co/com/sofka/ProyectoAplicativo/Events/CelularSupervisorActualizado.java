package co.com.sofka.ProyectoAplicativo.Events;

import co.com.sofka.GenericVO.Celular;
import co.com.sofka.domain.generic.DomainEvent;

public class CelularSupervisorActualizado extends DomainEvent {
    private final Celular celular;

    public CelularSupervisorActualizado(Celular celular) {
        super("sofka.ProyectoAplicativo.CelularSupervisorActualizado");
        this.celular = celular;
    }

    public Celular getCelular() {
        return celular;
    }
}
