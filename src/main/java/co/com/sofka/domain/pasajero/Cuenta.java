package co.com.sofka.domain.pasajero;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.pasajero.values.CuentaID;
import co.com.sofka.domain.pasajero.values.NombreUsuarioPasajero;

public class Cuenta extends Entity<CuentaID> {
    protected NombreUsuarioPasajero nombreUsuario;

    public Cuenta(CuentaID cuentaID, NombreUsuarioPasajero nombre){
        super(cuentaID);
        this.nombreUsuario = nombre;
    }

    public void modificarNombreUsuario (NombreUsuarioPasajero nombre) {
        this.nombreUsuario = nombre;
    }

    public NombreUsuarioPasajero getNombreUsuario() {
        return nombreUsuario;
    }
}
