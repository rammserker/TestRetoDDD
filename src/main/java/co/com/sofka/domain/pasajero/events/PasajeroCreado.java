package co.com.sofka.domain.pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.pasajero.values.EdadPasajero;
import co.com.sofka.domain.pasajero.values.EmailPasajero;
import co.com.sofka.domain.pasajero.values.NombrePasajero;

public class PasajeroCreado extends DomainEvent {
    private final NombrePasajero nombre;
    private final EdadPasajero edad;
    private final EmailPasajero email;

    public PasajeroCreado (NombrePasajero nombre, EdadPasajero edad, EmailPasajero email) {
        super("sofka.pasajero.creado");
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }

    public NombrePasajero getNombre() {
        return nombre;
    }

    public EdadPasajero getEdad() {
        return edad;
    }

    public EmailPasajero getEmail() {
        return email;
    }
}
