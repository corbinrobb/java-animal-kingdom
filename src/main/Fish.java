package main;

public class Fish extends Animal {

    public Fish(String name, int year) {
        super(name, year);
    }

    public String move() {
        return "Swims";
    }

    public String breath() {
        return "Gills";
    }

    public String reproduce() {
        return "Eggs";
    }
}
