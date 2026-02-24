package Basics_01;
/*
StringBuilder Class in Java
Last Updated : 19 Nov, 2025
In Java, the StringBuilder class (part of the java.lang package) provides a mutable sequence of characters.
Unlike the String class (which is immutable), StringBuilder allows modification of character sequences without creating
new objects, making it memory-efficient and faster for frequent string operations.

It provides similar functionality to StringBuffer, but without thread safety.
StringBuilder is not synchronized, so it performs better in single-threaded applications.
Use StringBuffer only when thread safety is required; otherwise, prefer StringBuilder for improved performance.
 */

public class stringBuilderclass {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Googlefordevelopers");
        System.out.println("Initial StringBuilder: " + sb);//Initial StringBuilder: Googlefordevelopers

        sb.append(" was great!!!");
        System.out.println("After append: " + sb);//After append: Googlefordevelopers was great!!!
    }
}
/*
StringBuilder Constructors:
StringBuilder class provides multiple constructors for different use cases.

--> StringBuilder() : Creates an empty builder with a default capacity of 16 characters.
--> StringBuilder(int capacity) : Creates an empty builder with a specified initial capacity.
--> StringBuilder(String str) : Initializes the builder with the content of the given String.
--> StringBuilder(CharSequence cs) : Initializes the builder with the given CharSequence (for example, String or StringBuffer).
 */
 class stringBuilderDemo{
    public static void main(String[] args) {
        //Creating StringBuilder()
        StringBuilder sb1 = new StringBuilder();
        //Appending
        sb1.append("Hello, ");
        System.out.println("sb1: " + sb1);//sb1: Hello,

        //Creating StringBuilder(int capacity)
        StringBuilder sb2 = new StringBuilder(50);
        sb2.append("You are Sujata right! ");
        System.out.println("sb2: " + sb2);//sb2: You are Sujata right!

        //Creating StringBuilder(String str)
        StringBuilder sb3 = new StringBuilder("I remember ");
        sb3.append("seeing you somewhere. ");
        System.out.println("sb3: " + sb3);//sb3: I remember seeing you somewhere.

        //Creating StringBuilder(CharSequence cs)
        CharSequence cs = "Do you know me? ";
        StringBuilder sb4 = new StringBuilder(cs);
        sb4.append("Sorry, I thought you to be someone else.");
        System.out.println("sb4: " + sb4);//sb4: Do you know me? Sorry, I thought you to be someone else.
    }
}

/*
Commonly Used Methods in StringBuilder
The StringBuilder class provides various methods for string manipulation.

Example: Using StringBuilder Methods
 */

class Builderdemo1{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Indira Gandhi Institute Of Technology");
        System.out.println("Initial: " + sb);

        sb.append(" is my college");
        System.out.println("After append: " + sb);

        sb.insert(6,"Dariya");
        System.out.println("After insert: " + sb);

        sb.replace(0,6,"Mahatma");
        System.out.println("After replace: " + sb);

        sb.delete(0,6);
        System.out.println("After delete: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        System.out.println("Capacity: " + sb.capacity());
        System.out.println("Length: " + sb.length());

        char ch = sb.charAt(2);
        System.out.println("Character at index 2: " + sb);

        sb.setCharAt(2, 'I');
        System.out.println("After setCharAt: " + sb);

        String str = sb.substring(0,6);
        System.out.println("Substring(0-6): " + str);

        sb.reverse();
        System.out.println("Index of Technology: " + sb.indexOf("Technology"));

        sb.deleteCharAt(13);
        System.out.println("After deleteCharAt: " + sb);

        String result = sb.toString();
        System.out.println("Final String: " + result);

    }
}
/*
The output :
Initial: Indira Gandhi Institute Of Technology
After append: Indira Gandhi Institute Of Technology is my college
After insert: IndiraDariya Gandhi Institute Of Technology is my college
After replace: MahatmaDariya Gandhi Institute Of Technology is my college
After delete: aDariya Gandhi Institute Of Technology is my college
After reverse: egelloc ym si ygolonhceT fO etutitsnI ihdnaG ayiraDa
Capacity: 108
Length: 52
Character at index 2: egelloc ym si ygolonhceT fO etutitsnI ihdnaG ayiraDa
After setCharAt: egIlloc ym si ygolonhceT fO etutitsnI ihdnaG ayiraDa
Substring(0-6): egIllo
Index of Technology: 28
After deleteCharAt: aDariya Gandh Institute Of Technology is my collIge
Final String: aDariya Gandh Institute Of Technology is my collIge
 */

/*
Explanation:

1. The Manipulation Phase
append: Simply glues " is my college" to the end. Unlike a regular String, this happens inside the existing memory buffer.

insert(6, "Dariya"): It goes to index 6 (right after "Indira") and pushes everything else to the right to make room for "Dariya".

Result: Indira + Dariya +  Gandhi...

replace(0, 6, "Mahatma"): It cuts out indices 0 to 5 ("Indira") and pastes "Mahatma" there. Since "Mahatma" (7 letters)
is longer than "Indira" (6 letters), the string grows.

delete(0, 6): This removes "Mahatma" (indices 0 to 5).
Wait—look at your output! You deleted 6 characters from "Mahatma", which has 7.
That's why the 'a' was left behind, resulting in aDariya....

2. The Reverse & Indexing Logic
reverse(): This flips the entire internal array.

Your string becomes: egelloc ym si ygolonhceT fO etutitsnI ihdnaG ayiraDa

charAt(2) vs setCharAt(2, 'I'):

The charAt(2) in your code is just assigned to a variable, which is why
your System.out.println shows the whole string unchanged.

setCharAt(2, 'I') actually mutates the buffer, changing the 'e' (the 3rd character) to a capital 'I'.

substring(0, 6): This creates a new String object from the first 6 characters.
Notice it doesn't change sb; it just "takes a snapshot" of that part.

3. The Capacity CalculationYour capacity jumped to 108.
Let's look at the math:Initial: StringBuilder("Indira Gandhi Institute Of Technology").
Length of that string is 37.
Default behavior: Java gives you the String length + 16 extra boxes.
Initial Capacity: 37 + 16 = 53.
The Append/Insert: Once your text exceeded 53 characters, the growth formula triggered:
(Old Capacity * 2) + 2
(53 * 2) + 2 = 108.

4. The Final Twist (The reverse() and deleteCharAt)
At the end, you reversed the string back to its (mostly) original order.

indexOf("Technology"): It found the start of "Technology" at index 28.

deleteCharAt(13): This deleted the space or character at index 13.

toString(): Finally, you converted the "work-in-progress" buffer into a fixed, immutable String.
 */

/*
# Advantages of StringBuilder:
--> Performs faster string manipulations in single-threaded environments.
--> Reduces memory overhead by modifying content in place.
--> Automatically increases capacity when needed.
--> Suitable for operations inside loops where strings are frequently changed.

# Disadvantages of StringBuilder:
--> Not synchronized; unsuitable for multi-threaded environments.
--> May allocate extra memory if the initial capacity is set too high.
--> Requires manual synchronization if used across multiple threads.
 */


