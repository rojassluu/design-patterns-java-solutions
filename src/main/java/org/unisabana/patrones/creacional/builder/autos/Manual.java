package org.unisabana.patrones.creacional.builder.autos;

import org.unisabana.patrones.creacional.builder.components.*;

public class Manual {
    private final AutoType type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final Color color;
    private final Wheels wheels;
    private final SoundSystem soundSystem;
    private final InteriorStyle interiorStyle;

    public Manual(AutoType type,
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


    public String print() {
        return """
               Car Specification
               ----------------
                Type           : %s
                Seats          : %d
                Engine         : %s
                Transmission   : %s
                Color          : %s
                Wheels         : %s
                Audio          : %s
                Interior       : %s
               """.formatted(
                safe(type), seats, safe(engine), safe(transmission), safe(color), safe(wheels), safe(soundSystem), safe(interiorStyle)
        );
    }


    private static String safe(Object o) {
        return (o == null) ? "N/A" : o.toString();
    }

    @Override
    public String toString() {
        return "Manual{" +
                "type=" + type +
                ", seats=" + seats +
                ", engine=" + engine +
                ", transmission=" + transmission +
                ", color=" + color +
                ", wheels=" + wheels +
                ", soundSystem=" + soundSystem +
                ", interiorStyle=" + interiorStyle +
                '}';
    }
}
