package co.com.sofka.ProyectoAplicativo.Values;

import co.com.sofka.domain.generic.Identity;

public class IdSupervisor extends Identity {
    private IdSupervisor(String value){
        super(value);
    }

    public IdSupervisor(){

    }

    public static IdSupervisor of(String value){
        return new IdSupervisor(value);
    }
}
