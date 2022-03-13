package co.com.sofka.domain.pasajero.usecases;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.pasajero.Pasajero;
import co.com.sofka.domain.pasajero.commands.CrearPasajero;

public class CrearPasajeroUseCase extends UseCase<RequestCommand<CrearPasajero>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearPasajero> input) {
        var command = input.getCommand();

        Pasajero pasajero = new Pasajero(
                command.getPasajeropID(),
                command.getNombre(),
                command.getEdad(),
                command.getEmail()
        );

        emit().onResponse(new ResponseEvents(pasajero.getUncommittedChanges()));
    }
}
