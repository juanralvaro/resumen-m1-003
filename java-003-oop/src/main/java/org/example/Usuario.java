package org.example;

public class Usuario {
    //atributos / variables
    long id;
    String correo;
    String nombre;
    String apellido;
    int age;
    boolean estaEnParo;

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public boolean isEstaEnParo() {
        return estaEnParo;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", correo='" + correo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", age=" + age +
                ", estaEnParo=" + estaEnParo +
                '}';
    }

    //métodos / funciones

}
