package co.com.sofka.domain.viaje.values;

import co.com.sofka.domain.generic.ValueObject;
import co.com.sofka.domain.pasajero.values.Prioridad;
import co.com.sofka.domain.pasajero.values.PrioridadEnum;

import java.util.Objects;

public class MetodoPago implements ValueObject<MetodoPagoEnum> {
    private final MetodoPagoEnum value;

    public MetodoPago(MetodoPagoEnum value){
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public MetodoPagoEnum value() {
        return this.value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof MetodoPago)) {
            return false;
        }

        MetodoPago prioridad = (MetodoPago) o;
        return Objects.equals(this.value, prioridad.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.value);
    }
}
