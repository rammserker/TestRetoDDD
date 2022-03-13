package co.com.sofka.domain.viaje.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DireccionOrigen implements ValueObject<String> {
    private final String value;

    public DireccionOrigen(String barrio, String calle, Integer numero) {
        Objects.requireNonNull(barrio);
        Objects.requireNonNull(calle);
        Objects.requireNonNull(numero);

        if (barrio.trim().isBlank()) {
            this.value = (calle.trim() + " " + calle.trim()).trim();
        } else {
            this.value = (calle.trim() + " " + calle.trim()).trim() + ", " + barrio.trim();
        }

        if (this.value.isBlank()) {
            throw new IllegalArgumentException("La direccion no puede estar vacia");
        }

        if (this.value.length() < 10) {
            throw new IllegalArgumentException("La direccion es muy corta");
        }
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof DireccionOrigen)) {
            return false;
        }
        DireccionOrigen direccionOrigen = (DireccionOrigen) o;
        return Objects.equals(value, direccionOrigen.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

}
