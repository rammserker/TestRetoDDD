package co.com.sofka.domain.pasajero.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.pasajero.values.NombreUsuarioPasajero;
import co.com.sofka.domain.pasajero.values.PasajeroID;

public class ModificarNombreUsuario extends Command {
    private final PasajeroID pasajeroID;
    private final NombreUsuarioPasajero nombre;

    public ModificarNombreUsuario(PasajeroID pasajeroID, NombreUsuarioPasajero nombre){
        this.nombre = nombre;
        this.pasajeroID = pasajeroID;
    }

    public PasajeroID getPasajeroID() {
        return pasajeroID;
    }

    public NombreUsuarioPasajero getNombre() {
        return nombre;
    }
}
