package OOPHW3.Animals.Birds;

import java.util.Objects;

public class Flying extends Birds{
    private String wayToMove;
    public Flying(String name, int age, String habitat) {
        super(name, age, habitat);
        wayToMove = " с помощью крыльев";
    }
    public void flight(){
        System.out.println("Птичка летает");
    }
    public String getWayToMove() {
        return wayToMove;
    }
    public void setWayToMove(String wayToMove) {
        if(wayToMove == null || wayToMove.isEmpty()) this.wayToMove = getWayToMove(); else this.wayToMove = wayToMove;
    }
    @Override
    public void hunt() {
        System.out.println(getName() + " охотится");
    }
    @Override
    public void eat() {
        System.out.println(getName() + " клюёт еду");
    }
    @Override
    public void sleep() {
        System.out.println(getName() + " спит");
    }
    @Override
    public void move() {
        System.out.println(getName() + getWayToMove());
    }
    @Override
    public String toString() {
        return super.toString() + wayToMove + " относится к классу " + getClass();
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Flying flying = (Flying) obj;
        return Objects.equals(wayToMove, flying.wayToMove);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), wayToMove);
    }
}
