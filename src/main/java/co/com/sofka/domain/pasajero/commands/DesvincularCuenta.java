package co.com.sofka.domain.pasajero.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.pasajero.Cuenta;
import co.com.sofka.domain.pasajero.values.CuentaID;
import co.com.sofka.domain.pasajero.values.PasajeroID;

public class DesvincularCuenta extends Command {
    private final PasajeroID pasajeroID;
    private final CuentaID cuentaID;

    public DesvincularCuenta(PasajeroID pasajeroID, CuentaID cuentaID){
        this.pasajeroID = pasajeroID;
        this.cuentaID = cuentaID;
    }

    public CuentaID getCuentaID() {
        return cuentaID;
    }

    public PasajeroID getPasajeroID() {
        return pasajeroID;
    }
}
