package OOPHW3.Animals.Birds;

import OOPHW3.Animals.Animals;

import java.util.Objects;

public abstract class Birds extends Animals {

        private String habitat;
        public Birds(String name, int age, String habitat) {
            super(name, age);
            if(habitat == null || habitat.isEmpty()) this.habitat = "небо"; else this.habitat = habitat;
        }
        public void hunt(){
            System.out.println("Птица охотится");
        }
        public String getHabitat() {
            return habitat;
        }
        public void setHabitat(String habitat) {
            if(habitat == null || habitat.isEmpty()) this.habitat = getHabitat(); else this.habitat = habitat;
        }
        @Override
        public String toString() {
            return super.toString() + " среда обитания " + habitat;
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            if (!super.equals(obj)) return false;
            Birds bird = (Birds) obj;
            return Objects.equals(habitat, bird.habitat);
        }
        @Override
        public int hashCode() {
            return Objects.hash(super.hashCode(), habitat);
        }
}
