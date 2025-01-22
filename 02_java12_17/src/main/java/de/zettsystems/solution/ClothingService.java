package de.zettsystems.solution;

public final class ClothingService {
    private ClothingService() {
        // not intended
    }

    // TODO use new Java api
    public static String decideCloths(Season season) {
        return switch (season) {
            case SPRING, AUTUMN -> "PULLOVER";
            case SUMMER -> "T-SHIRT";
            case WINTER -> "JACKET";
        };
    }
}
