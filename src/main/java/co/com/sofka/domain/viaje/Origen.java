package co.com.sofka.domain.viaje;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.viaje.values.OrigenID;
import co.com.sofka.domain.viaje.values.DireccionOrigen;

public class Origen extends Entity<OrigenID> {
    protected DireccionOrigen direccion;

    public Origen(OrigenID origenID, DireccionOrigen direccion) {
        super(origenID);
        this.direccion = direccion;
    }

    public void modificarDireccion (DireccionOrigen nueva){
        this.direccion = nueva;
    }

    public DireccionOrigen getDireccion() {
        return direccion;
    }
}
