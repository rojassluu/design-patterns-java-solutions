package org.unisabana.patrones.comportamiento.mediator.dto;

import org.unisabana.patrones.comportamiento.mediator.chat.ChatMediator;

public class CustomerUser extends User{
    public CustomerUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println("Cliente " + this.name + " envía: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("Cliente " + this.name + " recibe: " + message);
    }
}
