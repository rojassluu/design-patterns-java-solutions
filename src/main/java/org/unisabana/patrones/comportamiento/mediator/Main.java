package org.unisabana.patrones.comportamiento.mediator;


import org.unisabana.patrones.comportamiento.mediator.chat.ChatMediator;
import org.unisabana.patrones.comportamiento.mediator.chat.ChatRoom;
import org.unisabana.patrones.comportamiento.mediator.dto.CustomerUser;
import org.unisabana.patrones.comportamiento.mediator.dto.EmployeeUser;
import org.unisabana.patrones.comportamiento.mediator.dto.User;

public class Main {
    public static void main(String[] args) {

        System.out.println("Mediator!");

        ChatMediator chatRoom = new ChatRoom();


        User ivan  = new CustomerUser(chatRoom, "Ivan");
        User rafael  = new CustomerUser(chatRoom, "Rafael");
        User luisa  = new CustomerUser(chatRoom, "Luisa");
        User sergio  = new EmployeeUser(chatRoom, "Sergio ");

        chatRoom.addUser(ivan);
        chatRoom.addUser(rafael);
        chatRoom.addUser(luisa);
        chatRoom.addUser(sergio);

        sergio.send("Estimados usuarios, por solo $10.000 podran adquirir nuestro producto estrella.");
        ivan.send("Genial!!!");
        rafael.send("Lo deja en $5.000?");
    }
}