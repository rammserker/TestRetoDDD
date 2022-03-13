package co.com.sofka.domain.conductor.values;

import co.com.sofka.domain.generic.Identity;

public class ConductorID extends Identity {
    private ConductorID (String uid) {
        super(uid);
    }

    public ConductorID() {}

    public static ConductorID of (String uid) {
        return new ConductorID(uid);
    }
}
