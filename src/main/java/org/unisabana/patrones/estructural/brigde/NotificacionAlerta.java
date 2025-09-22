package org.unisabana.patrones.estructural.brigde;

public class NotificacionAlerta extends Notificacion{

    public NotificacionAlerta(PlataformaNotificacion plataforma) {
        super(plataforma);
    }

    @Override
    public void enviar(String mensaje) {
        String titulo = "¡¡ALERTA!!";
        plataforma.mostrar(titulo, mensaje);
    }

}
