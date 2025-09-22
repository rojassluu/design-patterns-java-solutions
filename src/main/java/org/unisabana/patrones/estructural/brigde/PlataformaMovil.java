package org.unisabana.patrones.estructural.brigde;

/* Implementa la lógica para una notificación en un dispositivo móvil.*/

public class PlataformaMovil implements PlataformaNotificacion {

    @Override
    public void mostrar(String titulo, String mensaje) {
        System.out.println("=== Notificación MÓVIL ===");
        System.out.printf("-> %s: %s\n", titulo, mensaje);
        System.out.println("===============================\n");
    }
}
