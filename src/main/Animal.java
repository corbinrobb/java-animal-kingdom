package main;

abstract class Animal {
    private static int maxId = 0;
    private int id;
    private String name;
    private int year;

//    public Animal() {
//
//    }

    public Animal(String name, int year) {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.year = year;
    }


    public String eat() {
        return "Consumed food";
    }

    public String getName() {
        return name;
    }

    abstract String move();

    abstract String breath();

    abstract String reproduce();

}
