package co.com.sofka.domain.pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.pasajero.values.CuentaID;

public class CuentaPasajeroDesvinculada extends DomainEvent {

    private final CuentaID cuentaID;

    public CuentaPasajeroDesvinculada(CuentaID cuentaID) {
        super("sofka.pasajero.cuentadesvinculada");
        this.cuentaID = cuentaID;
    }

    public CuentaID getCuentaID() {
        return cuentaID;
    }
}
