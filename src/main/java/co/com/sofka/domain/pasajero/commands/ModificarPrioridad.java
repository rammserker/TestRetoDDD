package co.com.sofka.domain.pasajero.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.pasajero.values.PasajeroID;
import co.com.sofka.domain.pasajero.values.Prioridad;

public class ModificarPrioridad extends Command {
    private final PasajeroID pasajeroID;
    private final Prioridad prioridad;

    public ModificarPrioridad(PasajeroID pasajeroID, Prioridad prioridad){
        this.pasajeroID = pasajeroID;
        this.prioridad = prioridad;
    }

    public PasajeroID getPasajeroID() {
        return pasajeroID;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }
}
