package org.unisabana.patrones.comportamiento.mediator.chat;

import org.unisabana.patrones.comportamiento.mediator.dto.User;

public interface ChatMediator {
    void sendMessage(String message,User transmitter);
    void addUser(User user);
}
