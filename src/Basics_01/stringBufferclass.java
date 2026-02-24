package Basics_01;

public class stringBufferclass {
    public static void main(String[] args) {
        // Creating a StringBuffer
        StringBuffer s = new StringBuffer();

        s.append("Hi");
        s.append(",");
        s.append("I'm Ser Duncan The Tall");

        //System.out.println(s);//Hi,I'm Ser Duncan The Tall

        // String with the StringBuffer value
        String str = s.toString();
        System.out.println(str);//Hi,I'm Ser Duncan The Tall
    }
}
/*
We use .toString() so that Java creates a String that is exactly the same size as of the text. It is more memory efficient for long term storage.
Action                   |                    Use Case
System.out.println(s)    | Quick debugging. You just want to see what's inside.
s.toString()             | "Transformation. You need to treat the text as a ""real"" String to use String-specific methods
                            (like split, matches, replace) or to pass it to other APIs."
 */

/*
Constructors of StringBuffer Class:
--> StringBuffer(): It reserves room for 16 characters without reallocation
--> StringBuffer(int size): It accepts an integer argument that explicitly sets the size of the buffer.
--> StringBuffer(String str): It accepts a string argument that sets the initial contents of the StringBuffer object and reserves
                              room for 16 more characters without reallocation.
 */

class Buffer1{
    //1. Using default constructor
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        str.append("Hello, Karen!!");

        System.out.println("Default Constructor: " + str);//Default Constructor: Hello, Karen!!

        //2. Using Constructor with specified capacity
        StringBuffer st = new StringBuffer(50);
        st.append("Welcome to India");

        System.out.println("Constructor with specified capacity 50: " + st);//Constructor with specified capacity 50: Welcome to India

        //3. Using Constructor with String
        StringBuffer stfu = new StringBuffer("Gaddi ");
        stfu.append("Jutti ki nok pe...");

        System.out.println("With String: " + stfu);//With String: Gaddi Jutti ki nok pe...
    }
}
/*
Implementation of Java StringBuffer Method:
---------------------------------------------------------------------------------------------------------------
1. append() Method:
append() method concatenates the given argument with this string
 */
class Appendbuffer{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello ");
        sb.append("Java");//add changes to the original string
        System.out.println(sb);//Hello Java
    }
}
/*
--------------------------------------------------------------------------------------------------------------
2. insert() Method:
insert() method inserts the given string with this string at the given position.
 */
class Insertbuffer{
    public static void main(String[] args) {
        StringBuffer ib = new StringBuffer("Ser Alan Of ");
        ib.insert(12,"Pennytree");
        System.out.println(ib);//Ser Alan Of Pennytree
    }
}
/*
-------------------------------------------------------------------------------------------------------------
3. replace() Method
replace() method replaces the given string from the specified beginIndex and endIndex-1.
 */
class Replacebuffer{
    public static void main(String[] args) {
        StringBuffer rb = new StringBuffer("Reserve Bank Of America");
        rb.replace(17,23,"India");
        System.out.println(rb);//Reserve Bank Of AIndia
    }
}
/*
1. The Anatomy of rb.replace(17, 23, "India")
The replace method for StringBuffer takes three arguments:

start (17): The index where the deletion begins (Inclusive).

end (23): The index where the deletion stops (Exclusive).

str ("India"): The new text to insert into that gap.

Let's look at the "map" of your string "Reserve Bank Of America":

Index:     16 17 18 19  20  21  22  23(exclusive)
Character: A  m   e  r   i   c   a
Add:          I   n  d   i   a
Step 1: Java starts at index 17 ('A').
Step 2: It prepares to delete up to, but not including, index 23 ('a').
Step 3: The characters from index 17 to 22 are: "merica".
Step 4: It deletes "merica", leaving the initial "A" (index 16) untouched.
Step 5: It inserts "India" at index 17.
 */
/*
--------------------------------------------------------------------------------------------------------------
4. delete() Method
delete() method is used to delete the string from the specified beginIndex to endIndex-1.
 */
class Deletebuffer{
    public static void main(String[] args) {
        StringBuffer db = new StringBuffer("Hello");
        db.delete(0,2);
        System.out.println(db);//llo
    }
}
/*
-------------------------------------------------------------------------------------------------------------
5. reverse() Method
reverse() method of the StringBuffer class reverses the current string.
 */
class Reversebuffer{
    public static void main(String[] args) {
        StringBuffer rbi = new StringBuffer("Mom");
        rbi.reverse();
        System.out.println(rbi);//moM
    }
}
/*
-------------------------------------------------------------------------------------------------------------
6. capacity() Method
capacity() method of the StringBuffer class returns the current capacity of the buffer. The default capacity of the buffer is 16. If the number of characters increases from its current capacity, it increases the capacity by (oldcapacity*2)+2.

For example, if the current capacity is 16, it will be (16*2)+2=34.
 */
class Capacitybuffer{
    public static void main(String[] args) {
        StringBuffer cb = new StringBuffer();

        // StringBuffer creates a default capacity of 16 characters
        System.out.println(cb.capacity());//16
        cb.append("Baahubali: ");

        //Index|Character|Type
        //0         B      Letter
        //1         a      Letter
        //2         a      Letter
        //3         h      Letter
        //4         u      Letter
        //5         b      Letter
        //6         a      Letter
        //7         l      Letter
        //8         i      Letter
        //9         :      Symbol
        //10       ** **   Space
        // Total char length = 11 (<16)
        System.out.println(cb.capacity());//16
        cb.append("The Beginning");

        //After "The Beginning" (13 chars): * 11 (Baahubali) + 13 (The Beginning) = 24 characters total.
        // Since 24 is greater than 16, the expansion formula triggers.
        // (16 * 2) + 2 = 34.
        System.out.println(cb.capacity());//34
    }
}
/*
--------------------------------------------------------------------------------------------------------------------------------------------
7. length()
This method return the number of character in given string
 */
class bufferLength{
    public static void main(String[] args) {
        StringBuffer lb = new StringBuffer("Back to friends");

        int b = lb.length();
        System.out.println("Length of string: " + b);//Length of string: 15
    }
}