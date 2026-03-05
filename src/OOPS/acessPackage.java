package OOPS;
/*
Accessing Classes Inside a Package:
In Java, we can import classes from a package using either of the following methods:

1. Import a Single Class:
import java.util.Vector;

This imports only the Vector class from the java.util package.

2. Import all classes from a package:
import java.util.*;

This imports all classes and interfaces from the java.util package but does not include sub-packages.

Example: Import the Vector class
 */
import  java.util.Vector;
public class acessPackage {
    public acessPackage() {
        Vector v = new Vector<>();

        java.util.ArrayList l = new java.util.ArrayList();
        l.add(45);
        l.add(67);
        l.add(90);

        System.out.println(l);
    }

    public static void main(String[] args) {
        new acessPackage();//[45, 67, 90]
    }
}

/*
Explanation:
1. The "Vector" Mystery: Raw Types vs. Generics
The documentation uses Java 1.4 style (Raw Types), while your IDE is pushing you toward Java 7+ style (The Diamond Operator).

Vector v = new Vector(); (The Old Way): This is like an open-box container. You can throw anything in it—an Integer, a String, or a "Man" object.
Java doesn't check the type, which can lead to crashes later.

Vector v = new Vector<>(); (The Modern Way): This uses Generics. Even though you didn't specify a type inside the brackets
(like <Integer>), the <> tells Java: "I want this to be type-safe."

The "Old Programmer" Tip: Modern IDEs add the <> automatically because "Raw Types" are considered dangerous in professional coding.
They want you to eventually write Vector<Integer> v = new Vector<>(); so the compiler can protect you from mistakes.

2. How the Code Works (Step-by-Step)
The Two Ways to Access a Package
This code demonstrates the two ways to use a class from another package:

The Shortcut (Import): You used import java.util.Vector;. This allows you to just type Vector in your code.

The Full Address (Fully Qualified Name): For the ArrayList, you didn't import it. Instead, you typed java.util.ArrayList l = ....
This is like giving someone the full GPS coordinates of a house instead of just the street name. Java always allows this, even
without an import.

The Constructor Trigger:-
In your main method, you wrote:
new acessPackage();

This does two things:

It creates a new object in the memory (Heap).

It immediately runs the Constructor (the block public acessPackage() { ... }).

Result: The moment you "birth" the object, it adds 45, 67, and 90 to the list and prints it out.

3. Layman's Summary
Think of this code as a "Quick Start" kit.

You brought in a Vector tool by calling the warehouse first (import).

You brought in an ArrayList tool by walking directly to the warehouse shelf (java.util.ArrayList).

You used a Constructor to make sure that as soon as the program starts, the work gets done automatically.
 */

