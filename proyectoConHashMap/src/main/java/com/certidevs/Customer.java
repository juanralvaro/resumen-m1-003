package com.certidevs;

import java.util.StringJoiner;

public class Customer {

    // Atributos
    private Long id;
    private String nombre;
    private String apellido;
    private String email;

    // constructores

    public Customer() {
    }

    public Customer(Long id, String nombre, String apellido, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    // getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    // to String

    @Override
    public String toString() {
        return new StringJoiner(", ", Customer.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("nombre='" + nombre + "'")
                .add("apellido='" + apellido + "'")
                .add("email='" + email + "'")
                .toString();
    }

}