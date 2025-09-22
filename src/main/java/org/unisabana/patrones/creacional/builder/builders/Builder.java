package org.unisabana.patrones.creacional.builder.builders;

import org.unisabana.patrones.creacional.builder.autos.AutoType;
import org.unisabana.patrones.creacional.builder.components.*;

public interface Builder {
    void setType(AutoType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setColor(Color color);
    void setWheels(Wheels wheels);
    void setSoundSystem(SoundSystem soundSystem);
    void setInteriorStyle(InteriorStyle interiorStyle);

}
