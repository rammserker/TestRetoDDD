package co.com.sofka.domain.pasajero.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.pasajero.values.CuentaID;
import co.com.sofka.domain.pasajero.values.NombreUsuarioPasajero;
import co.com.sofka.domain.pasajero.values.PasajeroID;

public class VincularCuenta extends Command {
    private final PasajeroID pasajeroID;
    private final CuentaID cuentaID;
    private final NombreUsuarioPasajero nombreUsuario;

    public VincularCuenta(PasajeroID pasajeroID, CuentaID cuentaID, NombreUsuarioPasajero nombreUsuario){
        this.pasajeroID = pasajeroID;
        this.cuentaID = cuentaID;
        this.nombreUsuario = nombreUsuario;
    }

    public CuentaID getCuentaID() {
        return this.cuentaID;
    }

    public NombreUsuarioPasajero getNombreUsuario() {
        return this.nombreUsuario;
    }

    public PasajeroID getPasajeroID() {
        return this.pasajeroID;
    }
}
