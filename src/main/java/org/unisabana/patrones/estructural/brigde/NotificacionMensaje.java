package org.unisabana.patrones.estructural.brigde;

public class NotificacionMensaje extends Notificacion {

    public NotificacionMensaje(PlataformaNotificacion plataforma) {
        super(plataforma);
    }

    @Override
    public void enviar(String mensaje) {
        // Lógica específica de este tipo de notificación
        String titulo = "Nuevo Mensaje";
        // Delega la acción de mostrar a la plataforma inyectada
        plataforma.mostrar(titulo, mensaje);
    }

}
