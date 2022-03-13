package co.com.sofka.domain.pasajero.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.pasajero.values.EmailPasajero;
import co.com.sofka.domain.pasajero.values.PasajeroID;

public class ModificarEmail extends Command {
    private final PasajeroID pasajeroID;
    private final EmailPasajero email;

    public ModificarEmail(PasajeroID pasajeroID, EmailPasajero email){
        this.pasajeroID = pasajeroID;
        this.email = email;
    }

    public PasajeroID getPasajeroID() {
        return pasajeroID;
    }

    public EmailPasajero getEmail() {
        return email;
    }
}
