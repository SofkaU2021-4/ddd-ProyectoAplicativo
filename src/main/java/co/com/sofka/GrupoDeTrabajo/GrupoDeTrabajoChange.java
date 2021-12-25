package co.com.sofka.GrupoDeTrabajo;






import co.com.sofka.GrupoDeTrabajo.Entities.Coatch;
import co.com.sofka.GrupoDeTrabajo.Entities.LiderGrupoTrabajo;
import co.com.sofka.GrupoDeTrabajo.Entities.Programador;
import co.com.sofka.GrupoDeTrabajo.Events.*;
import co.com.sofka.domain.generic.EventChange;

public class GrupoDeTrabajoChange extends EventChange {
    public GrupoDeTrabajoChange(GrupoDeTrabajo grupoDeTrabajo) {


        apply((GrupoDeTrabajoCreado event)->{
            grupoDeTrabajo.nombre= event.getNombre();
        });

        apply((CoatchCreado event)->{
            grupoDeTrabajo.coatch=new Coatch(event.getEntityId(),
                    event.getNombre(),
                    event.getCelular(),
                    event.getIdentificacion(),
                    event.getEmail(),
                    event.getAreaDeEspecialidad());
        });

        apply((ProgramadorAñadido event)->{

            grupoDeTrabajo.programadores.add(new Programador( event.getEntityId(),
                    event.getRol() ,
                    event.getNombre(),
                    event.getCelular(),
                    event.getIdentificacion(),
                    event.getEmail()));
        });

        apply((LiderGrupoTrabajoCreado event)->{

            grupoDeTrabajo.liderGrupo=new LiderGrupoTrabajo(
                    event.getEntityId(),
                    event.getNombre(),
                    event.getIdentificacion(),
                    event.getEmail(),
                    event.getCelular());

        });


        apply((CelularCoatchActualizado event)->{
            grupoDeTrabajo.coatch.ActualizarCelular(event.getCelular());
        });

        apply((EmailCoatchActualizado event)->{
            grupoDeTrabajo.coatch.ActualizarEmail(event.getEmail());
        });

        apply((EmailLiderGrupoTrabajoActualizado event)->{
            grupoDeTrabajo.liderGrupo.ActualizarEmail(event.getEmail());
        });

        apply((EmailProgramadorActualizado event)->{
            var programador= grupoDeTrabajo.getProgramadorPorId(event.getEntityId()).orElseThrow(()->new IllegalArgumentException("No se encuentra la Programador"));
            programador.ActualizarEmail(event.getEmail());
        });

        apply((CelularProgramadorActualizado event)->{
          var programador= grupoDeTrabajo.getProgramadorPorId(event.getEntityId()).orElseThrow(()->new IllegalArgumentException("No se encuentra la Programador"));
            programador.ActualizarCelular(event.getCelular());

        });

        apply((CelularLiderGrupoTrabajoActualizado event)->{
            grupoDeTrabajo.liderGrupo.ActualizarCelular(event.getCelular());
        });


    }


}
