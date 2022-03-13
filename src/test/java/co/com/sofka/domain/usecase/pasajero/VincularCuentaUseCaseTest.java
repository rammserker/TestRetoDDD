package co.com.sofka.domain.usecase.pasajero;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.pasajero.commands.VincularCuenta;
import co.com.sofka.domain.pasajero.events.CuentaPasajeroVinculada;
import co.com.sofka.domain.pasajero.usecases.VincularCuentaUseCase;
import co.com.sofka.domain.pasajero.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class VincularCuentaUseCaseTest {
    @Test
    void vincularUnaCuenta() {
        PasajeroID pasajeroID = PasajeroID.of("luci01");
        CuentaID cuentaID = CuentaID.of("cuenta1");

        VincularCuenta command = new VincularCuenta(
                pasajeroID,
                cuentaID,
                new NombreUsuarioPasajero("rxqueen")
        );

        VincularCuentaUseCase useCase = new VincularCuentaUseCase();

        List<DomainEvent> events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow().getDomainEvents();

        CuentaPasajeroVinculada cuenta = (CuentaPasajeroVinculada) events.get(0);

        Assertions.assertEquals(cuenta.getCuentaId(), cuentaID);
        Assertions.assertEquals(cuenta.getNombreUsuario(), "rxqueen");
    }
}
