package org.unisabana.patrones.creacional.builder.autos;

import org.unisabana.patrones.creacional.builder.components.*;

public class Auto {

    private final AutoType type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final Color color;
    private final Wheels wheels;
    private final SoundSystem soundSystem;
    private final InteriorStyle interiorStyle;
    private double fuel = 0;

    public Auto(AutoType type,
                int seats,
                Engine engine,
                Transmission transmission,
                Color color,
                Wheels wheels,
                SoundSystem soundSystem,
                InteriorStyle interiorStyle) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.color = color;
        this.wheels = wheels;
        this.soundSystem = soundSystem;
        this.interiorStyle = interiorStyle;
    }


    public AutoType getAutoType() { return type; }
    public int getSeats() { return seats; }
    public Engine getEngine() { return engine; }
    public Transmission getTransmission() { return transmission; }
    public Color getColor() { return color; }
    public Wheels getWheels() { return wheels; }
    public SoundSystem getSoundSystem() { return soundSystem; }
    public InteriorStyle getInteriorStyle() { return interiorStyle; }

    public double getFuel() { return fuel; }
    public void setFuel(double fuel) { this.fuel = fuel; }

}
