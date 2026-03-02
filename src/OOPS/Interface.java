package OOPS;

// Define an interface named Shape
interface Area{
    // Abstract method for calculating the area
    double calcArea();
}
// Implement the interface
// in a class named Circle
class Circles implements Area{
    private double r;
    // Constructor for Circle
    public Circles(double r){
  this.r = r;
}
    // Implementing the abstract method
    // from the Shape interface
 public double calcArea() {
return Math.PI * r * r;
 }
}
// Implement the interface in a
// class named Rectangle
class Rectangles implements Area{
 private double length;
 private double width;
    // Constructor for Rectangle
    public Rectangles(double length, double width){
       this.length = length;
       this.width = width;
    }
    // Implementing the abstract
    // method from the Shape interface
    public double calcArea() {
    return length * width;
   }
}
public class Interface {
       public static void main(String[] args) {
           // Reference type is the interface (Shape)
                    Area circle = new Circles(30);
                    Area rectangle = new Rectangles(14,12);

           // Dynamic method dispatch — decides which method to call at runtime
                    System.out.println("Area of Circle: " + circle.calcArea());
                    System.out.println("Area of Rectangle: " + rectangle.calcArea());
 }
}
/*
Output:
Area of Circle: 2827.4333882308138
Area of Rectangle: 168.0
 */
/*
Explanation:
1. How it Works (The Execution Flow)
--> The Contract (interface Shapes): The interface defines a method calcArea() but provides no body {}. It effectively
tells any class that implements it: "If you want to be considered a Shapes, you must provide your own math for calcArea."

-->The Implementation (implements Shapes): Both Circles and Rectangles fulfill the contract.
They use the @Override annotation to provide the specific geometry formulas ( pi r^2 for circles and L * W for rectangles).

--> The Reference (Shapes circle = ...): In main, you create a variable of the Interface type (Shapes) but point it to a
 Concrete object (Circles).

 2. Why it Works (The Logic)
--> Loose Coupling: The main method doesn't need to know how Circles calculates area; it only needs to know that any Shapes
object has a calcArea() method it can call.

--> Dynamic Method Dispatch: At runtime, the JVM looks at the actual object in the Heap (e.g., the Circles instance). Even though
the variable is type Shapes, Java "dispatches" the call to the specific Circles.calcArea() implementation.

--> Security & Encapsulation: By making the fields private double r or private double length, you prevent outside classes from
accidentally changing the dimensions. The data is "hidden," and only the method is "exposed."
 */