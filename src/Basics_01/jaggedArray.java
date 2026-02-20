package Basics_01;

import java.util.Scanner;

public class jaggedArray {
    /*In Java, a Jagged array is a multidimensional array where each row can have a different number of columns.
    When we work with a jagged array, one thing to keep in mind is that the inner array can be of different lengths.
    It is like a 2D array, but each row can have a different number of elements.*/

    public static void main(String[] args) {
        int arr[][]= new int[2][]; // Declaring a 2-D array with 2 rows
        // PHASE 1: Declaration
        // We define the number of rows (2), but leave the column size empty [].
        // At this point, arr[0] and arr[1] are 'null'.

        // making the above array jagged
        //----------------------------------
        // PHASE 2: Individual Row Allocation (Making it "Jagged")
        // We manually define the size of each row.
        arr[0] = new int[4]; // Row 0 will have 4 columns
        arr[1] = new int[3]; // Row 1 will have 3 columns

        //Initializing the array
        // PHASE 3: Initializing the array
        // 'count' acts as our data generator, starting from 0.
        int count = 0;

        // Outer loop (i) navigates through the rows.
        for(int i = 0; i < arr.length; i++){
            // Inner loop (j) navigates through the columns of the CURRENT row (arr[i]).
            // Notice we use 'arr[i].length' because each row has a different size!
            for (int j = 0; j < arr[i].length; j++){
                // Assign the current count to the specific coordinate [i][j]
                // then increment count by 1 for the next iteration.
                arr[i][j] = count++;
            }
        }
        for( int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                // Print elements in the same row separated by a space
                System.out.print(arr[i][j] + " ");
            }
            // After printing all columns of a row, move to the next line
            System.out.println();
        }
    }

}
/*
Output:
---------
0 1 2 3
4 5 6
*/


// Example of a Triangular Jagged Array
//--------------------------------------------------------------------------------------------------------
class jagged2D {
    public static void main(String[] args) {
        // Define the total number of rows (the "height" of our triangle)
        int r = 5;

        // PHASE 1: Create the 'Rows' container
        // We initialize the 2D array with 5 rows, but the columns are still empty (null)
        int arr[][] = new int[r][];

        // PHASE 2: Dynamic Row Allocation (The Triangular Logic)
        // We loop through each row and set its column size based on its row index
        for (int i = 0; i < arr.length; i++) {
            // Row 0 gets 1 col (0+1), Row 1 gets 2 cols (1+1), Row 2 gets 3 cols (2+1)...
            // This creates a "staircase" or triangular memory structure.
            arr[i] = new int[i + 1];
        }

        // PHASE 3: Data Injection
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            // arr[i].length changes every time the outer loop moves to the next row
            for (int j = 0; j < arr[i].length; j++) {
                // Assign the current value of count and then increment it
                arr[i][j] = count ++;
            }
        }
        // PHASE 4: Printing the Jagged Result
        System.out.println("Contents of a 2-D Jagged array");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // Print elements in the same row with a space
                System.out.print(arr[i][j] + " ");
            }
            // After finishing one "staircase" step, move to the next line
            System.out.println();
        }
    }
}

/*Output:
Contents of a 2-D Jagged array
        0
        1 2
        3 4 5
        6 7 8 9
        10 11 12 13 14

Logic Breakdown: Why new int[i + 1]?
This is the "Plus Ultra" part of your logic.
By using i + 1, you ensure the array grows as you go down.
This pattern is mathematically known as a Lower Triangular Matrix.
*/

/*Real-World Use of This Specific Pattern:
This exact "Triangular" structure is used in:

Pascal's Triangle: Used in probability and binomial expansions.

Network Handshakes: If you have 5 people and everyone needs to shake hands with everyone else once,
this array structure tracks those unique interactions without duplicates.*/


