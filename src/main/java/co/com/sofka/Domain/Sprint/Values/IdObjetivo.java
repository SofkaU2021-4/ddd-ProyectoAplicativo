package co.com.sofka.Domain.Sprint.Values;

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
