package co.com.sofka.UseCases.Events.ProyectoAplicativo;

import co.com.sofka.Domain.ProyectoAplicativo.Values.IdProyectoAplicativo;


public interface SendEmailProyectoService {
    boolean send(IdProyectoAplicativo idProyectoAplicativo, String email, String body);
}
