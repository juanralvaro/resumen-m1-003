package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void constructorVacio() {
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        cliente2.password = "another_password";

        assertEquals("cliente@mail.com", cliente1.email);
        assertEquals("12812", cliente1.password);
        assertEquals(52, cliente1.age);

        assertEquals("cliente@mail.com", cliente2.email);
        assertEquals("another_password", cliente2.password);
    }

    /*
    Sobrecarga de funciones:
    ocurre cuando tenemos una misma función repetida varias veces
    pero con distintos parámetros:
    Cliente()
    Cliente(String email, String password)
    Cliente(String email, String password, int edad)
   */
    @Test
    void constructorConParametros(){
        Cliente cliente1 = new Cliente("john@gmail.com", "164788");
        assertEquals("john@gmail.com", cliente1.email);
        assertEquals("164788", cliente1.password);

        Cliente cliente2 = new Cliente("optica@selgas.com", "123456", 37);
        assertEquals("optica@selgas.com", cliente2.email);
        assertEquals("123456", cliente2.password);
        assertEquals(37, cliente2.age);
    }

    @Test
    void toStringTest(){
        Cliente cliente1 = new Cliente("john@gmail.com", "164788");
        Cliente cliente2 = new Cliente("optica@selgas.com", "123456", 37);
        System.out.println(cliente1);
        System.out.println(cliente2);

        //Sin toString:
        //org.example.Cliente@ca263c2
        //Con toString: (NO ES .JSON)
        //Cliente{email='john@gmail.com', password='164788', age=0}

    }
}