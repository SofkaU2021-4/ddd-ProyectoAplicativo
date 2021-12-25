package co.com.sofka.ProyectoAplicativo.Values;

import co.com.sofka.domain.generic.Identity;

public class IdClienteId extends Identity {

    private IdClienteId(String value){
        super(value);
    }

    public IdClienteId(){

    }

    public static IdClienteId of(String value){
        return new IdClienteId(value);
    }
}
