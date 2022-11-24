package OOPHW3.Vehicles;

import OOPHW3.Transport.Transport;

import java.util.Objects;

public class Train extends Transport {
    private double price;
    private String timeOfTrip;
    private String start;
    private String destination;
    private int numberOfWagons;
    private static String trainFuel;

    public Train(String brand, String model, int year, String country, String color, double maxSpeed,
                 double price, String timeOfTrip, String start, String destination, int numberOfWagons) {
        super(brand, model, year, country, color, maxSpeed);
        if (timeOfTrip == null || timeOfTrip.isEmpty()) this.timeOfTrip = getNoInfo();
        else this.timeOfTrip = timeOfTrip;
        if (start == null || start.isEmpty()) this.start = getNoInfo();
        else this.start = start;
        if (destination == null || destination.isEmpty()) this.destination = getNoInfo();
        else this.destination = destination;
        if (numberOfWagons <= 0) {
            this.numberOfWagons = 1;
        } else {
            this.numberOfWagons = numberOfWagons;
        }
        if (price <= 1000) {
            this.price = 2000;
        } else {
            this.price = price;
        }
        trainFuel = refill();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTimeOfTrip() {
        return timeOfTrip;
    }

    public void setTimeOfTrip(String timeOfTrip) {
        this.timeOfTrip = timeOfTrip;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }


    @Override
    protected String refill() {
        return " Заправляйтесь дизелем";
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), price, timeOfTrip, start, destination, numberOfWagons);
    }

    @Override
    public String toString() {
        return "Поезд " + super.toString()+ " отходит от " + start + " и следует до " + destination + " цена поездки " + price + " в поезде " + numberOfWagons+ " вагонов " + "время в пути "+ timeOfTrip + trainFuel;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Train train = (Train) obj;
        return Double.compare(train.price, price) == 0 && numberOfWagons == train.numberOfWagons && Objects.equals(timeOfTrip, train.timeOfTrip) && Objects.equals(start, train.start) && Objects.equals(destination, train.destination);
    }
}
