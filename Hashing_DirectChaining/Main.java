package Hashing_DirectChaining;

public class Main {
    public static void main(String[] args) {
        DirectChaining directChaining = new DirectChaining(10);
        directChaining.insertHashTable("The");
        directChaining.insertHashTable("Good");
        directChaining.insertHashTable("Away");
        directChaining.insertHashTable("Hello");
        directChaining.insertHashTable("Get It");

        directChaining.displayHashTable();
        directChaining.search("Away");

        directChaining.deleteKeyHashTable("The");
        directChaining.displayHashTable();
    }
}
