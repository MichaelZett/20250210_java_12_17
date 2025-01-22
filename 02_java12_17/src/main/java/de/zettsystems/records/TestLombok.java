package de.zettsystems.records;

public class TestLombok {
    public static void main(String[] args) {
        CustomerValidatingConstructor testee = new CustomerValidatingConstructor("null");
        System.out.println(testee);
    }
}
