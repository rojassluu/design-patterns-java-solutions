# design-patterns-java-solutions
Repositorio de soluciones en Java para la guía de actividad sobre Patrones de Diseño (Universidad de La Sabana).

## Participantes
* Rafael Felipe Muñoz
* Ivan Andres Venegas
* Sergio Ivan Perea
* Luisa Fernanda Rojas


# Patrones de Diseño – Soluciones (Java)

Este repositorio contiene soluciones de patrones de diseño en Java.  
Por cada ejercicio se indica: **(1) Tipo de patrón**, **(2) Patrón seleccionado**, y **(3) Diagrama de clases**.

---

## 1) Configuración de Automóvil (Builder)

**Tipo de patrón:** Creacional  
**Patrón seleccionado:** **Builder**  
**Justificación:** Este patrón permite armar un objeto complejo como un auto paso a paso, evitando constructores con demasiados parámetros. Además, separa el proceso de construcción de la forma final del objeto.

**Diagrama de clases:**

```mermaid
classDiagram
    %% ====== Director ======
    class Director {
      +constructSportsAuto(builder: Builder): void
      +constructCityAuto(builder: Builder): void
      +constructSUV(builder: Builder): void
    }

    %% ====== Builder (contrato) ======
    class Builder {
      <<interface>>
      +setType(type: AutoType): void
      +setSeats(seats: int): void
      +setEngine(engine: Engine): void
      +setTransmission(transmission: Transmission): void
      +setColor(color: Color): void
      +setWheels(wheels: Wheels): void
      +setSoundSystem(soundSystem: SoundSystem): void
      +setInteriorStyle(interiorStyle: InteriorStyle): void
    }

    %% ====== Builders concretos ======
    class AutoBuilder {
      +getResult(): Auto
    }
    class ManualBuilder {
      +getResult(): Manual
    }

    Builder <|.. AutoBuilder
    Builder <|.. ManualBuilder
    Director ..> Builder : usa

    %% ====== Productos ======
    class Auto {
      -type: AutoType
      -seats: int
      -engine: Engine
      -transmission: Transmission
      -color: Color
      -wheels: Wheels
      -soundSystem: SoundSystem
      -interiorStyle: InteriorStyle
    }

    class Manual {
      -type: AutoType
      -seats: int
      -engine: Engine
      -transmission: Transmission
      -color: Color
      -wheels: Wheels
      -soundSystem: SoundSystem
      -interiorStyle: InteriorStyle
      +print(): String
    }

    AutoBuilder --> Auto : construye
    ManualBuilder --> Manual : construye

    %% ====== Tipos de apoyo ======
    class Engine
    class AutoType
    class Transmission
    class Color
    class Wheels
    class SoundSystem
    class InteriorStyle

    Auto --> Engine
    Auto --> Transmission
    Auto --> Color
    Auto --> Wheels
    Auto --> SoundSystem
    Auto --> InteriorStyle
    Auto --> AutoType

    Manual --> Engine
    Manual --> Transmission
    Manual --> Color
    Manual --> Wheels
    Manual --> SoundSystem
    Manual --> InteriorStyle
    Manual --> AutoType

