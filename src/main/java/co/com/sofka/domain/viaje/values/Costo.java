package co.com.sofka.domain.viaje.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Costo implements ValueObject<Float> {
    private final Float value;

    public Costo (Float valor) {
        this.value = valor;
    }

    @Override
    public Float value() {
        return this.value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Costo)) {
            return false;
        }

        Costo costo = (Costo) o;
        return Objects.equals(this.value, costo.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.value);
    }
}
