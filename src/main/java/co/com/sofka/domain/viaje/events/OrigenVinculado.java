package co.com.sofka.domain.viaje.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.viaje.Destino;
import co.com.sofka.domain.viaje.Origen;

public class OrigenVinculado extends DomainEvent {
    private final Origen origen;

    public OrigenVinculado(Origen origen) {
        super("sofka.viaje.pasajerovinculado");
        this.origen = origen;
    }

    public Origen getOrigen() {
        return origen;
    }
}
