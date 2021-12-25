package co.com.sofka.Domain.Sprint.Values;

import co.com.sofka.domain.generic.Identity;

public class IdAvance extends Identity {

    private IdAvance(String value){
        super(value);
    }

    public IdAvance(){

    }

    public static IdAvance of(String value){
        return new IdAvance(value);
    }

}
