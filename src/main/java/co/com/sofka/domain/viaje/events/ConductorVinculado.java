package co.com.sofka.domain.viaje.events;

import co.com.sofka.domain.conductor.values.ConductorID;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.pasajero.values.PasajeroID;

public class ConductorVinculado extends DomainEvent {
    private final ConductorID conductorID;

    public ConductorVinculado(ConductorID conductorID) {
        super("sofka.viaje.conductorvinculado");
        this.conductorID = conductorID;
    }

    public ConductorID getPasajeroID() {
        return this.conductorID;
    }
}
