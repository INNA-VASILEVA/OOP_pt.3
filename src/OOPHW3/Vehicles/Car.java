package OOPHW3.Vehicles;
import OOPHW3.Transport.Transport;

import java.util.Objects;

public class Car extends Transport {
    private double engineVolume;
    private static String carFuel;
    public Car(String brand, String model, int year, String country, String color, double maxSpeed, double engineVolume) {
        super(brand, model, year, country, color, maxSpeed);
        if(engineVolume<=0) this.engineVolume = 1.5; else this.engineVolume = engineVolume;
        carFuel = refill();
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    protected String refill() {
        return " Заправляйтесь бензином";
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), engineVolume);
    }

    @Override
    public String toString() {
        return "Машина " + super.toString()+ " объем двигателя " + engineVolume + " л." + carFuel;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Car car = (Car) obj;
        return Double.compare(car.engineVolume, engineVolume) == 0;
    }
}
