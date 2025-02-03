package de.zettsystems.misc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java12NewMethods {
    public static void main(String[] args) throws IOException {
        stringMethods();
        showMismatch();
        teeing();
        numberFormat();
    }

    /**
     * indent, transform
     */
    public static void stringMethods() {
        String text = "Hello World!\nDas hier ist Java 12.";

        text = text.indent(4);
        System.out.println(text);

        text = text.indent(-10);
        System.out.println(text);

        String transformed = text.transform(value ->
                new StringBuilder(value).reverse().toString()
        );
        System.out.println(transformed);
    }

    /**
     * mismatch
     */
    public static void showMismatch() throws IOException {
        System.out.println("**************_File_**************");

        Path filePath1 = Files.createTempFile("file1", ".txt");
        Path filePath2 = Files.createTempFile("file2", ".txt");
        Files.writeString(filePath1, "Java 12");
        Files.writeString(filePath2, "Java 12");

        long mismatch = Files.mismatch(filePath1, filePath2);
        System.out.println("Files sind gleich: " + (mismatch == -1L));

        Path filePath3 = Files.createTempFile("file3", ".txt");
        Path filePath4 = Files.createTempFile("file4", ".txt");
        Files.writeString(filePath3, "Java 12");
        Files.writeString(filePath4, "Java 13");

        mismatch = Files.mismatch(filePath3, filePath4);
        System.out.println("Files sind unterschiedlich an Position: " + mismatch);
    }

    /**
     * 2 downstream collectoren und eine merge-Funktion
     */
    public static void teeing() {
        System.out.println("**************_Collectors_**************");
        double mean = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .collect(Collectors.teeing(Collectors.summingDouble(i -> i),
                        Collectors.counting(), (sum, count) -> sum / count));
        System.out.println("Mittelwert ist: " + mean);
    }

    public static void numberFormat() {
        System.out.println("**************_Number Format_**************");
        NumberFormat likesShort =
                NumberFormat.getCompactNumberInstance(new Locale("de", "DE"), NumberFormat.Style.SHORT);
        likesShort.setMaximumFractionDigits(2);
        System.out.println("Short Format: " + likesShort.format(1887));

        NumberFormat likesLong =
                NumberFormat.getCompactNumberInstance(new Locale("de", "DE"), NumberFormat.Style.LONG);
        likesLong.setMaximumFractionDigits(2);
        System.out.println("Long Format: " + likesLong.format(1887));
    }

}
