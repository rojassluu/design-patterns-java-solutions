package org.unisabana.patrones.creacional.builder.builders;

import org.unisabana.patrones.creacional.builder.autos.AutoType;
import org.unisabana.patrones.creacional.builder.autos.Manual;
import org.unisabana.patrones.creacional.builder.components.*;

public class ManualBuilder implements Builder{
    private AutoType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private Color color;
    private Wheels wheels;
    private SoundSystem soundSystem;
    private InteriorStyle interiorStyle;

    @Override
    public void setType(AutoType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setColor(Color color) { this.color = color; }

    @Override
    public void setWheels(Wheels wheels) { this.wheels = wheels; }

    @Override
    public void setSoundSystem(SoundSystem soundSystem) { this.soundSystem = soundSystem; }

    @Override
    public void setInteriorStyle(InteriorStyle interiorStyle) { this.interiorStyle = interiorStyle; }

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, color, wheels, soundSystem, interiorStyle);
    }

}
