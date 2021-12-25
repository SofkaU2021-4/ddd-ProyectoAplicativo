package co.com.sofka.GrupoDeTrabajo.Values;

import co.com.sofka.domain.generic.Identity;

public class IdProgramador extends Identity {
    private IdProgramador(String value){
        super(value);
    }

    public IdProgramador(){

    }

    public static IdProgramador of(String value){
        return new IdProgramador(value);
    }
}
