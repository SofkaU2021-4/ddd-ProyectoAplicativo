package co.com.sofka.ProyectoAplicativo.Events;


import co.com.sofka.ProyectoAplicativo.Values.Presupuesto;
import co.com.sofka.domain.generic.DomainEvent;

public class ProyectoAplicativoCreado extends DomainEvent {
    private final Presupuesto presupuesto;

    public ProyectoAplicativoCreado(Presupuesto presupuesto) {
        super("sofka.ProyectoAplicativo.ProyectoAplicativoCreado");
        this.presupuesto = presupuesto;
    }

    public Presupuesto getPresupuesto() {
        return presupuesto;
    }

}
