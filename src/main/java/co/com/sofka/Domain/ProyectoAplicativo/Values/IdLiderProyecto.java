package co.com.sofka.Domain.ProyectoAplicativo.Values;

import co.com.sofka.domain.generic.Identity;

public class IdLiderProyecto extends Identity {
    private IdLiderProyecto(String value){
        super(value);
    }

    public IdLiderProyecto(){

    }

    public static IdLiderProyecto of(String value){
        return new IdLiderProyecto(value);
    }
}
