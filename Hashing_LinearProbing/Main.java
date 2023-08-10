package Hashing_LinearProbing;

public class Main {
    public static void main(String[] args) {
        LinearProbing linearProbing = new LinearProbing(15);
        linearProbing.insertInHashTable("secret");
        linearProbing.insertInHashTable("invasion");
        linearProbing.insertInHashTable("marvel");
        linearProbing.insertInHashTable("flash");
        linearProbing.insertInHashTable("optimus");
        linearProbing.displayHashTable();

        linearProbing.searchHashTable("optimus");
        linearProbing.deleteKeyHashTable("marvel");
        linearProbing.deleteKeyHashTable("great");
        linearProbing.displayHashTable();
    }
}
