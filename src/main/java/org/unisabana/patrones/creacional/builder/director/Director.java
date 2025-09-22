package org.unisabana.patrones.creacional.builder.director;

import org.unisabana.patrones.creacional.builder.autos.AutoType;
import org.unisabana.patrones.creacional.builder.builders.Builder;
import org.unisabana.patrones.creacional.builder.components.*;

public class Director {

    public void constructSportsAuto(Builder builder) {

        builder.setType(AutoType.SPORTS);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setColor(Color.RED);
        builder.setWheels(Wheels.R19);
        builder.setSoundSystem(SoundSystem.BOSE);
        builder.setInteriorStyle(InteriorStyle.LEATHER);
    }

    public void constructCityAuto(Builder builder) {
        builder.setType(AutoType.CITY);
        builder.setSeats(4);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
    }

    public void constructSUV(Builder builder) {
        builder.setType(AutoType.SUV);
        builder.setSeats(5);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setWheels(Wheels.R17);
        builder.setSoundSystem(SoundSystem.BASIC);
    }

}
