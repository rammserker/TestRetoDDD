package co.com.sofka.domain.pasajero.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreUsuarioPasajero implements ValueObject<String> {
    private final String value;

    public NombreUsuarioPasajero(String value) {
        this.value = Objects.requireNonNull(value).trim();

        if (this.value.length() < 3) {
            throw new IllegalArgumentException("El nombre de usuario debe tener al menos 3 caracteres");
        }

        if (this.value.length() > 30) {
            throw new IllegalArgumentException("El nombre de usuario debe tener menos de 30 caracteres");
        }
    }

    @Override
    public String value() {
        return  value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof NombreUsuarioPasajero)) {
            return false;
        }

        NombreUsuarioPasajero nombre = (NombreUsuarioPasajero) o;
        return Objects.equals(value, nombre.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}