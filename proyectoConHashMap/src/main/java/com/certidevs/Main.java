package com.certidevs;

import java.util.Scanner;

public class Main {

    public static final String MENU = """
      Bienvenidos a la app. Selecciona la opción:
      1 - Guarda un cliente
      2 - Encuentra un cliente por id
      3 - Modifica un cliente
      4 - Borra un cliente
      5 - Encuentra todos los clientes
      6 - Salir
      """;
    static CustomerRepository customersRepo = new CustomerRepository();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println(MENU);
            int option = scanner.nextInt();
            switch (option) {
                case 1 -> save();
                case 2 -> findById();
                case 3 -> update();
                case 4 -> delete();
                case 5 -> findAll();
                case 6 -> exit = true;
                default -> System.out.println("La opción NO es correcta");
            }

        }
    }

    private static void save() {
        System.out.print("Introduce el ID del cliente: ");
        Long id = scanner.nextLong();
        scanner.nextLine();  // Limpiar buffer
        System.out.print("Introduce el nombre del cliente: ");
        String nombre = scanner.nextLine();
        System.out.print("Introduce el apellido del cliente: ");
        String apellido = scanner.nextLine();
        System.out.print("Introduce el email del cliente: ");
        String email = scanner.nextLine();

        try {
            Customer nuevoCliente = new Customer(id, nombre, apellido, email);
            customersRepo.save(nuevoCliente);
            System.out.println("Cliente creado con éxito.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void findById() {
        System.out.println("Introduce la ID del cliente que quieres ver: ");
        Long idBuscar = scanner.nextLong();
        try {
            Customer cliente = customersRepo.findById(idBuscar);
            System.out.println(cliente);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void update(){
        System.out.print("Introduce el ID del cliente que quieres actualizar: ");
        Long idActualizar = scanner.nextLong();
        scanner.nextLine();  // Limpiar buffer
        System.out.print("Introduce el nuevo nombre: ");
        String nuevoNombre = scanner.nextLine();
        System.out.print("Introduce el nuevo apellido: ");
        String nuevoApellido = scanner.nextLine();
        System.out.print("Introduce el nuevo email: ");
        String nuevoEmail = scanner.nextLine();

        try {
            Customer clienteActualizado = new Customer(idActualizar, nuevoNombre, nuevoApellido, nuevoEmail);
            customersRepo.update(idActualizar, clienteActualizado);
            System.out.println("Cliente actualizado con éxito.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void delete(){
        System.out.print("Introduce el ID del cliente que quieres eliminar: ");
        Long id = scanner.nextLong();
        try {
            customersRepo.delete(id);
            System.out.println("Cliente eliminado con éxito.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void findAll(){
        System.out.println("Listado de todos los clientes: ");
        for (Customer cliente : customersRepo.findAll()) {
            System.out.println(cliente);
        }

    }

}