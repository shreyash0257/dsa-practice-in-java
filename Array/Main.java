package Array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SingleDimensionArray sda = new SingleDimensionArray(5);

        sda.insert(0,10);
        sda.insert(1,20);
        sda.insert(2,30);

        System.out.println(Arrays.toString(sda.arr));
        System.out.println(sda.arr[0]);
        sda.search(30);
        sda.deleteValue(1);
        System.out.println(sda.arr[1]);

        System.out.println();

        TwoDimensionArray tda = new TwoDimensionArray(3, 3);

        tda.insert(0,0,10);
        tda.insert(1,2,40);

        System.out.println(Arrays.deepToString(tda.arr));
        System.out.println(tda.arr[0][0]);      // accessing element
        tda.search(40);
        tda.deleteValue(0,0);
        System.out.println(tda.arr[0][0]);
    }
}
