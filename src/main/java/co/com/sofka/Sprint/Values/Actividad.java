package co.com.sofka.Sprint.Values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Actividad implements ValueObject<String> {
    private final String value;

    public Actividad(String value){
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("La actividad no puede estar vacío");
        }

        if(this.value.length()<10){
            throw new IllegalArgumentException("La actividad no puede tener menos de treinta caracteres");
        }

        if(this.value.length()>50){
            throw new IllegalArgumentException("La actividad no puede tener más de tres mil caracteres");
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
        Actividad actividad = (Actividad) o;
        return Objects.equals(value, actividad.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
