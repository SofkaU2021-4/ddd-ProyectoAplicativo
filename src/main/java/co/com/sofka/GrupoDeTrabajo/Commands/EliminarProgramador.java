package co.com.sofka.GrupoDeTrabajo.Commands;

import co.com.sofka.GrupoDeTrabajo.Values.IdProgramador;
import co.com.sofka.domain.generic.Command;

public class EliminarProgramador extends Command {

    private final IdProgramador entityId;

    public EliminarProgramador(IdProgramador entityId) {
        this.entityId = entityId;
    }

    public IdProgramador getEntityId() {
        return entityId;
    }
}
