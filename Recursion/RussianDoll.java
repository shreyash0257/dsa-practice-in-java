package Recursion;

public class RussianDoll {
    public static void openRussianDoll(int doll) {
        if(doll == 1) {
            System.out.println("This is the last doll.");
        } else {
            System.out.print("Opened doll " + doll + " , now dolls remaining are ");
            System.out.print(doll-1);
            System.out.println();
            openRussianDoll(doll-1);
        }
    }
    public static void main(String[] args) {
        openRussianDoll(5);
    }
}
