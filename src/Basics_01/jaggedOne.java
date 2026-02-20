// Example of User Input Jagged Array
package Basics_01;

import java.util.Scanner;

public class jaggedOne{
    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner sc = new Scanner(System.in);

        // PHASE 1: Define the "Outer" Array
        // Ask the user how many rows (sub-arrays) the main array should hold
        System.out.println("Enter the number of sub arrays: ");
        int numberofArrays = sc.nextInt();

        // Create the top-level array. Each row is currently 'null'.
        int[][] jaggedArray = new int[numberofArrays][];

        // PHASE 2: Define the "Inner" Sizes (Dynamic Allocation)
        // We loop through each row to let the user define a custom size for each
        for (int i = 0; i < numberofArrays; i++){
            System.out.println("Enter the size of the sub-array: "+(i + 1));
            int sizeofArray = sc.nextInt();

            // Physically allocate memory for each sub-array based on user input
            jaggedArray[i]= new int[sizeofArray];
        }

        // PHASE 3: Data Entry
        // Use nested loops to fill the memory we just allocated
        for (int i = 0; i < numberofArrays; i++){
            System.out.println("Enter the elements of sub-array: "+(i + 1));
            // The inner loop uses 'jaggedArray[i].length' to respect the unique size of each row
            for (int j = 0; j < jaggedArray[i].length; j++){
                jaggedArray[i][j]= sc.nextInt();
            }
        }

        // PHASE 4: Output the result
        System.out.println("The jagged array is: ");
        for (int i = 0; i < numberofArrays; i++){
            for (int j = 0; j < jaggedArray[i].length; j++){
                // Print elements in a horizontal line
                System.out.print(jaggedArray[i][j]+ " ");
            }
            // Move to the next line after finishing a sub-array
            System.out.println();
        }
        // Closing the scanner to prevent resource leaks
        sc.close();
    }
}

/*
Output:
Enter the number of sub arrays:
        4
Enter the size of the sub-array: 1
        4
Enter the size of the sub-array: 2
        5
Enter the size of the sub-array: 3
        3
Enter the size of the sub-array: 4
        5
Enter the elements of sub-array: 1
        1 23 67 89
Enter the elements of sub-array: 2
        12 345 607 809 54
Enter the elements of sub-array: 3
        32 67 78
Enter the elements of sub-array: 4
        1 3 56 78 99
The jagged array is:
        1 23 67 89
        12 345 607 809 54
        32 67 78
        1 3 56 78 99
*/




