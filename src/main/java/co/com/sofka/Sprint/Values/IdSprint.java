package co.com.sofka.Sprint.Values;

import co.com.sofka.domain.generic.Identity;

public class IdSprint extends Identity {
    private IdSprint(String value){
        super(value);
    }

    public IdSprint(){

    }

    public static IdSprint of(String value){
        return new IdSprint(value);
    }
}
