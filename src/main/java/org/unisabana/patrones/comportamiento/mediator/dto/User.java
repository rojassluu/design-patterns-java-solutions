package org.unisabana.patrones.comportamiento.mediator.dto;

import org.unisabana.patrones.comportamiento.mediator.chat.ChatMediator;

public abstract class User {
    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String message);
    public abstract void receive(String message);
}
