package co.com.sofka.Domain.GrupoDeTrabajo.Commands;

import co.com.sofka.Domain.GenericVO.Email;
import co.com.sofka.Domain.GrupoDeTrabajo.Values.IdGrupoDeTrabajo;
import co.com.sofka.Domain.GrupoDeTrabajo.Values.IdProgramador;
import co.com.sofka.domain.generic.Command;

public class ActualizarEmailProgramador  extends Command  {

    private final IdGrupoDeTrabajo idGrupoDeTrabajo;
    private final IdProgramador entityId;
    private final Email email;

    public ActualizarEmailProgramador(IdGrupoDeTrabajo idGrupoDeTrabajo , IdProgramador entityId, Email email) {
        this.idGrupoDeTrabajo = idGrupoDeTrabajo;
        this.entityId = entityId;
        this.email = email;
    }

    public IdGrupoDeTrabajo getIdGrupoDeTrabajo() {
        return idGrupoDeTrabajo;
    }

    public IdProgramador getEntityId() {
        return entityId;
    }

    public Email getEmail() {
        return email;
    }

}
