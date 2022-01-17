package co.com.sofka.Domain.ProyectoAplicativo.Events;

import co.com.sofka.Domain.GenericVO.Celular;
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
