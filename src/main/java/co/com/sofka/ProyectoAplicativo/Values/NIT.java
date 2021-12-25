package co.com.sofka.ProyectoAplicativo.Values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NIT implements ValueObject<String> {


    private final String nit;

    public NIT(String celular){
        this.nit = Objects.requireNonNull(celular);
        if(this.nit.isBlank()){
            throw new IllegalArgumentException("El Nit no puede estar vacío");
        }
        if(this.nit.length()<13){
            throw new IllegalArgumentException("El NIt no puede tener menos de trece digitos");
        }
        if(this.nit.length()>13){
            throw new IllegalArgumentException("El NIt no puede tener más de trece digitos");
        }
        if (!this.nit.matches("[0-9]*")){
            throw new IllegalArgumentException("El Nit sólo puede incluir números");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NIT nit1 = (NIT) o;
        return Objects.equals(nit, nit1.nit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nit);
    }

    @Override
    public String value() {
        return null;
    }
}
