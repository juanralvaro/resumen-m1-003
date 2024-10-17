package org.example;

public class Cliente {

    String email;
    String password;
    int age;

    public Cliente(){
        System.out.println("Creando cliente");
        email = "cliente@mail.com";
        password = "12812";
        age = 52;
    }

    public Cliente(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Cliente(String email, String password, int age){
        this.email = email;
        this.password = password;
        this.age = age;
    }
}
