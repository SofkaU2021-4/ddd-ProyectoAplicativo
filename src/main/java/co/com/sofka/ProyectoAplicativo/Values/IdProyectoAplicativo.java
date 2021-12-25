package co.com.sofka.ProyectoAplicativo.Values;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generic.Identity;

public class IdProyectoAplicativo extends Identity {
    private IdProyectoAplicativo(String value){
        super(value);
    }

    public IdProyectoAplicativo(){

    }

    public static IdProyectoAplicativo of(String value){
        return new IdProyectoAplicativo(value);
    }
}


