package org.unisabana.patrones.creacional.builder.builders;

import org.unisabana.patrones.creacional.builder.autos.Auto;
import org.unisabana.patrones.creacional.builder.autos.AutoType;
import org.unisabana.patrones.creacional.builder.components.Engine;
import org.unisabana.patrones.creacional.builder.components.Transmission;
import org.unisabana.patrones.creacional.builder.components.Color;
import org.unisabana.patrones.creacional.builder.components.Wheels;
import org.unisabana.patrones.creacional.builder.components.SoundSystem;
import org.unisabana.patrones.creacional.builder.components.InteriorStyle;

public class AutoBuilder implements Builder {
        private AutoType type;
        private int seats;
        private Engine engine;
        private Transmission transmission;
        private Color color;
        private Wheels wheels;
        private SoundSystem soundSystem;
        private InteriorStyle interiorStyle;

        @Override public void setType(AutoType type) { this.type = type; }
        @Override public void setSeats(int seats) { this.seats = seats; }
        @Override public void setEngine(Engine engine) { this.engine = engine; }
        @Override public void setTransmission(Transmission transmission) { this.transmission = transmission; }
        @Override public void setColor(Color color) { this.color = color; }
        @Override public void setWheels(Wheels wheels) { this.wheels = wheels; }
        @Override public void setSoundSystem(SoundSystem soundSystem) { this.soundSystem = soundSystem; }
        @Override public void setInteriorStyle(InteriorStyle interiorStyle) { this.interiorStyle = interiorStyle; }


        public Auto getResult() {
            if (type == null) throw new IllegalStateException("AutoType Missing");
            if (engine == null) throw new IllegalStateException("Engine Missing");
            if (transmission == null) throw new IllegalStateException("Transmission Missing");
            if (seats <= 0) throw new IllegalStateException("Invalid Seats");

            return new Auto(
                    type, seats, engine, transmission,
                    color, wheels, soundSystem, interiorStyle
            );
        }
}
