package Recursion;

public class Factorial {

    public static int fact(int value) {
        if(value < 0) {
            return -1;
        }
        if(value == 0 || value == 1) {
            return 1;
        }
        return value * fact(value-1);
    }
    public static void main(String[] args) {
        System.out.println(fact(10));
    }
}
