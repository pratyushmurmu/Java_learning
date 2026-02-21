package Basics_01;

import java.util.Arrays;

// Final Arrays in Java
// , the final keyword makes a variable's reference constant, not its contents.
// When an array is declared as final, you cannot reassign it to point to a new array.
// However, you can still modify the elements within the array.
public class finalArray {
    //Modifying Elements of a Final Array
    public static void main(String[] args) {
        final int[] arr = {12, 34, 72};

        arr[1] = 26;

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" "); // 12 26 72
        }
    }
}

// Modifying Object State Referenced by a Final Variable
class final2{
    int p = 25; //// An instance variable (non-final)
    public static void main(String[] args) {
        // 'final' here means the reference variable 'f' is locked.
        // It must always point to this specific 'final2' object in memory.
        final final2 f =new final2();
        // SUCCESS: We are NOT changing 'f'. We are changing the 'p' INSIDE 'f'.
        // This is perfectly legal because 'p' itself was not declared as final.

        f.p = 50;
        // Printing the modified state
        System.out.println(f.p); // 50
    }
}

//Compilation Error When Reassigning Final Reference
class final3{
    int p = 30;

    public static void main(String[] args) {

        final final3 c1 = new final3();
        // c1 is a final reference. It is "married" to the first object created.
        final3 c2 = new final3();
        // c2 is a normal reference. It can be pointed elsewhere later.

        // ERROR: The compiler sees you trying to move the 'c1' pointer to 'c2's address.
        // Because c1 is 'final', its "loyalty" to the original memory address cannot be broken.


        //c1 = c2; // <--- This line causes: "cannot assign a value to final variable c1"


        System.out.println(c1.p); //(Without the c1 = c2 step the output is 30)
    }
}

// It shows an error i.e. "java: cannot assign a value to final variable c1".

/* Final Array Reference and Reassignment.

Here is Java Program to Illustrate Reassignment Error in Final Array
*/

class  final4{
    /*
     This program illustrates that for arrays, 'final' protects the
     reference (the pointer), not the data inside.
     */
    public static void main(String[] args) {
        // arr1 and arr2 are now "Constant References".
        // They are Super-Glued to their respective memory blocks.

         final int[] arr1 = {1, 4, 8, 12};
         final  int[] arr2 = {11, 44, 88, 1212};

        // COMPILATION ERROR:
        // You are trying to tell arr1 to let go of its current array
        // and point to the array owned by arr2.
        //arr1= arr2; // <--- This line causes: "cannot assign a value to final variable arr1"

        // COMPILATION ERROR:
        // The same happens here. Even though arr2 is a different variable,
        // it is also marked 'final' and cannot be redirected.
        //arr2= arr1; // <--- This line causes: "cannot assign a value to final variable arr2"

        for (int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i]+ " "); // (Without arr1 = arr2 and arr2 = arr1, the output is "11 44 88 1212" )
        }
    }
}

// Modifying Elements in a Final Array and Attempting Reassignment

//Here is demonstrating how to change value inside a final array
class final5{
    public static void main(String[] args) {
        // 'final' locks the 'numbers' variable to this specific array object.
        // It cannot be reassigned to a different array later.
        final int numbers[] = {15, 30, 45, 60, 75};

        // SUCCESS: Modifying the contents is permitted.
        // We are reaching into the "box" and changing the value at index 1.
        // The "box" (array reference) itself hasn't changed.
        numbers[1] = 300;

        // Arrays.toString(numbers) converts the elements into a readable string [15, 300, ...].
        // This is the correct way to view the contents of an array.
        System.out.println("Array after modifying an element: "+ Arrays.toString(numbers));
        // The output is "Array after modifying an element: [15, 300, 45, 60, 75]"
    }
}
