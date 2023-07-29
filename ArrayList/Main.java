package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10, 20, 30));
        numbers.add(100);
        numbers.add(3, 50);
        System.out.println(numbers);
        System.out.println(numbers.get(2));

        System.out.println();

        ArrayList<String> stringList = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
        System.out.println(stringList);
        System.out.println(stringList.get(1));

        System.out.println();

        for (int num: numbers) {
            System.out.print(num + " ");
        }

        System.out.println();

        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            System.out.print(word + " ");
        }

        System.out.println();
        System.out.println();

        for (String letter: stringList) {
            if(letter.equals("D")) {
                System.out.println(letter + " is found at index " + stringList.indexOf(letter));
                break;
            }
        }

        System.out.println();

        stringList.remove(1);
        stringList.remove("D");
        System.out.println("After removing 2nd and 'D' element from arraylist: " + stringList);

    }
}
