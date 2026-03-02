package OOPS;
/*
Abstract class
An abstract class is a class that cannot be instantiated and may contain abstract methods (methods without body) as well
as concrete methods (with implementation).
 */
/*
Example: This program demonstrates partial abstraction by defining an abstract class Shape that includes an abstract
method area(), a concrete method getColor(), and a constructor.
*/
abstract class Shape{
    String color;
    // Abstract methods: The "Contract" for any child class
    abstract  double area();
    public abstract String toString();

    // Abstract classes CAN have constructors to initialize shared fields
    public  Shape(String color){
        System.out.println("Shape Constructor called");
        this.color = color;
    }
    // this is a concrete method
    public String getColor(){
        return color;
    }
}
// FIXED: Added 'extends Shape' so Circle can access the color and area contract
class Circle extends Shape{
    double radius;
    public  Circle(String color, double radius){
        //calling Shape constructor
        super(color);
        System.out.println("Circle Constructor is called");
        this.radius = radius;
    }
    @Override double area(){
        return  Math.PI * Math.pow(radius,2);
    }
    @Override public String toString(){
        return "Circle color is " + super.getColor() + "and area is " + area();
    }
}
class  Rectangle extends Shape{
    double length;
    double width;

    public Rectangle(String color, double length, double width){
        //calling Shape constructor
        super(color);
        System.out.println("Rectangle Constructor is called");
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
    @Override public  String toString(){
        return "Rectangle color is " + super.getColor() + "and area is " + area();
    }
}

public class Test {
    public static void main(String[] args) {
        // UPCASTING: Using a Shape reference for specific objects
        Shape s1 = new Circle("Blue", 4.0);
        Shape s2 = new Rectangle("Yellow", 3,6);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
/*
Shape Constructor called
Circle Constructor is called
Shape Constructor called
Rectangle Constructor is called
Circle color is Blueand area is 50.26548245743669
Rectangle color is Yellowand area is 18.0
 */
/*
1. How it Works: The Execution Flow
When you run Shape s1 = new Circle("Blue", 4.0);, the following sequence occurs:

Memory Allocation: Space is allocated in the Heap for a Circle object.

Constructor Chaining: Before the Circle constructor finishes, it calls super(color), which jumps to the Shape constructor.

Initialization: The Shape constructor runs, prints its message, and sets this.color = "Blue".

Completion: Control returns to the Circle constructor, which prints its message and sets the radius.

2. Why it Works: Key Concepts
Upcasting: By writing Shape s1 = new Circle(...), you are treating a specific object (Circle) as a general type (Shape).
This allows you to write flexible code that can handle any shape (Rectangles, Squares, etc.) without knowing their specific
class at compile time.

Dynamic Method Dispatch: When you call s1.toString(), the JVM doesn't look at the variable type (Shape); it looks at the
actual object in the heap (Circle). It executes the Circle version of the method.

Shared Logic: The Shape class handles the color field and the getColor() method so that every child class doesn't have
to rewrite that same code.
 */