package OOPHW3.Animals.Mammals;

import java.util.Objects;

public class Herbivore extends Mammal {

        private String typeOfFood;
        public Herbivore(String name, int age, String habitat, double speedOfMoving) {
            super(name, age, habitat, speedOfMoving);
            this.typeOfFood = " много травы";
        }
        public void graze(){
            System.out.println(getName() + " пасётся");
        }
        public String getTypeOfFood() {
            return typeOfFood;
        }
        public void setTypeOfFood(String typeOfFood) {
            if(typeOfFood == null || typeOfFood.isEmpty()) this.typeOfFood = getTypeOfFood(); else this.typeOfFood = typeOfFood;
        }
        @Override
        public void eat() {
            System.out.println(getName() + " кушает " + getTypeOfFood());
        }
        @Override
        public void sleep() {
            System.out.println(getName() + " спит");
        }
        @Override
        public void move() {
            System.out.println(getName() + " неторопливо");
        }
        @Override
        public String toString() {
            return super.toString() + typeOfFood + " относится к классу " + getClass();
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            if (!super.equals(obj)) return false;
            Herbivore herbivore = (Herbivore) obj;
            return Objects.equals(typeOfFood, herbivore.typeOfFood);
        }
        @Override
        public int hashCode() {
            return Objects.hash(super.hashCode(), typeOfFood);
        }
}
