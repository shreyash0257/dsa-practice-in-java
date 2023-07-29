package Array;

public class SingleDimensionArray {
    int[] arr = null;

    public SingleDimensionArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i=0; i<arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    // Array Insertion
    public void insert(int location, int valueInserted) {
        try {
            if(arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueInserted;
                System.out.println("Successfully Inserted.");
            } else {
                System.out.println("This cell is full.");
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index accessed.");
        }
    }

    // Array Traversal
    public void traverseArray() {
        try {
            for (int i=0; i<arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        } catch(Exception e) {
            System.out.println("Array doesn't exist.");
        }
    }

    // Search an element in the array (Linear)
    public void search(int valueToSearch) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == valueToSearch) {
                System.out.println(valueToSearch+ " found at: " + i);
                return;
            }
        }
        System.out.println(valueToSearch + " is not found in the array.");
    }

    // Delete value from array
    public  void deleteValue(int index) {
        try {
            arr[index] = Integer.MIN_VALUE;
            System.out.println("Successfully deleted.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of range.");
        }
    }
}
