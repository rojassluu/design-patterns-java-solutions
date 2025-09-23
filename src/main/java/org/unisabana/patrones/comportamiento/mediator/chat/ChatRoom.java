package org.unisabana.patrones.comportamiento.mediator.chat;

import org.unisabana.patrones.comportamiento.mediator.dto.User;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator{

    private List<User> users = new ArrayList<>();


    @Override
    public void sendMessage(String message, User transmitter) {
        for (User u : users) {
            if (u != transmitter) {
                u.receive(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
