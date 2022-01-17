package co.com.sofka.UseCases.Commands.GrupoDeTrabajo;

import co.com.sofka.Domain.GrupoDeTrabajo.Commands.CrearGrupoDeTrabajo;
import co.com.sofka.Domain.GrupoDeTrabajo.Events.GrupoDeTrabajoCreado;
import co.com.sofka.Domain.GrupoDeTrabajo.Values.IdGrupoDeTrabajo;
import co.com.sofka.Domain.GenericVO.Nombre;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
class CrearGrupoDeTrabajoUseCaseTest {
    @Mock
    private DomainEventRepository repository;

    @Test
    @DisplayName("test crear un grupo de trabajo")
    public void crearUnGrupoDeTrabajo(){

        //arrange
        IdGrupoDeTrabajo idGrupoDeTrabajo=IdGrupoDeTrabajo.of("XXX");
        Nombre nombre=new Nombre("GrupoFino");
        var command=new CrearGrupoDeTrabajo(idGrupoDeTrabajo,nombre);
        var usecase= new CrearGrupoDeTrabajoUseCase();

        //act
        var events= UseCaseHandler.getInstance()
                .syncExecutor(usecase,new RequestCommand<>(command))
                .orElseThrow();

        //assets
        GrupoDeTrabajoCreado event=(GrupoDeTrabajoCreado) events.getDomainEvents().get(0);
        Assertions.assertEquals("XXX",event.aggregateRootId());
        Assertions.assertEquals("GrupoFino",event.getNombre().value());
    }

}