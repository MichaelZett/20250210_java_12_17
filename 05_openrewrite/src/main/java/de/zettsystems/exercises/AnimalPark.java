package de.zettsystems.exercises;

public class AnimalPark {
    public static void main(String[] args) {
        Animal dog1 = new ParkDog("Bob");

        // TODO use new Java api
        if (dog1 instanceof ParkDog) {
            ParkDog d1 = (ParkDog) dog1;
            play(d1);
        }

        Animal dog2 = new ParkDog("Bob");
        // TODO use new Java api
        System.out.println("\nAre both equal? " + dog1.equals(dog2));
    }

    static void play(ParkDog d) {
        System.out.println("Playing with Dog...");
        d.makeSound();
    }

    static void play(ParkCat c) {
        System.out.println("Playing with Cat...");
        c.makeSound();
    }
}

class Animal {
    void makeSound() {
        System.out.println("Generic sound");
    }
}

class ParkCat extends Animal {
    void makeSound() {
        System.out.println("Miau");
    }
}

class ParkDog extends Animal {
    private String name;

    ParkDog(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println("Au au");
    }

    // TODO use new Java api
    public boolean equals(Object o) {
        // need to check if is the same type
        if (!(o instanceof ParkDog))
            return false;
        // then we cast to work with this type
        ParkDog d1 = (ParkDog) o;
        // only now we can performe our [business] logic to compare
        return d1.name.equals(name);
    }

}