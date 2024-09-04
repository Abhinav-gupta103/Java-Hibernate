package com.interview;

class Engine {
    String type;

    public Engine(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Engine [type=" + type + "]";
    }

}

class Car {
    String model;
    Engine engine;

    Car(String model, String engineType) {
        this.model = model;
        this.engine = new Engine(engineType);
    }

    @Override
    public String toString() {
        return "Car [model=" + model + ", engine=" + engine + "]";
    }
}

public class Composition {
    public static void main(String[] args) {
        Car car = new Car("Sedan", "V8");
        System.out.println(car);
    }
}
