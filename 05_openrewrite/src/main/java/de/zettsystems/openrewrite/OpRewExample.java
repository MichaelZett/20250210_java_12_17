package de.zettsystems.openrewrite;

public class OpRewExample {

    public static void main(String[] args) {

        // Multiline-String auf die klassische Art (Java 11)
        String multilineString = "Hallo,\n"
                + "dies ist ein mehrzeiliger String.\n"
                + "In Java 11 schreiben wir ihn so,\n"
                + "um ihn dann mit OpenRewrite modernisieren zu können.";
        System.out.println(multilineString);

        // Klassische instanceof-Prüfung (vor Pattern Matching)
        Object obj = "Hello World";
        if (obj instanceof String) {
            String s = (String) obj;
            System.out.println("Objekt ist ein String: " + s);
        }

        // Klassisches Switch-Statement (vor Switch Expression)
        int dayOfWeek = 2;
        switch (dayOfWeek) {
            case 1:
                System.out.println("Montag");
                break;
            case 2:
                System.out.println("Dienstag");
                break;
            default:
                System.out.println("Andere Wochentage");
        }
    }
}
