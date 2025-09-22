package org.unisabana.patrones.estructural.brigde;

public abstract class Notificacion {

    protected PlataformaNotificacion plataforma;

    public Notificacion(PlataformaNotificacion plataforma) {
        this.plataforma = plataforma;
    }

    public abstract void enviar(String mensaje);


}
