package co.com.sofka.domain.pasajero.values;

import co.com.sofka.domain.generic.Identity;

public class PasajeroID extends Identity {
    private PasajeroID (String uid) {
        super(uid);
    }

    public PasajeroID () {}

    public static PasajeroID of (String uid) {
        return new PasajeroID(uid);
    }
}
