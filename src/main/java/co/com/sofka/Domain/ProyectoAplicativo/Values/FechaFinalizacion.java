package co.com.sofka.Domain.ProyectoAplicativo.Values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.Instant;
import java.util.Date;
import java.util.Objects;

public class FechaFinalizacion implements ValueObject<Date> {
    private final Date value;

    public FechaFinalizacion(Date value) {
        this.value = Objects.requireNonNull(value, "La fecha no puede ser null");
        if(value.before(new Date(Instant.now().toEpochMilli()))){
            throw new IllegalArgumentException("No puede colocar una fecha del pasado");
        }
    }

    @Override
    public Date value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FechaFinalizacion that = (FechaFinalizacion) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

}
