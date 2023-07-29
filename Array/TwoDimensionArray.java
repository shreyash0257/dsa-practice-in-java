package Array;

public class TwoDimensionArray {
    int[][] arr = null;

    public TwoDimensionArray(int row, int col) {
        arr = new int[row][col];
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    // Array Insertion
    public void insert(int row, int col, int valueInserted) {
        try {
            if(arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = valueInserted;
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
                for(int j=0; j<arr[0].length; j++) {
                    System.out.println(arr[i][j] + " ");
                }
            }
        } catch(Exception e) {
            System.out.println("Array doesn't exist.");
        }
    }

    // Search an element in the array (Linear)
    public void search(int valueToSearch) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                if(arr[i][j] == valueToSearch) {
                    System.out.println(valueToSearch + " found at: " + i + "," + j);
                    return;
                }
            }
        }
        System.out.println(valueToSearch + " is not found in the array.");
    }

    // Delete value from array
    public  void deleteValue(int row, int col) {
        try {
            arr[row][col] = Integer.MIN_VALUE;
            System.out.println("Successfully deleted.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of range.");
        }
    }
}
