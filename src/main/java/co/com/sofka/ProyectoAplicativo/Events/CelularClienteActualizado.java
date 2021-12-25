package co.com.sofka.ProyectoAplicativo.Events;

import co.com.sofka.GenericVO.Celular;
import co.com.sofka.domain.generic.DomainEvent;

public class CelularClienteActualizado extends DomainEvent {
    private final Celular celular;

    public CelularClienteActualizado(Celular celular) {
        super("sofka.ProyectoAplicativo.CelularClienteActualizado");
        this.celular = celular;
    }

    public Celular getCelular() {
        return celular;
    }
}
