/*
Java Constructors:
-------------------
A constructor in Java is a special member that is called when an object is created. It initializes the new object’s state.
It is used to set default or user-defined values for the object's attributes

A constructor has the same name as the class.
It does not have a return type, not even void.
It can accept parameters to initialize object properties.
 */
package OOPS;
/*
Types of Constructors in Java
There are four types of constructors in Java.

1. Default Constructor
A default constructor has no parameters. It’s used to assign default values to an object. If no constructor is explicitly defined,
Java provides a default constructor.
 */
class Objects{
    //Default Constructor
    Objects(){
        System.out.println("Default Constructor");
    }

    public static void main(String[] args) {
        Objects hello = new Objects();//Default Constructor
    }
}
/*
Explanation:
------------------------------------------------------------------------------------------------------------------------
1. The Anatomy of the Constructor
The Structure: Lines 3–5 define a Default Constructor. Notice it has no return type (not even void) and its name is exactly
the same as the class name.

The Purpose: A constructor's job is to initialize the state of an object the moment it is created.
In this case, you've added a System.out.println to provide visual proof that the constructor has executed.

2. How the Execution Flows
When you run the main method, here is the sequence of events:

Allocation: new Objects() tells the JVM to find space in the Heap memory for a new instance of the Objects class.

Invocation: Before the memory is handed back to you, the JVM automatically calls the Objects() constructor.

Execution: The code inside the curly braces runs, printing "Default Constructor" to the console.

Reference: The hello variable (stored on the Stack) is then assigned the memory address (reference) of that new object on the Heap.

3. Why this works (The "Secret" Rule)
Implicit vs. Explicit: If you had not written lines 3–5, Java would have provided a "hidden" empty default constructor
for you automatically.

Overriding the Default: Since you manually wrote Objects(), you have "overridden" that hidden default with your own logic.
 */

/*
2. Parameterized Constructor
A constructor that has parameters is known as parameterized constructor.
If we want to initialize fields of the class with our own values, then use a parameterized constructor.
 */

class Nerd{
    // data members of the class
    String name;
    int ID;
    // Parameterized Constructor
    Nerd(String name, int ID){
        this.name = name;
        this.ID = ID;
    }
    // method to display object data
    void display(){
        System.out.println("Nerd name: " + name + " ID: " + ID);
    }

    // main() method --- placed inside the same class for universal compactibility
    public static void main(String[] args) {
        // This will invoke the parameterized constructor
        Nerd nerds = new Nerd("Surabhee",437044);
        nerds.display();//Nerd name: Surabhee ID: 437044
    }
}
/*
Explanation:
This code demonstrates a Parameterized Constructor, which is the primary way Java developers initialize an object with specific data at the moment of creation.
It effectively moves from a "blank template" to a "customized instance."

1. The Anatomy of the Constructor
Parameterized Construction: Unlike the default constructor you saw earlier, Nerd(String name, int ID) includes parameters.
These act as the "input slots" for the data you want to assign to the object.

The this Keyword: Inside the constructor, you see this.name = name.

this.name refers to the Instance Variable (the field belonging to the class).

name refers to the Local Parameter (the value you just passed in).

The "Why": Without this, Java wouldn't know which name you are talking about because they share the same name (this is called Shadowing).

2. How the Execution Flows
When new Nerd("Surabhee", 437044) is called in the main method, the following happens:

Memory Allocation: Space is reserved on the Heap for a Nerd object with two fields: a String and an int.

Constructor Execution: The JVM jumps to the Nerd constructor and passes "Surabhee" and 437044 into the parameters.

Assignment: The this logic assigns those values to the object's specific memory space.

Reference Storage: The memory address of this new object is stored in the variable nerds on the Stack.

3. The display() Method
Encapsulation of Behavior: Instead of manually printing nerds.name in the main method, you created a Method called display().

Internal Access: When nerds.display() is called, it accesses the data already stored in that specific object's memory and prints it out.
 */

/*
3. Copy Constructor in Java
Unlike other constructors copy constructor is passed with another object which copies the data available from the passed
object to the newly created object.
 */

class  Rookie{
    String name;
    int id;
    Rookie(String name, int id){
        this.name = name;
        this.id = id;
    }
    // Copy Constructor
    Rookie(Rookie obj2){
        this.name = obj2.name;
        this.id = obj2.id;
    }
}
class Netflix{
    public static void main(String[] args) {
        System.out.println("This is the first object.");
        Rookie rook1 = new Rookie("Shree",420784);
        System.out.println("The Rookie's name is " + rook1.name + " and id is " + rook1.id);
        System.out.println();

        Rookie rook2 = new Rookie(rook1);
        System.out.println("Copy constructor used second object");
        System.out.println("The Rookie's name is " + rook2.name + " and id is " + rook2.id);
    }
}
/*
Output:
This is the first object.
The Rookie's name is Shree and id is 420784

Copy constructor used second object
The Rookie's name is Shree and id is 420784
 */
/*
Explanation:
This code demonstrates the Copy Constructor, a design pattern used to create a new object by duplicating the values of
an existing object of the same class. While Java doesn't provide a default copy constructor like C++, you can manually
define one as you have done here.

1. The Anatomy of the Constructors
The Parameterized Constructor (Lines 4-7): This handles the initial creation of rook1. It takes a String and an int and
assigns them to the instance variables using the this keyword to resolve naming conflicts.

The Copy Constructor (Lines 9-12): This is the heart of the example. Instead of taking primitive values, it takes an
object of its own type (Rookie obj2) as a parameter.

The "How": It reaches into obj2 (the source object), grabs its data (obj2.name, obj2.id), and assigns it to the new
object being created (this.name, this.id).

2. How the Execution Flows in main
Original Creation: rook1 is created in the Heap with the values "Shree" and 420784.

The Cloning Process: When you call new Rookie(rook1), Java does the following:

It allocates a separate memory block for rook2.

It passes the reference of rook1 into the copy constructor.

The constructor copies the values from rook1's memory into rook2's memory.

Independence: After line 19, rook1 and rook2 are two distinct objects that happen to have identical data.
If you were to change rook2.name = "Dhanush", rook1.name would still remain "Shree".

3. Why Use This?
State Preservation: It allows you to create a "snapshot" of an object at a specific point in time before modifying it.

Safety: In complex DSA problems, you might want to pass a copy of an object to a method to ensure the method doesn't
accidentally change your original data (a concept related to immutability).

Simplicity: It provides a cleaner syntax than manually copying every field one by one every time you need a duplicate.
 */
/*
4. Private Constructor
A private constructor cannot be accessed from outside the class. It is commonly used in:

Singleton Pattern: To ensure only one instance of a class is created.
Utility/Helper Classes: To prevent instantiation of a class containing only static methods.
 */

class Lincoln{
    //Private Constructor
    private Lincoln(){
        System.out.println("Private Constructor is called");
    }
    //static method
    public  static  void  displayMessage(){
        System.out.println("Hello from Linclon firm");
    }
}
 class Mains{
     public static void main(String[] args) {
         // Lincoln l = new Lincoln() : Error since constructor is private
         Lincoln.displayMessage();//Hello from Lincoln firm
     }
 }
 /*
 Explanation:
This code demonstrates the use of a Private Constructor, a powerful architectural tool used to restrict how a class is instantiated.
It is the foundation for patterns like the Singleton Pattern or Utility Classes.

1. The Private Constructor (The "Closed Door")
The Restriction: By marking the constructor private Lincoln(), you are telling the Java Virtual Machine (JVM) that no code
outside of the Lincoln class is allowed to create an object of this type.

The "Why": This is often used when a class only contains static tools or methods and doesn't need to store unique data for
individual objects. Creating an object would just waste memory.

2. Static Methods (The "Public Window")
public static void displayMessage(): Because this method is marked static, it belongs to the class itself, not to any specific object.

The "How": In your Mains class, you call the method using the class name: Lincoln.displayMessage(). Java goes directly to the
Lincoln blueprint in the Method Area of the memory and runs the code without needing to look for an object on the Heap.

3. How the Execution Flows
Compilation Check: When you try to write Lincoln l = new Lincoln();, the compiler checks the Lincoln class, sees the private
modifier, and immediately throws an error.

Static Invocation: When Lincoln.displayMessage() is called, the JVM loads the Lincoln class (if not already loaded) and
executes the print statement.

No Object Created: At no point during this program is any memory allocated on the Heap for a Lincoln object.

🚀 Maverick Challenge
In professional Java (like the Math class: Math.sqrt(16)), almost everything is done with private constructors and static methods.
You use the tools without ever needing to "own" the toolbox.
  */

/*
Constructor Overloading
This is a key concept in OOP related to constructors is constructor overloading. This allows us to create multiple
constructors in the same class with different parameter lists.
 */

class Freak{
    // constructor with one argument
    Freak(String name){
        System.out.println("Constructor with one " + "argument - String: " + name);
    }
    // constructor with two arguments
    Freak(String name, int age){
        System.out.println("Constructor with two arguments " + "String and Integer " + name + " " + age);
    }
    // constructor with one argument but different type than previous
    Freak(long id){
        System.out.println("Constructor with one argument " + "Long: " + id);
    }
}

class Ram{
    public static void main(String[] args) {
        // Creating objects of the class named 'Freak' by passing different arguments
        Freak freak1 = new Freak("Pratyush");

        // Invoke the constructor with two arguments
        Freak freak2 = new Freak("Shibasis",21);

        // Invoke the constructor with one argument with type 'Long'
        Freak freak3 = new Freak(34863971);
    }
}
/*
Output:
Constructor with one argument - String: Pratyush
Constructor with two arguments String and Integer Shibasis 21
Constructor with one argument Long: 34863971
 */

/*
Explanation:
This code demonstrates Constructor Overloading, a powerful feature in Java that allows a class to have more than one constructor
as long as their parameter lists are different. It is a form of Compile-time Polymorphism.

1. The Anatomy of Overloading
In your Freak class, you have defined three distinct ways to initialize an object. Java distinguishes between them using the
Signature of the constructor:

By Number of Parameters: Freak(String name) vs. Freak(String name, int age). One takes one piece of data, the other takes two.

By Data Type of Parameters: Freak(String name) vs. Freak(long id). Even though both take exactly one argument, Java knows
which to call because a String is not a long.

2. How the Execution Flows
When the main method runs, the Java Compiler looks at the arguments you provide and "matches" them to the correct constructor blueprint:

new Freak("Pratyush"): The compiler sees a single String. It matches this to the first constructor.

new Freak("Shibasis", 21): The compiler sees a String followed by an int. It matches this to the second constructor.

new Freak(34863971): The compiler sees a number. Since this number fits within a long range, it matches it to the third constructor.

3. Why Use This?
Flexibility: It allows you to create objects even if you don't have all the data yet. For example, you might know a freak's
name but not their age.

Readability: It keeps the class name consistent while providing different "entry points" for initialization.

Real-world Mapping: In a real app, a User might sign up with just an email, or with an email and a phoneNumber.
Overloading allows one class to handle both scenarios gracefully.

🧠 The "Why" for Your Long-term Memory
If you fear forgetting the "why," think of Constructor Overloading like a Vending Machine.

The machine is the Class.

If you put in $1, you get a Soda (Constructor 1).

If you put in $1 and a Coupon, you get a Soda and Chips (Constructor 2).

If you put in a gold coin (different type), you get a Premium Drink (Constructor 3).

The machine (the class) is the same, but it reacts differently based on exactly what and how much you give it at the start.
 */
public class Constructors {
}
