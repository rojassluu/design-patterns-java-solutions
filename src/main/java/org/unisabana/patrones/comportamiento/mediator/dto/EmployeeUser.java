package org.unisabana.patrones.comportamiento.mediator.dto;

import org.unisabana.patrones.comportamiento.mediator.chat.ChatMediator;

public class EmployeeUser extends User {
    public EmployeeUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println("Empleado " + this.name + " envía: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("Empleado " + this.name + " recibe: " + message);
    }
}
