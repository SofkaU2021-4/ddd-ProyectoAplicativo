package co.com.sofka.ProyectoAplicativo.Values;

import co.com.sofka.GenericVO.Nombre;
import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class RazonSocial implements ValueObject<String> {
    private final String value;

    public RazonSocial(String value){
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }

        if(this.value.length()<1){
            throw new IllegalArgumentException("El nombre no puede tener menos de un caracteres");
        }

        if(this.value.length()>50){
            throw new IllegalArgumentException("El comentario no puede tener más de cincuenta caracteres");
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
        RazonSocial that = (RazonSocial) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
