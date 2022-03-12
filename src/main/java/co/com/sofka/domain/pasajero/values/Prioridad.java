package co.com.sofka.domain.pasajero.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Prioridad implements ValueObject<PrioridadEnum> {
    private final PrioridadEnum value;

    public Prioridad(PrioridadEnum value){
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public PrioridadEnum value() {
        return this.value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Prioridad)) {
            return false;
        }

        Prioridad prioridad = (Prioridad) o;
        return Objects.equals(this.value, prioridad.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.value);
    }
}
