package co.com.sofka.domain.pasajero.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.pasajero.values.*;

public class CrearPasajero extends Command {
    private final NombrePasajero nombre;
    private final EdadPasajero edad;
    private final EmailPasajero email;
    private final PasajeroID pasajeropID;

    public CrearPasajero(PasajeroID pasajeroID, NombrePasajero nombre, EdadPasajero edad, EmailPasajero email) {
        this.pasajeropID = pasajeroID;
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }

    // Getters
    public EmailPasajero getEmail() {
        return email;
    }

    public EdadPasajero getEdad() {
        return edad;
    }

    public NombrePasajero getNombre() {
        return nombre;
    }
}
