package com.fjavmvazquez.ejemplo07.model;

import java.util.Objects;

public class User {
    private final String nombre;
    private final String apellido;
    private final String email;

    public User(String nombre, String apellido, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(nombre, user.nombre) && Objects.equals(apellido, user.apellido) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, email);
    }

    @Override
    public String toString() {
        return "User{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
