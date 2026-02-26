package OOPS;

import java.io.Serializable;

/*
Ways to Create Object in Java
Java supports four standard approaches.

1. Using new Keyword
new Keyword is most direct way to create an object.
// creating object of class Test
Test t = new Test();
2. Using Reflection
Used for dynamic class loading as seen in frameworks like Spring.
 */
class Employees{
    public Employees(){

    }

}

public class Employee {
    public static void main(String[] args) {
        try {
            Class <?> d = Class.forName("OOPS.Employees");
            Employees e;
            e = (Employees) d.getDeclaredConstructor().newInstance();
            System.out.println(e);//OOPS.Employees@8efb846
        }catch (Exception ee){
            ee.printStackTrace();
        }
    }
}
/*
3. Using clone() method
clone() creates a copy of an existing object. The class must implement Cloneable.
*/
class Geeks implements Cloneable{
    String name = "Google Cloud";

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            Geeks g1 = new Geeks();
            Geeks g2 = (Geeks) g1.clone();
            System.out.println(g2.name);//Google Cloud
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
/*
Explanation:
This code demonstrates the Prototype Design Pattern using Java's built-in cloning mechanism.
It allows you to create a "carbon copy" of an existing object without using the new keyword to re-initialize everything from scratch.

Here is the step-by-step breakdown of how and why it works.

1. The Cloneable Interface (The Permission)
The class Geeks implements the Cloneable interface.

The "Why": In Java, Cloneable is a Marker Interface (it has no methods).

The Logic: Its only purpose is to tell the Java Virtual Machine (JVM) that it is "legal" to make a
field-for-field copy of objects of this class. If you forget to implement this and call clone(), Java will throw a CloneNotSupportedException.

2. Overriding the clone() Method
You see the @Override annotation on lines 4-7.

The "How": The original clone() method is defined in the Object class as protected. To use it in your main method, you
must override it to make it accessible.

super.clone(): This call is crucial. It triggers a special native process in the JVM that creates a new object
and copies all the values (like the String "Google Cloud") from the original object (g1) to the new one (g2).

3. Execution in main
Geeks g1 = new Geeks();: This creates the original object in the Heap memory.

Geeks g2 = (Geeks) g1.clone();:

Java allocates new memory for g2.

It copies the reference of the String "Google Cloud" from g1 to g2.

Type Casting: Since super.clone() returns an Object type, you must cast it back to (Geeks) so
the compiler knows it’s a Geeks object.
 */








