package co.com.sofka.UseCases.Commands.GrupoDeTrabajo;

import co.com.sofka.Domain.GrupoDeTrabajo.Commands.CrearLiderGrupoTrabajo;
import co.com.sofka.Domain.GrupoDeTrabajo.Events.GrupoDeTrabajoCreado;
import co.com.sofka.Domain.GrupoDeTrabajo.Events.LiderGrupoTrabajoCreado;
import co.com.sofka.Domain.GrupoDeTrabajo.Values.IdGrupoDeTrabajo;
import co.com.sofka.Domain.GrupoDeTrabajo.Values.IdLiderGrupoTrabajo;
import co.com.sofka.Domain.GenericVO.Celular;
import co.com.sofka.Domain.GenericVO.Email;
import co.com.sofka.Domain.GenericVO.Identificacion;
import co.com.sofka.Domain.GenericVO.Nombre;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
class CrearLiderGrupoTrabajoUseCaseTest {
    @Mock
    private DomainEventRepository repository;

    @Test
    @DisplayName("test crear un lider")
    public void agregarLiderGrupoProyecto(){

        //arrange
        IdGrupoDeTrabajo idGrupoDeTrabajo=IdGrupoDeTrabajo.of("XXX");
        IdLiderGrupoTrabajo idLiderGrupoTrabajo = IdLiderGrupoTrabajo.of("ZZZ");
        Nombre nombre=new Nombre("Raul");
        Celular celular=new Celular("1234567489");
        Identificacion identificacion=new Identificacion("1020405060");
        Email email=new Email("raul@softka.com");

        var command=new CrearLiderGrupoTrabajo(idGrupoDeTrabajo,idLiderGrupoTrabajo,nombre,celular,identificacion,email);
        var usecase= new CrearLiderGrupoTrabajoUseCase();

        Mockito.when(repository.getEventsBy(idLiderGrupoTrabajo.value())).thenReturn(EventStored());
        usecase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(idLiderGrupoTrabajo.value())
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assets
        LiderGrupoTrabajoCreado event= (LiderGrupoTrabajoCreado) events.get(0);

        Assertions.assertEquals("Raul",event.getNombre().value());
        Assertions.assertEquals("raul@softka.com", event.getEmail().value());
        Assertions.assertEquals("1234567489", event.getCelular().value());
        Mockito.verify(repository).getEventsBy(idLiderGrupoTrabajo.value());


    }
    private List<DomainEvent> EventStored() {
        return List.of(
                new GrupoDeTrabajoCreado(
                        new Nombre("GrupoFino")
                )
        );
    }
}