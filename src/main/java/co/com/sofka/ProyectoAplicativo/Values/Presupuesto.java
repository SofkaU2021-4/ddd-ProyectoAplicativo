package co.com.sofka.ProyectoAplicativo.Values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Presupuesto implements ValueObject<String> {
    private final String value;

    public Presupuesto(String celular){
        this.value = Objects.requireNonNull(celular);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("El Presupuesto no puede estar vacío");
        }
        if(this.value.length()<13){
            throw new IllegalArgumentException("El Presupuesto no puede tener menos de trece digitos");
        }
        if(this.value.length()>13){
            throw new IllegalArgumentException("El Presupuesto no puede tener más de trece digitos");
        }
        if (!this.value.matches("[0-9]*")){
            throw new IllegalArgumentException("El Presupuesto sólo puede incluir números");
        }
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Presupuesto that = (Presupuesto) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
