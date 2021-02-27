package main;

public class Mammal extends Animal {

    public Mammal(String name, int year) {
        super(name, year);
    }

    public String move() {
        return "Walks";
    }

    public String breath() {
        return "Lungs";
    }

    public String reproduce() {
        return "Live births";
    }
}
