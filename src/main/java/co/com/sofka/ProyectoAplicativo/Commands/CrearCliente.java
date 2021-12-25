package co.com.sofka.ProyectoAplicativo.Commands;

import co.com.sofka.GenericVO.Celular;
import co.com.sofka.GenericVO.Email;
import co.com.sofka.ProyectoAplicativo.Values.IdClienteId;
import co.com.sofka.ProyectoAplicativo.Values.IdProyectoAplicativo;
import co.com.sofka.ProyectoAplicativo.Values.NIT;
import co.com.sofka.ProyectoAplicativo.Values.RazonSocial;
import co.com.sofka.domain.generic.Command;

public class CrearCliente extends Command {

    private final IdProyectoAplicativo idProyectoAplicativo;
    private final IdClienteId entityId;
    private final RazonSocial razonSocial;
    private final NIT nit;
    private final Email email;
    private final Celular celular;

    public CrearCliente(IdProyectoAplicativo idProyectoAplicativo , IdClienteId entityId, RazonSocial razonSocial, NIT nit, Email email, Celular celular) {
        this.idProyectoAplicativo = idProyectoAplicativo;
        this.entityId = entityId;
        this.razonSocial = razonSocial;
        this.nit = nit;
        this.email = email;
        this.celular = celular;
    }

    public IdProyectoAplicativo getIdProyectoAplicativo() {
        return idProyectoAplicativo;
    }

    public IdClienteId getEntityId() {
        return entityId;
    }

    public RazonSocial getRazonSocial() {
        return razonSocial;
    }

    public NIT getNit() {
        return nit;
    }

    public Email getEmail() {
        return email;
    }

    public Celular getCelular() {
        return celular;
    }
}
