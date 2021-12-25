package co.com.sofka.Domain.Sprint.Values;

import co.com.sofka.domain.generic.Identity;

public class IdTarea extends Identity {

    private IdTarea(String value){
        super(value);
    }

    public IdTarea(){

    }

    public static IdTarea of(String value){
        return new IdTarea(value);
    }
}
