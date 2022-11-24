import OOPHW3.Transport.Transport;
import OOPHW3.Vehicles.Bus;
import OOPHW3.Vehicles.Car;
import OOPHW3.Vehicles.Train;

public class Main {
    public static void main(String[] args) {
        Transport lastochka = new Train("Ласточка","В-901", 2011, "Россия","",301.0,3500, "10 часов", "Белоруский вокзал", "Минск-Пассажирский",11);
        Transport leningrad = new Train("Ленинград", "D-125", 2019, "Россия", "", 270.0,1700, "6 часов", "Ленинградский вокзал", "Ленинград-Пассажирский", 8);
        System.out.println(lastochka);
        System.out.println(leningrad);

        Transport daewoo = new Bus("Daewoo", "BS106 Royal Star", 2015, "Корея", "Серебристый", 80.0);
        Transport isuzu = new Bus("ISUZU", "А-092Н6", 2017, "Япония", "Красный", 100.0);
        Transport yutong = new Bus("Yutong", "ZK6720D", 2015, "Китай", "Белый", 90.0);
        System.out.println(daewoo);
        System.out.println(isuzu);
        System.out.println(yutong);


        Transport lada = new Car("Lada", "Granta", 2015, "Россия", "Желтый",150.0,1.9);
        Transport audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "Черный", 220.0,3.0);
        Transport bmw = new Car("BMW", "Z8", 2021, "Германия", "Черный", 240,3.0);
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
    }


}