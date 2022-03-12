package co.com.sofka.domain.pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.pasajero.values.NombrePasajero;

public class NombrePasajeroModificado extends DomainEvent {
    private final NombrePasajero nombrePasajero;

    public NombrePasajeroModificado(NombrePasajero nombre) {
        super("sofka.pasajero.modificarnombre");
        this.nombrePasajero = nombre;
    }

    public NombrePasajero getNombrePasajero() {
        return nombrePasajero;
    }
}
