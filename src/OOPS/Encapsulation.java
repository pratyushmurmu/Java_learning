package OOPS;
/*
Encapsulation in Java:
Encapsulation means combining data and the functions that work on that data into a single unit, like a class. In Object-Oriented Programming,
it helps keep things organized and secure.

A class can hide the implementation part and discloses only the functionalities required by other classes.
By making class data and methods private, representations or implementations can later be changed without impacting the codes
that uses this class.
It helps in better maintainability, readability and usability. It also helps maintain data integrity by allowing
validation and control over the values assigned to variables.

--> How Encapsulation is Achieved in Java
Encapsulation in Java is achieved using:

*Private data members
*Public getter and setter methods

--> Key Rules:

--> Declare data as private: Hide the class data so it cannot be accessed directly from outside the class.

--> Use getters and setters: Keep variables private and provide public getter and setter methods for controlled access and
safe modification, often with validation.

--> Apply proper access modifiers: Use private for data hiding and public for methods that provide access.
 */

class Programmer{
    private String name;

    // Getter method used to get the data
    public String getName(){
        return name;
    }

    // Setter method is used to set or modify the data
    public void setName(String name){
        this.name = name;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        p.setName("Aryan");
        System.out.println("Name => " + p.getName());// Name => Aryan
    }
}

/*
1. How it Works (The Execution Flow)
--> Data Hiding (private String name): By using the private modifier, you ensure that no other class (like Encapsulation) can
write p.name = "Aryan" directly. If they try, the code will fail to compile.

--> The Setter (setName): In main, you call p.setName("Aryan"). This method acts as a "security guard" that takes the input
string and assigns it to the private field using the this keyword to resolve the naming conflict between the parameter and the field.

--> The Getter (getName): When you want to see the name, you call p.getName(). This method simply returns the value currently
stored in the private name variable.

2. Why it Works (The Logic)
--> Control and Validation: Even though your current setter is simple, Encapsulation allows you to add rules later—like
"Names must be at least 3 characters long"—without breaking the code in the main method.

--> Maintainability: If you decide to change the variable name from name to fullName inside the Programmer class, you only
have to update the getter and setter. Every other part of your program that uses getName() will continue to work perfectly.

--> Abstraction of Complexity: The user of the Programmer class doesn't need to know how the name is stored (it could be a
String, a char array, or even fetched from a database); they only care that getName() gives them the right value.
 */