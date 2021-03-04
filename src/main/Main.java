package main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();

        animals.add(new Mammal("Panda", 1869));
        animals.add(new Mammal("Zebra", 1778));
        animals.add(new Mammal("Koala", 1816));
        animals.add(new Mammal("Sloth", 1804));
        animals.add(new Mammal("Armadillo", 1758));
        animals.add(new Mammal("Raccoon", 1758));
        animals.add(new Mammal("Bigfoot", 2021));
        animals.add(new Bird("Pigeon", 1837));
        animals.add(new Bird("Peacock", 1821));
        animals.add(new Bird("Toucan", 1758));
        animals.add(new Bird("Parrot", 1824));
        animals.add(new Bird("Swan", 1758));
        animals.add(new Fish("Salmon", 1758));
        animals.add(new Fish("Catfish", 1817));
        animals.add(new Fish("Perch", 1758));

        animals.sort(Comparator.comparingInt(Animal::getYear).reversed());

        printList(animals);

        animals.sort(Comparator.comparing(Animal::getName));

        printList(animals);

        animals.sort(Comparator.comparing(Animal::move));

        printList(animals);

        List<Animal> lungsAnimals = animals
                .stream()
                .filter(animal -> animal.breath().equals("Lungs"))
                .collect(Collectors.toList());

        printList(lungsAnimals);

        List<Animal> lungsAnd1758Animals = animals
                .stream()
                .filter(animal -> animal.breath().equals("Lungs") && animal.getYear() == 1758)
                .collect(Collectors.toList());

        printList(lungsAnd1758Animals);

        List<Animal> lungsAndEggsAnimals = animals
                .stream()
                .filter(animal -> animal.breath().equals("Lungs") && animal.reproduce().equals("Eggs"))
                .collect(Collectors.toList());

        printList(lungsAndEggsAnimals);

        List<Animal> alphaAnd1758 = animals
                .stream()
                .filter(animal -> animal.getYear() == 1758)
                .sorted(Comparator.comparing(Animal::getName))
                .collect(Collectors.toList());

        printList(alphaAnd1758);

        List<Animal> alphaAndMammal = animals
                .stream()
                .filter(animal -> animal.getClass().getSimpleName().equals("Mammal"))
                .sorted(Comparator.comparing(Animal::getName))
                .collect(Collectors.toList());

        printList(alphaAndMammal);
    }

    public static void printList(List list) {
        for(Object item : list)
            System.out.println(item);

        System.out.println();
    }
}
