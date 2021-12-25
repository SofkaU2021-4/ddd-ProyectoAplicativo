package co.com.sofka.Sprint.Values;

import co.com.sofka.ProyectoAplicativo.Values.IdClienteId;
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
