package OOPHW3.Animals;

import OOPHW3.Animals.Amphibians.Amphibians;
import OOPHW3.Animals.Birds.Birds;
import OOPHW3.Animals.Birds.Flightless;
import OOPHW3.Animals.Birds.Flying;
import OOPHW3.Animals.Mammals.Herbivore;
import OOPHW3.Animals.Mammals.Mammal;
import OOPHW3.Animals.Mammals.Predator;

public class AnimalBook {
    public static void main(String[] args) {
        Animals gazelle = new Herbivore("Газель", 3, "засушливая Африка", 49.0);
        Mammal giraffe = new Herbivore("Жираф" , 2, "засушливая Африка", 39.0);
        Herbivore horse = new Herbivore("Лошадь", 6, "зелёные равнины", 59.0);

        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);

        Animals hyena = new Predator("Гиена", 3, "в Африке", 30.0);
        Mammal tiger = new Predator("Тигр", 4, "на Амуре", 48.0);
        Predator bear = new Predator("Медведь", 5, "в лесах", 45.0);

        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(bear);

        Animals frog = new Amphibians("Лягушка", 1, "водоёмы");
        Amphibians snake = new Amphibians("Уж пресноводный", 1, "водоёмы");

        System.out.println(frog);
        System.out.println(snake);

        Animals peacock = new Flightless("Павлин", 1, "в Индии");
        Birds penguin = new Flightless("Пингвин", 1, "в Антарктиде");
        Flightless dodo = new Flightless("Птица Додо", 2, "о. Маврикий. Вымерший вид");

        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(dodo);

        Animals seagull = new Flying("Чайка", 2, "в морском небе");
        Birds albatross = new Flying("Альбатрос", 2, "в Южном океане");
        Flying falcon = new Flying("Сокол", 3, "повсеместно");

        System.out.println(seagull);
        System.out.println(albatross);
        System.out.println(falcon);

    }
}
