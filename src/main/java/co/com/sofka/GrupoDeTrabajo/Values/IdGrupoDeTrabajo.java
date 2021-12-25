package co.com.sofka.GrupoDeTrabajo.Values;


import co.com.sofka.domain.generic.Identity;

public class IdGrupoDeTrabajo extends Identity {

    private IdGrupoDeTrabajo(String value){
        super(value);
    }

    public IdGrupoDeTrabajo(){

    }

    public static IdGrupoDeTrabajo of(String value){
        return new IdGrupoDeTrabajo(value);
    }
}
