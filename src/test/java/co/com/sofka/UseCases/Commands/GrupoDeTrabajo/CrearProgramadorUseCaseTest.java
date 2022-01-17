package co.com.sofka.UseCases.Commands.GrupoDeTrabajo;

import co.com.sofka.Domain.GrupoDeTrabajo.Commands.AñadirProgramador;
import co.com.sofka.Domain.GrupoDeTrabajo.Events.GrupoDeTrabajoCreado;
import co.com.sofka.Domain.GrupoDeTrabajo.Events.ProgramadorAñadido;
import co.com.sofka.Domain.GrupoDeTrabajo.Values.IdGrupoDeTrabajo;
import co.com.sofka.Domain.GrupoDeTrabajo.Values.IdProgramador;
import co.com.sofka.Domain.GrupoDeTrabajo.Values.Rol;
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
class CrearProgramadorUseCaseTest {

    @Mock
    private DomainEventRepository repository;

    @Test
    @DisplayName("test crear un programador")
    public void  CrearProgramador(){

        //arrange
        IdGrupoDeTrabajo idGrupoDeTrabajo=IdGrupoDeTrabajo.of("XXX");
        IdProgramador idProgramador = IdProgramador.of("ZZZ");
        Rol rol = new Rol(Rol.Valor.DESARROLLADOR);
        Nombre nombre=new Nombre("Raul");
        Celular celular=new Celular("1234567489");
        Identificacion identificacion=new Identificacion("1020405060");
        Email email=new Email("raul@softka.com");

        var command=new AñadirProgramador(idGrupoDeTrabajo,idProgramador,rol,nombre,celular,identificacion,email);
        var usecase= new CrearProgramadorUseCase();

        Mockito.when(repository.getEventsBy(idProgramador.value())).thenReturn(EventStored());
        usecase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(idProgramador.value())
                .syncExecutor(usecase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assets
        ProgramadorAñadido event= (ProgramadorAñadido) events.get(0);

        Assertions.assertEquals("Raul",event.getNombre().value());
        Assertions.assertEquals("raul@softka.com", event.getEmail().value());
        Assertions.assertEquals("1234567489", event.getCelular().value());
        Mockito.verify(repository).getEventsBy(idProgramador.value());


    }
    private List<DomainEvent> EventStored() {
        return List.of(
                new GrupoDeTrabajoCreado(
                        new Nombre("GrupoFino")
                )
        );
    }

}