package ua.step.example.solid.model3.L.ex2;

public class ToyCar  {
    String sound;
    Car car;

    public ToyCar() {
        car = new Car();
    }

    public ToyCar(String sound, Car car) {
        this.sound = sound;
        this.car = car;
    }

    void speedUp(){
        car.speedUp();
    }
}
