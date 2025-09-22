package org.unisabana.patrones.creacional.builder;

import org.unisabana.patrones.creacional.builder.autos.Auto;
import org.unisabana.patrones.creacional.builder.autos.Manual;
import org.unisabana.patrones.creacional.builder.builders.AutoBuilder;
import org.unisabana.patrones.creacional.builder.builders.ManualBuilder;
import org.unisabana.patrones.creacional.builder.director.Director;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        AutoBuilder builder = new AutoBuilder();
       director.constructSportsAuto(builder);


        Auto auto = builder.getResult();
        System.out.println("Car built:\n" + auto.getAutoType());


        ManualBuilder manualBuilder = new ManualBuilder();

        director.constructSportsAuto(manualBuilder);
        Manual manual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + manual.print());
    }

}
