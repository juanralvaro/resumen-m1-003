package org.example;

public class Laptop {

    private Long id;
    private String nombre;
    private Float precio;

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

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        if (precio > 0 && precio < 500)
            this.precio = precio;
    }
}

