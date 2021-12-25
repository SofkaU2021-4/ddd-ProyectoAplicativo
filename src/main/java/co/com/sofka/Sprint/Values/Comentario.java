package co.com.sofka.Sprint.Values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Comentario implements ValueObject<String> {
    private final String value;

    public Comentario(String value){
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("La comentario no puede estar vacío");
        }

        if(this.value.length()<30){
            throw new IllegalArgumentException("La comentario no puede tener menos de treinta caracteres");
        }

        if(this.value.length()>3000){
            throw new IllegalArgumentException("La comentario no puede tener más de tres mil caracteres");
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comentario that = (Comentario) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String value() {
        return value;
    }
}
