package co.com.sofka.GenericVO;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Email implements ValueObject<String> {

    private final String email;

    public Email(String email){
        this.email = Objects.requireNonNull(email);
        if(this.email.isBlank()){
            throw new IllegalArgumentException("El Email no puede estar vacío");
        }
        if (!this.email.matches("^\\w+([.-]?\\w+)@\\w+([.-]?\\w+)(.\\w{2,3})+$")) {
            throw new IllegalArgumentException("El Email es invalido");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Email email1 = (Email) o;
        return Objects.equals(email, email1.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    @Override
    public String value() {
        return null;
    }


}
