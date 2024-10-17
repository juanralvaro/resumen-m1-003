package com.certidevs;

import java.util.Collection;
import java.util.HashMap;

public class CustomerRepository {

    private HashMap<Long, Customer> customerMap;

    public CustomerRepository() {
        this.customerMap = new HashMap<>();
    }

    // Guardar un cliente
    public void save(Customer customer) {
        if (customerMap.containsKey(customer.getId())) {
            throw new IllegalArgumentException("El cliente con ID " + customer.getId() + " ya existe.");
        }
        customerMap.put(customer.getId(), customer);
    }

    // Buscar un cliente por ID
    public Customer findById(Long id) {
        if (!customerMap.containsKey(id)) {
            throw new IllegalArgumentException("No se encontró un cliente con ID " + id);
        }
        return customerMap.get(id);
    }

    // Actualizar un cliente
    public void update(Long id, Customer updatedCustomer) {
        if (!customerMap.containsKey(id)) {
            throw new IllegalArgumentException("No se puede actualizar. El cliente con ID " + id + " no existe.");
        }
        customerMap.put(id, updatedCustomer);
    }

    // Eliminar un cliente
    public void delete(Long id) {
        if (!customerMap.containsKey(id)) {
            throw new IllegalArgumentException("No se puede eliminar. El cliente con ID " + id + " no existe.");
        }
        customerMap.remove(id);
    }

    // Obtener todos los clientes
    public Collection<Customer> findAll() {
        return customerMap.values();
    }
}