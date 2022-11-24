package OOPHW3.Animals;

import java.util.Objects;

public class Animals {
    String name;
    int age;

    public Animals(String name, int age) {
        if(name == null || name.isEmpty()) this.name = "неизвестное животное"; else this.name = name;
        this.age = Math.abs(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty()) this.name = getName(); else this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if(age<0) this.age = getAge(); else this.age = age;
    }
    public void eat (){
        System.out.println("Животное ест");
    }
    public void sleep (){
        System.out.println("Животное спит");
    }
    public void move () {
        System.out.println("Животное двигается");
    }

    @Override
    public String toString() {
        return name + " возраст " + age;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animals animal = (Animals) obj;
        return age == animal.age && Objects.equals(name, animal.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
