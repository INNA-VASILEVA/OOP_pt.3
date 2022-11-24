package OOPHW3.Animals.Amphibians;

import OOPHW3.Animals.Animals;

import java.util.Objects;

public class Amphibians extends Animals {
        private String habitat;

        public Amphibians(String name, int age, String habitat) {
            super(name, age);
            if (habitat == null || habitat.isEmpty()) this.habitat = "неизвестная среда обитания";
            else this.habitat = habitat;
        }

        public void hunt() {
            System.out.println("Земноводное животное охотится");
        }

        public String getHabitat() {
            return habitat;
        }

        public void setHabitat(String habitat) {
            if (habitat == null || habitat.isEmpty()) this.habitat = getHabitat();
            else this.habitat = habitat;
        }

        @Override
        public void eat() {
            System.out.println(getName() + " кушает");
        }

        @Override
        public void sleep() {
            System.out.println(getName() + " спит");
        }

        @Override
        public void move() {
            System.out.println(getName() + " плавает");
        }

        @Override
        public String toString() {
            return super.toString() + habitat + " относится к классу " + getClass();
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            if (!super.equals(obj)) return false;
            Amphibians amphibians = (Amphibians) obj;
            return Objects.equals(habitat, amphibians.habitat);
        }

        @Override
        public int hashCode() {
            return Objects.hash(super.hashCode(), habitat);
        }
    }

