package org.unisabana.patrones.estructural.brigde;

public class Main {

    public static void main(String[] args) {

        // --- Creamos las diferentes plataformas (Implementadores Concretos) ---//

        PlataformaNotificacion web = new PlataformaWeb();
        PlataformaNotificacion movil = new PlataformaMovil();
        PlataformaNotificacion email = new PlataformaEmail();

        System.out.println("### Escenario 1: Notificación de bienvenida para un nuevo usuario ###");

        // Se envía por web y por correo

        Notificacion bienvenidaWeb = new NotificacionMensaje(web);

        bienvenidaWeb.enviar("Gracias por registrarte, completa tu perfil para empezar.");

        Notificacion bienvenidaEmail = new NotificacionMensaje(email);

        bienvenidaEmail.enviar("Bienvenido a nuestra plataforma. Por favor, verifica tu correo.");

        System.out.println("\n### Escenario 2: Alerta de seguridad crítica ###");

        // Se envía a todos los dispositivos del usuario

        Notificacion alertaMovil = new NotificacionAlerta(movil);

        alertaMovil.enviar("Se ha detectado un inicio de sesión sospechoso en la cuenta.");

        Notificacion alertaEmail = new NotificacionAlerta(email);

        alertaEmail.enviar("Se ha iniciado sesión desde una nueva ubicación. Si no has sido tú, protege tu cuenta lo mas pronto podible.");



    }
}
