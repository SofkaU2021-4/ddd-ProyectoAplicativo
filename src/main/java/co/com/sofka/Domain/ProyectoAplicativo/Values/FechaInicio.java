package co.com.sofka.Domain.ProyectoAplicativo.Values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.Instant;
import java.util.Date;

public class FechaInicio implements ValueObject<Date> {
    Date fecha ;
    @Override
    public Date value() {
        return new Date(Instant.now().toEpochMilli());
    }
}
