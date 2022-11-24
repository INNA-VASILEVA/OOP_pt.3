package OOPHW3.Animals.Mammals;

import java.util.Objects;

public class Predator extends Mammal {

        private String typeOfFood;
        public Predator(String name, int age, String habitat, double speedOfMoving) {
            super(name, age, habitat, speedOfMoving);
            this.typeOfFood = " в основном мясо";
        }
        public void hunt(){
            System.out.println(getName() + " охотится");
        }
        public String getTypeOfFood() {
            return typeOfFood;
        }
        public void setTypeOfFood(String typeOfFood) {
            if(typeOfFood == null || typeOfFood.isEmpty()) this.typeOfFood = getTypeOfFood(); else this.typeOfFood = typeOfFood;
        }
        @Override
        public void move() {
            System.out.println(getName() + " патрулирует");
        }
        @Override
        public void sleep() {
            System.out.println(getName() + " спит");
        }
        @Override
        public void eat() {
            System.out.println(getName() + " кушает " + getTypeOfFood());
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
            Predator predator = (Predator) obj;
            return Objects.equals(typeOfFood, predator.typeOfFood);
        }
        @Override
        public int hashCode() {
            return Objects.hash(super.hashCode(), typeOfFood);
        }
}
