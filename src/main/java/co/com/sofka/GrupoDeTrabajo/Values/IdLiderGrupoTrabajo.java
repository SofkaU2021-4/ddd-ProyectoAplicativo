package co.com.sofka.GrupoDeTrabajo.Values;

import co.com.sofka.domain.generic.Identity;

public class IdLiderGrupoTrabajo extends Identity {

    private IdLiderGrupoTrabajo(String value){
        super(value);
    }

    public IdLiderGrupoTrabajo(){

    }

    public static IdLiderGrupoTrabajo of(String value){
        return new IdLiderGrupoTrabajo(value);
    }
}
