package Basics_01;

import java.util.Scanner;

public class typesofArrays {
    //-----------Java Multi-Dimensional Arrays----------

    // 2D-Array
    public static void main(String[] args) {
        int n = 2; // no of rows
        int m = 2; // no of columns

        int [][] arr = new int[n][m];

        int it = 1;

        for (int  i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                arr [i][j] = it;
                it++;
            }
        }

        for (int i = 0; i< n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

    }
    // Output:
       //     1 2
       //     3 4

}
class Main{
    public static void main(String[] args) {
        int[][] arr = {{2,4},
                {6,8}};

        System.out.println("arr[1][0] = "+ arr[1][0]); // arr[1][0] = 6
    }
}

// Two Dimensional Array with User input

class Array2D{
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter the number of rows: ");
         int rows = sc.nextInt();

         System.out.println("Enter the number of columns: ");
         int columns = sc.nextInt();

         int[][] arr = new int[rows][columns];
         System.out.println("Enter the elements in array: ");

         for (int i=0; i<rows; i++) {
             for (int j = 0; j < columns; j++) {
                 arr[i][j] = sc.nextInt();
             }
         }

         for (int i=0; i<rows; i++){
             for (int j=0; j<columns; j++){
                 System.out.print(arr[i][j]+" ");
             }
             System.out.println();
         }
         sc.close(); //sc.close() is used to shut down the Scanner and release the resources it was holding
     }
}


//Three - Dimensional Array (3D-Array)

class Array3D{
    public static void main(String[] args) {
        int[][][] arr = new int[3][3][3];

        int r = arr.length; // This gives the size of the first dimension. In a 3D context, this represents the number of "blocks" or "pages."
        int s = arr[0].length;// By adding [0], you are looking inside the first block. This gives the number of rows in that specific block.
        int t = arr[0][0].length;// By adding [0][0], you are looking at the first row of the first block. This gives the number of columns
                                 // (the actual integer elements) in that row

        // In 3D arrays, i = array, j = row, and k = column.

        int it = 1;

        for (int i = 0; i < r; i++){
            for (int j = 0; j < s; j++){
                for (int k = 0; k < t; k++){
                    arr[i][j][k] = it;
                    it++;
                }
            }
        }

        for (int i = 0; i < r; i++){
            for (int j = 0; j < s; j++){
                for (int k = 0; k < t; k++){
                    System.out.print(arr[i][j][k] +" ");
                }
                System.out.println();
            }
            System.out.println();
        }


    }
}

// Output:
/*
 1 2 3
4 5 6
7 8 9

10 11 12
13 14 15
16 17 18

19 20 21
22 23 24
25 26 27 */


// Inserting a Multi-Dimensional Array During Runtime
class multiArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt(); // no of rows

        int [][] arr = new int[n][];
        int t = 0; // t acts as a temporary storage variable to hold the number of columns for the most recently processed row.

        for (int i = 0; i < n; i++){
            System.out.print("Enter column count for row " + i + ": ");
            int m = sc.nextInt(); //Assuming all rows have the same column count

            t=m;
            arr[i]= new int[m];

            for (int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int odd = 0;int even = 0;
        System.out.println(n +" rows " + t + " columns");
        System.out.println("Elements of Array:");

        for (int i = 0; i < n; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] +" ");

                if (arr[i][j] % 2 == 0){
                    even++;
                }else {
                    odd++;
                }
            }
            System.out.println();
        }
        System.out.println("Even: "+ even +", Odd: "+ odd);

        sc.close();
    }

}

/*
Enter number of rows: 3
Enter column count for row 0: 3
34 56 78
Enter column count for row 1: 3
45 67 99
Enter column count for row 2: 3
78 121 156
3 rows 3 columns
Elements of Array:
34 56 78
45 67 99
78 121 156
Even: 5, Odd: 4
*/


