package de.zettsystems.solution12_15;

public class User {
    public static void main(String[] args) {
        // TODO could we create the String better?
        System.out.println("Im Sommer tragen wir: %s".formatted(ClothingService.decideCloths(Season.SUMMER)));
//        System.out.printf("Im Sommer tragen wir: %s%n", ClothingService.decideCloths(Season.SUMMER));

    }
}
