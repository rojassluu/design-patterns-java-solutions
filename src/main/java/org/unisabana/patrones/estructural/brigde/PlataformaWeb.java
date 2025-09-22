package org.unisabana.patrones.estructural.brigde;

/*Implementa la lógica para mostrar notificaciones en una interfaz web.*/
public class PlataformaWeb implements PlataformaNotificacion {

    @Override
    public void mostrar(String titulo, String mensaje) {

        System.out.println("--- Notificación WEB ---");
        System.out.printf("Título: %s\n", titulo);
        System.out.printf("Mensaje: %s\n", mensaje);
        System.out.println("------------------------\n");
    }

}
