package OOPS;
/*
Object class (in java.lang) is the root of the Java class hierarchy. Every class in Java either directly or indirectly extends Object.
It provides essential methods like toString(), equals(), hashCode(), clone() and several others that support object comparison,
hashing, debugging, cloning and synchronization.

Why Object Class?
--> Acts as the root of all Java classes
--> Defines essential methods shared by all objects
--> Provides default behavior for printing, comparing and cloning objects
--> Supports thread communication (wait(), notify(), notifyAll())
 */

// Using toString() and hashCode():
class Person{
    String n; // Instance variable to store the person's name
    // Constructor: Initializes the n variable when new Person() is called
    public Person(String n){
        this.n = n;
    }
    /*  OVERRIDING: We are changing the default toString() inherited from Object class.
     * Without this, System.out.println(p) would print the Memory Address/Hash code.
     * With this, it prints a readable format.
     */
    @Override
    public String toString(){
        return "Person{name: '" + n + "' }";
    }

    public static void main(String[] args) {
        // Creating a new Person object in the Heap memory
        Person p = new Person("Daulat");
        // Call our custom toString(), Output: Person{name: 'Daulat'}
        System.out.println(p.toString());//Person{name: 'Daulat' }

        // Call hashcode()
        /* Note that we didn't override this, so it uses the default logic from the Object class to generate a unique
         Integer ID for this Object.*/
        System.out.println(p.hashCode());//41359092
    }
}
/*
Why this works (The Logic Flow)
Object Creation: new Person("Geek") triggers the constructor. The string "Geek" is placed in the object's memory slot n.

The Call to toString(): When you call p.toString(), Java looks at the Person class first. It sees you've provided a specific
version (the Override), so it runs your code instead of the default Java version.

The Call to hashCode(): When you call p.hashCode(), Java looks at the Person class and finds nothing. It then "climbs up"
the family tree to the Object class, finds the default hashCode() method there, and executes it.
 */

/*
Object Class Methods
Object class provides multiple methods which are as follows:
 */
//1. toString() Method
//toString() provides a String representation of an object and is used to convert an object to a String.

class Office{
    String name;
    String d;
    public Office (String name, String d){
        this.name = name;
        this.d = d;
    }
    // Overriding the original logic with toString()
    @Override
    public String toString(){
        return "Office{name: '" + name + "' , dept: '" + d + "'}";
    }

    public static void main(String[] args) {
        Office o = new Office("HP", "CS&Hardware");
        // [POLYMORPHISM]: The JVM identifies at runtime that 'Office' has
        // overridden toString() and executes the specific logic.
        System.out.println(o.toString());// referencing to the overridden string toString()
        // Office{name: 'HP' , dept: 'CS&Hardware'}
    }
}

/*
2. hashCode() Method
hashCode() method returns the hash value of an object (not its memory address). Used heavily in hash-based collections
like HashMap, HashSet, etc.
 */

class Examiner{
    int id = 101;
    @Override
    public int hashCode(){
        return id * 31;// Simple but effective custom hash formula
    }

    public static void main(String[] args) {
        Examiner e = new Examiner();
        System.out.println("Custom Employee hashcode: " + e.hashCode());//Custom Employee hashcode: 3131
    }
}
/*
Exactly! You’ve nailed the logic. You don't use the this keyword here because there is no naming conflict to resolve.

In Java, the this keyword is like a finger pointing at the current object's "Identity." You only need to use it when a local variable (like a constructor parameter) has the same name as an instance variable (the field at the top of the class).

 Why this is absent in your hashCode()
In your code:

You have one variable named id.

Inside hashCode(), there is no other variable named id.

Java isn't confused. It knows you mean the id belonging to the Examiner class.
 */

/*
3. equals(Object obj) Method
equals() method compares the given object with the current object. It is recommended to override this method to define
custom equality conditions.
 */

class  Book{
    String name;
    Book(String name){
        this.name = name;
    }
    @Override
    public boolean equals (Object obj){
        // 1. Memory Check: Are they the exact same instance?
        if (this == obj) return true;

        // 2. Null and Type Check: Is the other thing a Book?
        if (obj == null || getClass()!= obj.getClass()) return  false;

        // 3. Casting: Now it is safe to treat 'obj' as a Book
        Book b = (Book)obj;

        // 4. Content Check: Do they have the same name?
        return this.name.equals(b.name);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java");
        Book b2 = new Book("Java");

        // This will now return 'true' because the NAMES match,
        // even though they are different objects in memory.
        System.out.println(b1.equals(b2));//true
    }
}
/*
The Type Casting Risk (The "Maverick" Safety Check)
Your equals method takes an Object obj. You immediately cast it: Book b = (Book)obj;.

The Danger: If someone accidentally passes a String or a Car object into your equals method, your program will crash with
a ClassCastException.

The Pro Fix: Always check if the object is actually a Book using instanceof before casting.

--> Why we used getClass() here?
We use getClass() != obj.getClass() specifically to be strict about the identity of the object.

1. The "Strict Identity" Rule
getClass() returns the exact class of the object.

The Logic: If you have a class Book and a subclass ScienceBook, getClass() ensures that a Book is never considered equal
to a ScienceBook, even if they have the same title.

The Safety: It prevents "Symmetry" bugs. If Book equals ScienceBook, then ScienceBook must equal Book. getClass() makes
this boundary very clear.

--> The null Check
If obj is null, your code will crash. A good equals method should always return false if compared to nothing.
 */

//4. getClass() method
//getClass() method returns the class object of "this" object and is used to get the actual runtime class of the object.

public class objectClass {
    public static void main(String[] args) {
        Object o = new String("GSSOC");
        /* [UPCASTING]: We create a String object but store it in an 'Object' reference.
         * Think of this as: "I have a specific 'iPhone', but I'm referring to it
         * generally as a 'Device'." It's still an iPhone inside.
         */
        Class c = o.getClass();
        /* [REFLECTION]: Every object in the HEAP memory has a pointer to its class.
         * .getClass() follows that pointer to see the original blueprint.
         * It returns a 'Class' object—the metadata of the actual instance.
         */
        System.out.println("Class of Object o is " + c.getName());
        /* [METADATA EXTRACTION]: .getName() returns the "Fully Qualified Name".
         * This includes the Package (java.lang) and the Class (String).
         */
        // Class of Object o is java.lang.String
    }
}
/*
5. finalize() method
finalize() method is invoked by the Garbage Collector just before an object is destroyed. It runs when the object has no remaining references.
You can override finalize() to release system resources and perform cleanup, but its use is discouraged in modern Java.
 */
/*
6. clone() method
clone() method creates and returns a new object that is a copy of the current object.
*/

// 1. You MUST implement the Cloneable 'Marker Interface' or it throws an exception.
class Clone implements Cloneable{
    int id = 1;
    String name = "Shweta";

    // 2. Correct Method Signature: Public access + Method Name + Exception
    @Override
    public Object clone() throws CloneNotSupportedException{
        // super.clone() does a 'Field-by-Field' copy (Shallow Copy)
        return super.clone();
    }

    public static void main(String[] args) throws Exception{
        Clone c1 = new Clone();

        // 3. Type Casting is required because clone() returns an 'Object'
        Clone c2 = (Clone) c1.clone();
        System.out.println(c1.name);//Shweta
        System.out.println(c2.name);//Shweta
        System.out.println(c2.id);//1
        // [MEMORY CHECK]: Are they the same object?
        System.out.println("Same Reference? " + (c1 == c2));//Same Reference? false
    }
}

/*
How Cloning Works (The "Under the Hood" Logic)
When you call super.clone(), Java does a Shallow Copy:

Primitives: For int id, it copies the actual value (101).

Objects/Strings: For String name, it copies the Reference (the memory address). This means c1.name and c2.name are actually pointing to the same String in the "String Constant Pool."

Cloneable: It's a "Marker Interface" (it has no methods; it just tells the JVM "Hey, I'm allowed to be copied").

super.clone(): The magic button that duplicates the object in the Heap.

*/

/*
Refer to concurrency fro Concurrency methods.
 */



