package co.com.sofka.domain.pasajero.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.pasajero.values.EmailPasajero;

public class EmailPasajeroModificado extends DomainEvent {
    private final EmailPasajero email;

    public EmailPasajeroModificado(EmailPasajero emailPasajero) {
        super("sofka.pasajero.modificaremail");
        this.email = emailPasajero;
    }

    public EmailPasajero getEmailPasajero() {
        return email;
    }
}
