package OOPHW3.Vehicles;

import OOPHW3.Transport.Transport;

public class Bus extends Transport {
    private static String busFuel;
    public Bus(String brand, String model, int year, String country, String color, double maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);
        busFuel = refill();
    }
    public String toString(){
        return "Автобус " + super.toString() + " " + busFuel;
    }
    @Override
    protected String refill() {
        return " Заправляемся бензином либо дизелем";
    }

}
