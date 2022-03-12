package co.com.sofka.domain.pasajero.values;

import co.com.sofka.domain.generic.Identity;

public class CuentaID extends Identity {
    private CuentaID (String uid) {
        super(uid);
    }

    public CuentaID () {}

    public static CuentaID of (String uid) {
        return new CuentaID(uid);
    }
}