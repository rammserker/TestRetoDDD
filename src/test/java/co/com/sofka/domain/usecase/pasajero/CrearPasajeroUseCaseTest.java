package co.com.sofka.domain.usecase.pasajero;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.pasajero.commands.CrearPasajero;
import co.com.sofka.domain.pasajero.events.PasajeroCreado;
import co.com.sofka.domain.pasajero.usecases.CrearPasajeroUseCase;
import co.com.sofka.domain.pasajero.values.EdadPasajero;
import co.com.sofka.domain.pasajero.values.EmailPasajero;
import co.com.sofka.domain.pasajero.values.NombrePasajero;
import co.com.sofka.domain.pasajero.values.PasajeroID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CrearPasajeroUseCaseTest {
    @Test
    void crearUnUsuario(){
        PasajeroID pasajeroID = PasajeroID.of("luci01");

        CrearPasajero command = new CrearPasajero(
                pasajeroID,
                new NombrePasajero("Lucia"),
                new EdadPasajero(25),
                new EmailPasajero("lucia@sofka.com.co")
        );

        CrearPasajeroUseCase useCase = new CrearPasajeroUseCase();

        List<DomainEvent> events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow().getDomainEvents();

        PasajeroCreado pasajero = (PasajeroCreado) events.get(0);

        Assertions.assertEquals("Lucia", pasajero.getNombre());
        Assertions.assertEquals(25, pasajero.getEdad());
        Assertions.assertEquals("lucia@sofka.com.co", pasajero.getEmail());
    }
}
