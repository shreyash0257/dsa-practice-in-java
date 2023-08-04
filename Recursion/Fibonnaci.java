package Recursion;

public class Fibonnaci {

    public static int Fib(int value) {
        if(value < 0) {
            return -1;
        }
        if(value == 0 || value == 1) {
            return value;
        }
        return Fib(value-1) + Fib(value-2);
    }
    public static void main(String[] args) {
        System.out.println(Fib(10));
    }
}
