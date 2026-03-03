package OOPS;
/*
The dictionary definition of polymorphism refers to a principle in biology in which an organism or species can have many different forms or stages.
This principle can also be applied to object-oriented programming and languages like the Java language. Subclasses of a class
can define their own unique behaviors and yet share some of the same functionality of the parent class
(From Java Oracle Documentation)
 */

/*
Real-Life Illustration of Polymorphism
Consider a person who plays different roles in life, like a father, a husband, and an employee. Each of these roles defines
different behaviors of the person depending on the object calling it.
*/

// Base class Man
class Man{
    void  role(){
        System.out.println("I'm a Person.");
    }
}
//Derived class Father that overrides the role method of Man class
class Father extends Man{
    //Overridden method to show the role of a father
    @Override
    void role(){
        System.out.println("I'm a Father");
    }
}
//Derived class Employer that overrides the role of Man class
class Employer extends Man{
    @Override
    void  role(){
        System.out.println("I'm an Employer");
    }
}
//Derived class Husband that overrides the role of Man class
class  Husband extends Man{
    @Override
    void role(){
        System.out.println("I'm a Husband");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        // Creating a reference of type Man
        // but initializing it with Man class object
        Man p = new Man();

        // Creating a reference of type Man
        // but initializing it with Father class object
        Man q = new Father();

        // Creating a reference of type Man
        // but initializing it with Employer class object
        Man r = new Employer();

        // Creating a reference of type Man
        // but initializing it with Husband class object
        Man s = new Husband();
        p.role();//I'm a Person.
        q.role();//I'm a Father
        r.role();//I'm an Employer
        s.role();//I'm a Husband
    }
}
/*
Explanation:
1. How it Works: The Execution Flow
Inheritance Hierarchy: You have a base class Man and three subclasses (Father, Employer, Husband) that extend it. This establishes
an "IS-A" relationship: a Father is a Man.

Upcasting: In your main method, you use Man as the reference type for all variables (p, q, r, s). Java allows this because all
those objects are technically men.

Dynamic Method Dispatch: When you call q.role(), the compiler checks the Man class to see if a role() method exists. However,
at runtime, the JVM looks at the actual object in the heap. Since q points to a Father object, it executes the Father version of role().

2. Why it Works: The Logic
Flexibility: Imagine you had a List<Man> family. You could put all these objects into one list and call .role() on all of them in
a single loop. You wouldn't need separate lists for fathers, employers, and husbands.

The "Contract": The Man class defines the capability (the ability to have a role), while the subclasses define the specifics.
 */

/*---------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

/*
class Man{
    void  role(){
        System.out.println("I'm a Person.");
    }
}

class Father extends Man{
    @Override
    void role(){
        System.out.println("I'm a Father");
    }
}

class Employer extends Man{
    @Override
    void  role(){
        System.out.println("I'm an Employer");
    }
}
class  Husband extends Man{
    @Override
    void role(){
        System.out.println("I'm a Husband");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Man p = new Man();
        Man q = new Father();
        Man r = new Employer();
        Man s = new Husband();
        p.role();//I'm a Person.
        q.role();//I'm a Father
        r.role();//I'm an Employer
        s.role();//I'm a Husband
    }
}
Explain how and why the following code works.

This is a fantastic observation! You’ve accidentally stumbled upon Multilevel Inheritance and confirmed the core rule of
Runtime Polymorphism.

The reason the output stayed the same is that Java's "Dynamic Method Dispatch" doesn't care about the middlemen (the classes
in between); it only cares about two things:

The Reference Type (which is Man for all of them).

The Actual Object Type (what follows the new keyword).

1. How it Works: The "Chain of Command"
When you changed Employer to extend Father, and Husband to extend Employer, you created a linear chain:
Man ← Father ← Employer ← Husband

When you call s.role(), Java follows this logic:

Step 1: The JVM looks at the reference s. It's a Man. Does Man have a role() method? Yes. (Code compiles).

Step 2: At runtime, the JVM looks at the actual object created with new Husband().

Step 3: It asks: "Does Husband have its own version of role()?" Yes.

Step 4: It executes that version immediately. It doesn't matter if Husband extends Employer, Father, or Man directly—as long
as Husband is a descendant of Man, it will find its own specific @Override.

2. Why it Works (The Logic)
In Java, a child class overrides its nearest ancestor's implementation. Even if you changed the hierarchy, as long as each
class has its own @Override void role(), that specific version "hides" all the versions above it in the family tree.

If you had removed the role() method from Husband, then s.role() would have printed "I'm an Employer" because that would be
the "closest" implementation it could find up the chain.
 */
/*
Types of Polymorphism in Java
In Java Polymorphism is mainly divided into two types:

1. Compile-Time Polymorphism:
Compile-Time Polymorphism in Java is also known as static polymorphism and also known as method overloading. This happens
when multiple methods in the same class have the same name but different parameters.

Method Overloading:
Method overloading means defining multiple methods with the same name but different parameter lists. The method call is
resolved at compile time based on the arguments passed.

Example: Method overloading by changing the number of arguments
 */

//Class 1
//Helper class
class Helper{
    // Method 1
    // Method with two integer parameters
    static  int Multiply (int a, int b){
        // Return product of integer parameters
        return a * b;
    }

    // Method 2
    // Method with two double parameters
    static double Multiply (double a, double b){
        // Return product of double parameters
        return a * b;
    }
}
// Class 2
// Product class
class Product{
    // Product driving method
    public static void main(String[] args) {
        // Calling methods by pushing inputs as in arguments
        System.out.println(Helper.Multiply(23, 56));//1288
        System.out.println(Helper.Multiply(44.62, 56.77));//2533.0774
    }
}
/*
Explanation:
1. How it Works: The Execution Flow
The Overload: You have two methods with the exact same name (Multiply) inside the same class (Helper).

The Difference: Java allows this because their parameter types are different—one takes int, the other takes double.

The Call: In main, you don't even need to create a new Helper() because the methods are static. You call them directly using
the class name.

The Choice: When you pass 23, 56, the Java compiler looks at the numbers, sees they are integers, and "links" that call to the
first method. When you pass 44.62, 56.77, it links to the second method.

2. Why it Works: The Logic
Static Binding: This is called "Static Binding" because the decision of which method to run is made by the Compiler at compile-time,
not by the JVM at runtime.

Code Readability: Without overloading, you would have to name them MultiplyInt() and MultiplyDouble(). Overloading keeps your
code clean and intuitive.

Static Utility: By using the static keyword, you've created a "Utility Class." This is very common in DSA
(e.g., the Math class in Java works exactly like this: Math.max(int, int) and Math.max(double, double)).
*/

/*
2. Runtime Polymorphism:
Runtime Polymorphism in Java is also known as dynamic method dispatch. It occurs when a method call is resolved at runtime,
and it is achieved using method overriding.

Method Overriding:
Method overriding occurs when a subclass provides its own implementation of a method already defined in its superclass.
The method must have the same name, parameters, and return type.

Note: At runtime, the method that gets executed depends on the actual object type, not the reference type.
 */

class Family{
    void Print(){
        System.out.println("We are family");
    }
}

class Wife extends Family{
    void Print(){
        System.out.println("I'm his wife");
    }
}

class Children extends Family{
    void Print(){
        System.out.println("We are their children");
    }
}

class Type{
    public static void main(String[] args) {
        Family a = new Family();
        a.Print();//We are family

        a = new Wife();
        a.Print();//I'm his wife

        a = new Children();
        a.Print();//We are their children
    }
}

/*
1. How it Works: The Execution Flow
The Reusable Reference (Family a): Instead of creating three different variables (like a, b, and c), you created one reference
variable named a of type Family.

The Object Swap: * First, a points to a Family object. a.Print() calls the base version.

Next, you reassign a to a new Wife object. Even though a is still a Family type, it now "points" to a Wife in memory.

Finally, you reassign a to a Children object.

The Runtime Decision: Every time you call a.Print(), the JVM looks at the actual object currently sitting in that memory slot.
Since Wife and Children have overridden the Print() method, the JVM executes their specific versions.

2. Why it Works: The Logic
Upcasting: In Java, a parent reference can always hold a child object because a Wife is-a Family member.

Method Overriding: Because the method signature void Print() is identical in all classes, the child versions "replace" the
parent version when the object is of the child type.

Memory Efficiency: You are using one "label" (a) to interact with different types of objects. This is exactly how complex
systems are built—you define a general category and handle specific cases through overriding.
 */

/*
Advantages of Polymorphism:-
--> Code Reusability: The same method or class works with different object types.

--> Flexibility: Different objects can be treated as a common superclass type.

--> Abstraction: Enables working with general types (abstract classes or interfaces) instead of concrete classes.

--> Dynamic Behavior: Method calls are resolved at runtime based on the actual object type.

Disadvantages of Polymorphism:-
--> It can make more difficult to understand the behavior of an object.

--> This may cause performance issues, as polymorphic behavior may require additional computations at runtime.
 */

/*
Real-World Disadvantages:
1. Difficulty in Understanding (The "Traceability" Problem)
When you look at a line of code like a.Print(); in your last example, you can't tell exactly what will happen just by
looking at that one line.

--> The "Where is it?" Hunt: To understand the output, you have to find where a was initialized. If a is passed as a parameter
from a different class, you might have to jump through 5 or 6 files to find out if it's a Wife, Children, or Family object.

--> Debugging Pain: When a bug occurs, you can't just "Step Into" the Family class. You have to figure out which specific child
class is currently being used, which makes tracing the logic much slower for a human.

2. Performance Issues (The "Virtual Table" Overhead)
In DSA, we obsess over "Time Complexity." Polymorphism adds a tiny bit of "hidden" time to your execution.

--> The V-Table Look-up: Java uses something called a Virtual Method Table (V-Table). When you call a.Print(), the JVM doesn't go
straight to the code. It first looks at the object's header, finds the V-Table, looks up the address of the Print() method for
that specific class, and then jumps to the code.

--> CPU Branch Prediction: Modern CPUs try to guess what the next line of code will be to speed things up. Because polymorphic calls
are decided at the last millisecond (Runtime), the CPU sometimes guesses wrong, causing a "pipeline flush" that slows down high-performance loops.
 */