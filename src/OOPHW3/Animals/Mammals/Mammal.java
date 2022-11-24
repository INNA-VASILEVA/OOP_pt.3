package OOPHW3.Animals.Mammals;

import OOPHW3.Animals.Animals;

import java.util.Objects;

public class Mammal extends Animals {

        private String habitat;
        private double speedOfMoving;
        public Mammal(String name, int age, String habitat, double speedOfMoving) {
            super(name, age);
            if(habitat == null || habitat.isEmpty()) this.habitat = "неизвестная среда обитания"; else this.habitat = habitat;
            this.speedOfMoving = Math.abs(speedOfMoving);
        }
        public void walk(){
            System.out.println("Млекопитающее гуляет");
        }
        public String getHabitat() {
            return habitat;
        }
        public void setHabitat(String habitat) {
            if(habitat == null || habitat.isEmpty()) this.habitat = getHabitat(); else this.habitat = habitat;
        }
        public double getSpeedOfMoving() {
            return speedOfMoving;
        }
        public void setSpeedOfMoving(double speedOfMoving) {
            if(speedOfMoving < 0) this.speedOfMoving = getSpeedOfMoving(); else this.speedOfMoving = speedOfMoving;
        }
        @Override
        public String toString() {
            return super.toString() + " среда обитания " + habitat + " скорость передвижения " + speedOfMoving;
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            if (!super.equals(obj)) return false;
            Mammal mammal = (Mammal) obj;
            return Double.compare(mammal.speedOfMoving, speedOfMoving) == 0 && Objects.equals(habitat, mammal.habitat);
        }
        @Override
        public int hashCode() {
            return Objects.hash(super.hashCode(), habitat, speedOfMoving);
        }
}
