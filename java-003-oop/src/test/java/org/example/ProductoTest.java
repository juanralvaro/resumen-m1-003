package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoTest {

    @Test
    void constructorVacio(){
        Producto producto1 = new Producto();
        producto1.nombre = "IPhone 16";
        assertEquals("IPhone 16",producto1.nombre);
    }

    @Test
    void constructorConParametros(){
        Producto producto1 = new Producto(
                1L,
                "Silla",
                59.99f,
                2.5f,
                "negro",
                "Silla ergonómica",
                "Gamer",
                true
        );
        assertEquals(1L, producto1.id);
    }

}