package co.com.sofka.domain.pasajero;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.domain.pasajero.events.*;

public class PasajeroChange extends EventChange {
    public PasajeroChange(Pasajero pasajero) {
        apply((PasajeroCreado event) -> {
            pasajero.nombre = event.getNombre();
            pasajero.edad = event.getEdad();
            pasajero.email = event.getEmail();
        });

        apply((NombrePasajeroModificado event) -> {
            pasajero.nombre = event.getNombrePasajero();
        });

        apply((EmailPasajeroModificado event) -> {
            pasajero.email = event.getEmailPasajero();
        });

        apply((PrioridadPasajeroModificada event) -> {
            pasajero.prioridad = event.getPrioridad();
        });

        apply((CuentaPasajeroVinculada event) -> {
            pasajero.cuentas.add(new Cuenta(event.getCuentaId(), event.getNombreUsuario()));
        });

        apply((CuentaPasajeroDesvinculada event) -> {
            Cuenta cuenta = pasajero.getCuentaPorId(event.getCuentaID()).orElseThrow(() -> new IllegalArgumentException("No existe la cuenta del cliente"));
        });
    }
}
