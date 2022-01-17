package co.com.sofka.Domain.GenericVO;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Identificacion implements ValueObject<String> {
    private final String value;

    public Identificacion(String value){
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("la identificacion no puede estar vacío");
        }

        if(this.value.length()<1){
            throw new IllegalArgumentException("la identificacion no puede tener menos de un caracteres");
        }

        if(this.value.length()>20){
            throw new IllegalArgumentException("la identificacion no puede tener más de 20 caracteres");
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
        Identificacion that = (Identificacion) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
