package Recursion;

public class Power {

    public static int pow(int base, int exp) {
        if(exp < 0) {
            return -1;
        }
        if(exp == 0) {
            return 1;
        }
        return base * pow(base, exp-1);
    }

    public static void main(String[] args) {
        System.out.println(pow(2, 5));
    }
}
