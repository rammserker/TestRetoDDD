package co.com.sofka.domain.viaje.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.pasajero.values.PasajeroID;

public class PasajeroVinculado extends DomainEvent {
    private final PasajeroID pasajeroID;

    public PasajeroVinculado (PasajeroID pasajeroID) {
        super("sofka.viaje.pasajerovinculado");
        this.pasajeroID = pasajeroID;
    }

    public PasajeroID getPasajeroID() {
        return pasajeroID;
    }
}
