package org.unisabana.patrones.estructural.brigde;


/*Implementa la lógica para enviar una notificación por correo electrónico.*/

public class PlataformaEmail implements PlataformaNotificacion {

    @Override
    public void mostrar(String titulo, String mensaje) {
        System.out.println(">>> Enviando Correo Electrónico <<<");
        System.out.printf("Asunto: %s\n", titulo);
        System.out.printf("Cuerpo: %s\n", mensaje);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
    }

}
