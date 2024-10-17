package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    void crearObjetosUsuario(){

        Usuario usuario1 = new Usuario();
        Usuario usuario2 = new Usuario();
        var usuario3 = new Usuario();

        usuario1.id = 1;
        usuario1.correo = "juanralvaro@yahoo.es";
        usuario1.nombre = "Juan Raimundo";
        usuario1.apellido = "Álvaro Núñez";

        usuario2.id = 2;
        usuario2.correo = "juan.joder@molotov.co.mx";
        usuario2.nombre = "Juan Pendejo";
        usuario2.apellido = "Obrador Holgazán";

        )

    }

    @Test
    void objetoMetodos(){
        Usuario usuarioPrueba = new Usuario();
        usuarioPrueba.nombre = "Antonio";
        usuarioPrueba.apellido = "Serrines Serrano";

        String nombreCompleto = usuarioPrueba.getNombreCompleto();
        assertEquals("Antonio Serrines Serrano", nombreCompleto);

        boolean estaEnParo = usuarioPrueba.isEstaEnParo();
        assertTrue(estaEnParo);
    }

}