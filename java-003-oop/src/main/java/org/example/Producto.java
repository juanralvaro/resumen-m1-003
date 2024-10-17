package org.example;

public class Producto {

    Long id;
    String nombre;
    Float precio;
    Float peso;
    String color;
    String categoria;
    String descripcion;
    Boolean activo;

    public Producto() {

    }

    public Producto(Long id, String nombre, Float precio, Float peso, String color, String categoria, String descripcion, Boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.color = color;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.activo = activo;


    }
    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", peso=" + peso +
                ", color='" + color + '\'' +
                ", categoria='" + categoria + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", activo=" + activo +
                '}';
    }

}