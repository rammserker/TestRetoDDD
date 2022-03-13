package co.com.sofka.domain.viaje.values;

import co.com.sofka.domain.generic.Identity;

public class DestinoID extends Identity {
    private DestinoID (String uid) {
        super(uid);
    }

    public DestinoID () {}

    public static DestinoID of (String uid) {
        return new DestinoID(uid);
    }

}
