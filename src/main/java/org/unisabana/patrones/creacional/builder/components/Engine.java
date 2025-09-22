package org.unisabana.patrones.creacional.builder.components;

public class Engine {
    private final double volume;
    private double mileage;
    private boolean started;

    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    public String toString() {
        return "Engine{volume=" + volume + ", mileage=" + mileage + ", started=" + started + "}";
    }

}
