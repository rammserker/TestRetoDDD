package co.com.sofka.domain.viaje;

import co.com.sofka.domain.conductor.Conductor;
import co.com.sofka.domain.conductor.values.ConductorID;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.pasajero.Pasajero;
import co.com.sofka.domain.pasajero.values.PasajeroID;
import co.com.sofka.domain.viaje.events.ConductorVinculado;
import co.com.sofka.domain.viaje.values.Costo;
import co.com.sofka.domain.viaje.values.Fecha;
import co.com.sofka.domain.viaje.values.MetodoPago;
import co.com.sofka.domain.viaje.values.ViajeID;
import co.com.sofka.domain.viaje.events.PasajeroVinculado;
import co.com.sofka.domain.viaje.events.ViajeCreado;

import java.util.Objects;
import java.util.Set;

public class Viaje extends AggregateEvent<ViajeID> {
    protected Fecha fecha;
    protected Costo costo;
    protected MetodoPago metodoPago;

    protected Conductor conductor;
    protected Set<Pasajero> pasajeros;
    protected Origen origen;
    protected Destino destino;

    // Creacion
    public Viaje(ViajeID entityId, Fecha fecha, Costo costo, MetodoPago metodoPago) {
        super(entityId);
        appendChange(new ViajeCreado(fecha, costo, metodoPago)).apply();
    }

    private Viaje(ViajeID entityID){
        super(entityID);
        subscribe(new ViajeChange(this));
    }

    // Metodos
    public void agregarUsuarioPasajero (PasajeroID pasajeroID) {
        Objects.requireNonNull(pasajeroID);

        appendChange(new PasajeroVinculado(pasajeroID)).apply();
    }


    public void agregarUsuarioConductor (ConductorID conductorID) {
        Objects.requireNonNull(conductorID);

        appendChange(new ConductorVinculado(conductorID)).apply();
    }
}
