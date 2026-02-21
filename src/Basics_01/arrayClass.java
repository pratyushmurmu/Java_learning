package Basics_01;

import java.util.Arrays;

//Arrays Class in Java

/*The Arrays class in the java.util package is a utility class that provides a
 collection of static methods for performing common operations on Java arrays, such as sorting, searching, comparing
 and converting arrays to strings.
It does not extend any special classes like all Java classes, it implicitly extends Object.
The Arrays class itself cannot be instantiated and is designed solely for utility purposes.*/
public class arrayClass {
    // Methods in Java Array Class
    //The Arrays class of the java.util package contains several static methods that can be used to fill, sort, search, etc
    // in arrays. Let's take a look at methods and their implementation:

    //1. asList() method: This method converts an array into a list.
    public static void main(String[] args) {
        // Get the array
        int intArr[] ={10, 12, 34, 15, 18};

        // To convert the element as list
        System.out.println("Integer Array as list: "+ Arrays.asList(intArr));
    }
}
// Integer Array as list: [[I@27716f4]
/*The Meaning of [[I@27716f4]
        When you try to print an object in Java, and that object doesn't have a specific way to "describe" itself,
        Java uses its default toString() method.

        [: This tells you it is an Array.

        I: This tells you the type inside is an Integer (primitive).

        @27716f4: This is the Hexadecimal HashCode (a unique ID for where the array sits in memory).
*/
/*Why Arrays.asList(intArr) didn't work
You were expecting a nice list like [10, 12, 34, 15, 18], but here is the technical reason it failed:

Generics & Primitives: Arrays.asList() works with Objects.

The Conflict: Your array is made of int (a primitive). Java cannot make a List of primitives (List<int> is illegal).
It can only make a List of Objects (List<Integer>).

The Result: Instead of seeing 5 separate integers, Java sees one single object (the entire array itself).
So it creates a List containing one item: your array. When you print that List, it
prints the "ID" of the array inside it.*/

//--------------------------------------------------------------------------------------------------------------------------------------------------------
/*binarySearch() Method:

This methods search for the specified element in the array with the help of the binary search algorithm.*/

class binarySearch{
    public static void main(String[] args) {
        // Step 1: Initialize the array
        int intArr[] = {23, 45, 67, 89, 101};

        // Step 2: Ensure the array is sorted
        // Even though this array is already sorted, we call this as a safety measure.
        // Binary Search logic will BREAK if the array is not in order.
        Arrays.sort(intArr);

        // Step 3: Define the value we are looking for (the "Target")
        //int intKey = 67;
        int intKey = 53; //The Negative Return: If you searched for intKey = 53 (which isn't in your array), the method would return -3.
        // This represents -(insertion point) - 1.
        // It’s Java’s way of saying "It's not here, but if it were, it should go at index 2."

        // Step 4: Execute Binary Search
        // Arrays.binarySearch(array, key) returns the index of the element
        System.out.println(intKey+ " found at index "+ Arrays.binarySearch(intArr,intKey));
    }
}
// Output: 67 found at index 2

/* The Logic BreakdownThe Sorting Requirement: Binary Search only works on sorted data.
If the array is messy, the logic fails. Arrays.sort() ensures the data is in ascending order first.
The Search Logic: Binary Search repeatedly divides the search interval in half.
It’s like looking for a word in a physical dictionary—you don't start at page 1; you open the middle and
decide whether to go left or right.
The Result: If the key is found, it returns the index ($0, 1, 2...$).
If it's not found, it returns a negative number.*/

//-----------------------------------------------------------------------------------------------------------------------------------
/* binarySearch(array, fromIndex, toIndex, key, Comparator) Method:

This method searches a range of the specified array for the specified object using the binary search algorithm.*/

class Pain{

        public static void main(String[] args) {
        int intArray[] = {12, 24, 36, 48, 60};

        Arrays.sort(intArray);
        int intKey = 48;

            System.out.println(intKey+ " found at index= "+ Arrays.binarySearch(intArray,1,3,intKey));
        }
}

// Output: 48 found at index= -4
/*The Math Behind the RangeYour code specifies the range as 1, 3:fromIndex = 1: The search starts at index 1 (value 24).toIndex = 3: The search stops before index 3.
Actual search area: Only indices 1 and 2 (values 24 and 36).
Because index 3 (where 48 is located) is excluded from the search, the algorithm concludes that the number 48 does not exist within the box you gave it.
Why specifically "-4"?
When binarySearch fails to find a key, it doesn't just return -1.
It returns a value that tells you where the number should have been using the formula: {return} = -({insertion point}) - 1
Search Area: [24, 36]
Target: 48
Insertion Point: If you were to force 48 into that specific sub-range [24, 36] while keeping it sorted, it would go at the very end, which is index 3.
The Calculation: -(3) - 1 = -4.*/

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//compare(array 1, array 2) Method:
//This method returns the difference as an integer lexicographically.

class Sort{
    public static void main(String[] args) {
        int intArr[] ={14, 28, 42, 56, 70};

        Arrays.sort(intArr);
        int intArr1[] ={13, 26, 39, 52};

        System.out.println("Integer arrays on comparison "+ Arrays.compare(intArr,intArr1));
    }
}
// Output: Integer arrays on comparison 1

/*Index,     intArr,    intArr1,         Result
0,           14,13,     14 > 13       (Stop! Return 1)
1,           28,26,                    Not checked
2,           42,39,                    Not checked
3,           56,52,                    Not checked*/