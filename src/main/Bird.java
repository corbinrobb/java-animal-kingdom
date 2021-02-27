package main;

public class Bird extends Animal {

    public Bird(String name, int year) {
        super(name, year);
    }

    public String move() {
        return "Flies";
    }

    public String breath() {
        return "Lungs";
    }

    public String reproduce() {
        return "Eggs";
    }
}
