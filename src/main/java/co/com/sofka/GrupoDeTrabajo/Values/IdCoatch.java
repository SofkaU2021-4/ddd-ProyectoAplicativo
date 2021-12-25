package co.com.sofka.GrupoDeTrabajo.Values;

import co.com.sofka.ProyectoAplicativo.Values.IdClienteId;
import co.com.sofka.domain.generic.Identity;

public class IdCoatch extends Identity {
    private IdCoatch(String value){
        super(value);
    }

    public IdCoatch(){

    }

    public static IdCoatch of(String value){
        return new IdCoatch(value);
    }
}
