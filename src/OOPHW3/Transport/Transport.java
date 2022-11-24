package OOPHW3.Transport;

import java.util.Objects;

abstract public class Transport {
        private String brand;
        private String model;
        private int year;
        private String country;
        private String color;
        private double maxSpeed;
        private static final String noInfo = "Информация не указана";

        public Transport(String brand, String model, int year, String country, String color, double maxSpeed) {
            if(brand == null || brand.isEmpty()) this.brand = noInfo; else this.brand = brand;
            if(model == null || model.isEmpty()) this.model = noInfo; else this.model = model;
            if (year <= 0) {
                this.year = 2000;
            } else {
                this.year = year;
            }
            if(country == null || country.isEmpty()) this.country = noInfo; else this.country = country;
            if(color == null || color.isEmpty()) this.color = noInfo; else this.color = color;
            if (maxSpeed <= 0) {
                this.maxSpeed = 120.0;
            } else {
                this.maxSpeed = maxSpeed;
            }
        }

        public int getYear() {
            return year;
        }

        public String getCountry() {
            return country;
        }

        public String getNoInfo() {
            return noInfo;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            if(brand ==null||brand.isEmpty())this.brand =noInfo; else this.brand =brand;

        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            if(model == null || model.isEmpty()) this.model = noInfo; else this.model = model;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            if(color == null || color.isEmpty()) this.color = noInfo; else this.color = color;

        }

        public double getMaxSpeed() {
            return maxSpeed;
        }

        public void setMaxSpeed(double maxSpeed) {
            if (maxSpeed <= 0) {
                this.maxSpeed = 120.0;
            } else {
                this.maxSpeed = maxSpeed;
            }
        }
    protected abstract String refill();


    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year, country, color, maxSpeed);
    }

    @Override
    public String toString() {
        return brand + " модель " + model + " год выпуска " + year + " Страна " + country + " цвет " + color + " скорость передвижения " + maxSpeed +" км/ч";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Transport transport = (Transport) obj;
        return year == transport.year && Double.compare(transport.maxSpeed, maxSpeed) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(country, transport.country) && Objects.equals(color, transport.color);
    }
}
