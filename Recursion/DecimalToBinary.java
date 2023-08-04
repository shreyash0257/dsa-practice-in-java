package Recursion;

public class DecimalToBinary {

    public static int binary(int n) {
        if(n == 0) {
            return 0;
        }
        return n%2 + 10*binary(n/2);
    }

    public static void main(String[] args) {
        System.out.println(binary(10));
    }
}
