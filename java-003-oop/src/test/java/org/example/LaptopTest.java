package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LaptopTest {

    @Test
    void atributosEncapsulados(){
        Laptop asus = new Laptop();

        asus.setNombre("Portátil Sony");
        asus.setPrecio(1200f);
        assertEquals("Portátil Sony", asus.getNombre());
        assertEquals(1200f, asus.getPrecio());

    }

}