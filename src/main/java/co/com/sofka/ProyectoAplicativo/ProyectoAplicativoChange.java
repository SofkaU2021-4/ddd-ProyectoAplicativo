package co.com.sofka.ProyectoAplicativo;


import co.com.sofka.ProyectoAplicativo.Entities.Cliente;
import co.com.sofka.ProyectoAplicativo.Entities.LiderProyecto;
import co.com.sofka.ProyectoAplicativo.Entities.Supervisor;
import co.com.sofka.ProyectoAplicativo.Events.*;

import co.com.sofka.domain.generic.EventChange;



public class ProyectoAplicativoChange extends EventChange {
    public ProyectoAplicativoChange(ProyectoAplicativo proyectoAplicativo){

    apply((ProyectoAplicativoCreado event)->{
        proyectoAplicativo.presupuesto = event.getPresupuesto();

    });

    apply((ClienteCreado event)->{
        proyectoAplicativo.cliente= new Cliente(
                event.getEntityId(),
                event.getRazonSocial(),
                event.getNit(),
                event.getEmail(),
                event.getCelular()
        );
    });


    apply((LiderProyectoCreado event)->{

            proyectoAplicativo.liderProyecto= new LiderProyecto(
                    event.getEntityId(),
                    event.getNombre(),
                    event.getIdentificacion(),
                    event.getEmail(),
                    event.getCelular()
            );

    });



        apply((SupervisorCreado event)->{
            proyectoAplicativo.supervisor= new Supervisor(
                    event.getEntityId(),
                    event.getNombre(),
                    event.getIdentificacion(),
                    event.getEmail(),
                    event.getCelular()
            );
        });

         apply((CelularClienteActualizado event)->{
        proyectoAplicativo.liderProyecto.ActualizarCelular(event.getCelular());

        });

        apply((CelularSupervisorActualizado event)->{
            proyectoAplicativo.supervisor.ActualizarCelular(event.getCelular());

        });

        apply((CelularLiderProyectoActualizado event)->{
            proyectoAplicativo.liderProyecto.ActualizarCelular(event.getCelular());

        });

        apply((EmailClienteActualizado event)->{
            proyectoAplicativo.cliente.ActualizarEmail(event.getEmail());

        });

        apply((EmailSupervisorActualizado event)->{
            proyectoAplicativo.supervisor.ActualizarEmail(event.getEmail());

        });

        apply((EmailLiderActualizado event)->{
            proyectoAplicativo.liderProyecto.ActualizarEmail(event.getEmail());

        });





    }


}


