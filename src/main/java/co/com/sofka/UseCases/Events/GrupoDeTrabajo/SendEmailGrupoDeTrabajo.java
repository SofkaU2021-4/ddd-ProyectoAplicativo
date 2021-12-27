package co.com.sofka.UseCases.Events.GrupoDeTrabajo;

import co.com.sofka.Domain.GrupoDeTrabajo.Values.IdGrupoDeTrabajo;


public interface SendEmailGrupoDeTrabajo {
    boolean send(IdGrupoDeTrabajo idGrupoDeTrabajo, String email, String body);
}
