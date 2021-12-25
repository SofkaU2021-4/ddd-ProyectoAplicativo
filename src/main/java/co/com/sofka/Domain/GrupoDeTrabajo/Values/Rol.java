package co.com.sofka.Domain.GrupoDeTrabajo.Values;


import co.com.sofka.domain.generic.ValueObject;

public class Rol implements ValueObject<Rol.Valor> {


    private final Valor valor;

    @Override
    public Valor value() {
        return valor;
    }

    public Rol(Valor valor) {
        this.valor = valor;
    }

    public enum Valor {
        SCRUM_MASTER,
        PRODUCT_OWNER,
        DESARROLLADOR
    }
}

