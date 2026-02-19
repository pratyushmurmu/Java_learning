package Basics_01;

public class methodsinJava {
    // Methods In Java are  blocks of code that perform a specific task.
    // A method allows us to reuse code, improving both efficiency and organization.
    // All methods in Java must belong to a class.
    // Methods are similar to functions and expose the behavior of objects.
    //----------------------------------------------------------------------------------------
    public void printMessage(){
        System.out.println("Ye naya Hindustan hai. Ye ghar me ghusega bhi aur marega bhi");
    }

    public static void main(String[] args) {
        methodsinJava obj = new methodsinJava();
        obj.printMessage();
    }
    /*Different Ways to Create Java Method
There are two ways to create a method in Java:

1. Instance Method: Access the instance data using the object name. Declared inside a class.
Example:




// Instance Method
void method_name() {
    // instance method body
}
2. Static Method: Access the static data using class name. Declared inside class with static keyword.

Example:




// Static Method
static void method_name() {
    // static method body
}*/
    // Calling Different Types of Methods in Java
    /*1. Calling a User-Defined Method
    --------------------------------------------------------------------
    * class Geeks {
    void hello() {
        System.out.println("This is a user-defined method.");
    }

    public static void main(String[] args) {
        Geeks obj = new Geeks(); // Create object
        obj.hello();             // Call method
    }
}
------------------------------------------------------------------------------
2. Calling an Abstract Method
Abstract methods have no body and must be overridden in a subclass. They are called using an object of the subclass.

Example 2: Calling Methods in Different Ways
---------------------------------------------------------------------------
abstract class GeeksHelp {
    abstract void check(String name); // Abstract method
}

public class Geeks extends GeeksHelp {
    @Override
    void check(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Geeks obj = new Geeks(); // Subclass object
        obj.check("GeeksforGeeks");
    }
}
---------------------------------------------------------------------------------
3. Calling the Predefined Methods
Java provides many built-in methods via the Java Standard Library, like hashCode().
-----------------------------------------------------------------------------------
public class Geeks {
    public static void main(String[] args) {
        Geeks obj = new Geeks();
        System.out.println(obj.hashCode()); // Predefined method
    }
}

Output:
1510467688
Explanation: In the above code an object of the Geeks class and calls the predefined hashCode() method.
It prints a unique integer value representing the object's memory address hash.
-----------------------------------------------------------------------------------
4. Calling a Static Method
Static methods belong to the class, not the object. They can be called without creating an object.
----------------------------------------------------------------------------------------------------
class Test {
    static void hello() {
        System.out.println("Hello");
    }
}
public class Geeks {
    public static void main(String[] args) {
        Test.hello(); // Call static method directly
    }
}
----------------------------------------------------------------------------------------------------
*/
}
