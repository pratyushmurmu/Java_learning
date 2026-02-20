package Basics_01;

public class Arrays {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5};
        // 1. Access Array Elements
        // ----------------------------------------------------
        // System.out.println(arr[0]+" "); 1

        // System.out.println(arr[3]+" "); 4
        // 2. Update Array Elements
        // -----------------------------------------------------
        // arr[2]= 9;
        // System.out.println(arr[2]); 9

        // 3.  Traverse Array
        //Traversing an array means accessing each element one by one.
        // In Java, arrays can be easily traversed using a loop where the loop variable runs
        // from 0 to array.length - 1.
        //-------------------------------------------------------

        /* for (int i= 0; i < arr.length; i++){
            System.out.print(arr[i]+ " "); // 1 2 3 4 5
        }*/

        // 4. Size of Array
        // -------------------------------------------------------
        // System.out.println("The array length is: "+ arr.length); The array length is: 5

        // Passing Arrays to Methods
        // -------------------------------------------------------

        sum(arr);

    }

    public static void sum(int[] arr) {
        int sum = 0;

        for (int i =0; i < arr.length; i++){
            sum += arr[i];

            System.out.println("The sum is "+ sum); //(Inside the loop)
            /*The sum is 1
            The sum is 3
            The sum is 6
            The sum is 10
            The sum is 15*/

        }
        System.out.println("The sum is "+ sum);// The sum is 15 (Outside the loop)
    }
}
