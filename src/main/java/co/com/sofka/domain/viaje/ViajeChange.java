package co.com.sofka.domain.viaje;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.domain.pasajero.Pasajero;
import co.com.sofka.domain.viaje.events.*;

public class ViajeChange extends EventChange {
    public ViajeChange(Viaje viaje) {
        apply((PasajeroVinculado event) -> {

        });
    }
}
