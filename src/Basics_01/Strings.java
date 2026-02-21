package Basics_01;
/*
Java Strings:
In Java, a String is the type of object that can store a sequence of characters enclosed by double quotes and every
character is stored in 16 bits, i.e., using UTF 16-bit encoding. A string acts the same as an array of characters.
Java provides a robust and flexible API for handling strings, allowing for various operations such
as concatenation, comparison and manipulation.
*/

public class Strings {
    public static void main(String[] args) {
        // Here, you are using the 'new' keyword to create a String object.
        // This explicitly tells Java to create a new object in the HEAP memory,
        // even if the string "Geeks" already exists elsewhere
        String str = new String("Geeks");

        // When you print 'str', Java calls the internal toString() method
        // of the String class, which reveals the actual text content.
        System.out.println(str);//Geeks
    }
}

/*
Ways of Creating a Java String
There are two ways to create a string in Java:

1. String literal (Static Memory)
To make Java more memory efficient (because no new objects are created if it exists already in the string constant pool).

Example:

String str = “GeeksforGeeks”;

2. Using new keyword (Heap Memory)
String s = new String("Welcome");
In such a case, JVM will create a new string object in normal (non-pool) heap memory and the literal "Welcome" will be
placed in the string constant pool.
The variable s will refer to the object in the heap (non-pool)

Example:

String str = new String (“GeeksforGeeks”);

Interfaces and Classes in Strings in Java
Char Sequence Interface
Char Sequence Interface is used for representing the sequence of Characters in Java.
Classes that are implemented using the CharSequence interface are mentioned below ,and
it provides basic methods such as length(), charAt(), subSequence() and toString().

Classes that implement CharSequence include:
1. String:
Syntax:

// Method 1
String str= "geeks";
// Method 2
String str= new String("geeks");

2. StringBuffer:

Syntax:

StringBuffer demoString = new StringBuffer("GeeksforGeeks");

3. StringBuilder:

Syntax:

StringBuilder demoString = new StringBuilder();
demoString.append("GFG");

4. StringTokenizer:

Syntax:

StringTokenizer st = new StringTokenizer("Java String Example");
*/

// Immutable String in Java
//In Java, string objects are immutable. Immutable simply means unmodifiable or unchangeable.
// Once a string object is created its data or state can't be changed but a new string object is created.

class God{
    public static void main(String[] args) {
        String s = "Sachin";

        // concat() method appends the string at the end
        s.concat("Tendulkar");

        System.out.println(s); //Sachin
    }
}
/*
Here, Sachin is not changed but a new object is created with “Sachin Tendulkar”.
That is why a string is known as immutable.

As we can see in the given figure that two objects are created but s reference variable
still refers to "Sachin" and not to "Sachin Tendulkar".
But if we explicitly assign it to the reference variable, it will refer to the "Sachin Tendulkar" object.
*/

class Name{
    public static void main(String[] args) {
        String name = new String("Sachin");

        name = name.concat(" Tendulkar");

        System.out.println(name);//Sachin Tendulkar
    }
}

//Example that shows how to declare a String:

class Strong{
    public static void main(String[] args) {
        // Declare String without using any new operator.
        String name = "Indira Gandhi Institute of Technology";
        // Prints the String
        System.out.println("String name: "+ name);//String name: Indira Gandhi Institute of Technology

        // Declare String using new operator
        String newString = new String("Indira Gandhi Institute of Technology");
        // Prints the String
        System.out.println("String newString: "+newString);//String newString: Indira Gandhi Institute of Technology
    }
}

/*
String Pool Migration from PermGen to the Normal Heap
PermGen space is limited, the default size is just 64 MB. it was a problem with creating and storing too many string objects
in PermGen space. That's why the String pool was moved to a larger heap area. To make Java more memory efficient, the concept
of string literal is used. By the use of the 'new' keyword, The JVM will create a new string object in the normal heap area
even if the same string object is present in the string pool.

For example:

String demoString = new String("Bhubaneswar");
*/

class stRing{
    public static void main(String[] args) {
        // declaring String using String literals
        String s1 = "TITS";
        String s2 = "FOR";

        // declaring Strings using new keywords
        String s3 = new String("TATS");
        String s4 = new String("LITERALLY");

        // Printing all the Strings.
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        /*TITS
          FOR
          TATS
          LITERALLY*/
    }
}

class Dunk{
    public static void main(String[] args) {
        // Creating byte ASCII arrays
        byte ascii[] = {71, 73, 75};

        // Creating strings using byte arrays
        String firstString = new String(ascii);
        System.out.println(firstString); //GIK

        // Creating strings using byte arrays with Start index to End index
        String secondString = new String(ascii,1,2);
        System.out.println(secondString); //IK
    }
}

class charString{
    public static void main(String[] args) {
        // Character Array
        char characters[] = {'B', 'a', 'p', 'u'};

        // Creating new string using character array
        String firstString = new String(characters);

        // Creating new string using another string
        String secondString = new String(firstString);

        System.out.println(firstString);//Bapu
        System.out.println(secondString);//Bapu
    }
}

