/*
7. Concurrency Methods: wait(), notify() and notifyAll():
These methods are related to thread Communication in Java. They are used to make threads wait or notify others in
concurrent programming.
 */
package OOPS;

public class Concurrency implements Cloneable{
    private String t; // title
    private String a; // author
    private  int y; // year
    public Concurrency(String t, String a, int y){
        this.t = t;
        this.a = a;
        this.y = y;
    }
    @Override public String toString(){
        return  t + " by " + a + " in " + y;
    }
    @Override public boolean equals (Object o){
        if (o == null || !(o instanceof Concurrency)){
            return false;
        }
        Concurrency other = (Concurrency)o;
        return this.t.equals(other.getTitle())
        && this.a.equals(other.getAuthor())
        && this.y == other.getYear();
    }
    @Override public  int hashCode(){
        int res = 17;
        res = 31 * res + t.hashCode();
        res = 31 * res + a.hashCode();
        res = 31 * res + y;
        return res;
    }
    @Override public  Concurrency clone(){
        try {
            return (Concurrency) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
    @Override
    protected  void finalize() throws Throwable{
        try{System.out.println("Finalizing " + this);
    } finally {
            super.finalize();
        }
        }
    public String getTitle() { return t;}
    public String getAuthor(){ return a;}
    public int getYear(){return y;}

    public static void main(String[] args) {
        Concurrency c1 = new Concurrency("The Hitchhiker's Guide to the Galaxy",
                "Douglas Adams", 1979);
        System.out.println(c1);

        Concurrency c2 = (Concurrency) c1.clone();
        System.out.println(c2);

        System.out.println("c1 equals c2: " + c1.equals(c2));
        System.out.println("c1 Hashcode: " + c1.hashCode());
        System.out.println("c2 Hashcode: " + c2.hashCode());

        c1 = null;
        System.gc();
    }

}
/*
Output:
The Hitchhiker's Guide to the Galaxy by Douglas Adams in 1979
The Hitchhiker's Guide to the Galaxy by Douglas Adams in 1979
c1 equals c2: true
c1 Hashcode: 1840214527
c2 Hashcode: 1840214527
Finalizing The Hitchhiker's Guide to the Galaxy by Douglas Adams in 1979
 */

/*
1. The "Contract" of Identity (equals & hashCode)
In Java, if two objects are "equal," they must produce the same hash code.

equals(Object o): You’ve customized this to compare the values (t, a, y) instead of memory addresses. The use of instanceof ensures
that your program doesn't crash if you accidentally compare a Book to a String.

hashCode(): You used a "Prime Number" logic (31 * res). This is an industry-standard way to ensure that objects are distributed evenly
in memory structures like HashMap, preventing "data traffic jams".

2. Shallow Cloning via Cloneable
By implementing Cloneable, you are giving the JVM permission to "photocopy" the object in the Heap memory.

The Mechanism: super.clone() performs a Shallow Copy. It creates a new object (c2) but doesn't create new copies of the internal
String objects; it just copies the references.

Efficiency: This is significantly faster than using the new keyword because it copies the object's bit-pattern directly.

3. The Lifecycle: Constructor to finalize()
This code tracks an object from start to finish:

The Birth: The Parameterized Constructor initializes the state using this to resolve variable shadowing.

The Death: When you set c1 = null, you are cutting the "leash" to the object in the Heap. System.gc() suggests to Java that it’s time to clean up.

finalize(): This is the object's "Last Words." While it is deprecated in modern Java because it's unpredictable, you've used it here to
prove the Garbage Collector eventually finds unreferenced objects.

4. Encapsulation & Metadata
Getters: Your getTitle(), getAuthor(), and getYear() methods follow the principle of Encapsulation, allowing controlled access to private data.

toString(): By overriding this, you’ve turned a cryptic memory address into a human-readable summary: "The Hitchhiker's Guide to
the Galaxy by Douglas Adams in 1979".
 */
