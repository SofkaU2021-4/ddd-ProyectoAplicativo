package co.com.sofka.Sprint.Values;

import co.com.sofka.ProyectoAplicativo.Values.IdClienteId;
import co.com.sofka.domain.generic.Identity;

public class IdObjetivo extends Identity {

    private IdObjetivo(String value){
        super(value);
    }

    public IdObjetivo(){

    }

    public static IdObjetivo of(String value){
        return new IdObjetivo(value);
    }
}
