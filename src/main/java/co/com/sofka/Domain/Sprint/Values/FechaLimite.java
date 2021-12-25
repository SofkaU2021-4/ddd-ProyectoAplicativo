package co.com.sofka.Domain.Sprint.Values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.Instant;
import java.util.Date;
import java.util.Objects;

public class FechaLimite implements ValueObject<Date> {
    private final Date value;

    public FechaLimite(Date value) {
        this.value = Objects.requireNonNull(value, "La fecha no puede ser null");
        if(value.before(new Date(Instant.now().toEpochMilli()))){
            throw new IllegalArgumentException("No puede colocar una fecha del pasado");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FechaLimite that = (FechaLimite) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public Date value() {
        return value;
    }
}
