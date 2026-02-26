package OOPS;

import javax.imageio.IIOException;
import java.io.*;

/*
4. Using Deserialization
De-serialization is a technique of reading an object from the saved state in a file.
Object is recreated from a stored byte stream.
 */
class Students implements Serializable {
    private String name;
    public Students(String name){this.name = name;}
    public String toString(){return "Student: " + name;}
}

public class Deserialization {
    public static void main(String[] args) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"))){
            out.writeObject(new Students("Dhanush"));
        }catch (IOException e){
            e.printStackTrace();
        }
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"))){
            Students s = (Students)in.readObject();
            System.out.println(s);//Student: Dhanush
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
/*
This code demonstrates Object Persistence, a core concept in Java where the state of an object is saved to a file and later restored.
It utilizes two complementary processes: Serialization and Deserialization.

1. The Setup: Serializable Interface
-----------------------------------------------------------------------------------------------------------------------
The Interface: The Students class implements the Serializable interface.

The "Why": In Java, this is a Marker Interface that tells the JVM it is safe to convert this object into a stream of bytes.

The "How": If a class does not implement this and you try to save it, Java will throw a NotSerializableException.

2. Part One: Serialization (Saving)
-----------------------------------------------------------------------------------------------------------------------
The first try block handles the "Saving" phase.

FileOutputStream: This creates a connection to a physical file named student.ser on your hard drive.

ObjectOutputStream: This acts as a translator. It takes the Students object and converts its internal
data (the String "Dhanush") into a format the file can store.

out.writeObject(...): This command triggers the actual writing. It captures the "state" of the object at that exact moment.

3. Part Two: Deserialization (Restoring)
-----------------------------------------------------------------------------------------------------------------------
The second try block handles the "Loading" phase.

The Byte Stream: Java reads the student.ser file as a Byte Stream (a sequence of 0s and 1s).

in.readObject(): This is the magic step. The JVM reads the bytes, identifies that they belong to a Students class, and allocates
 new memory in the Heap to reconstruct the object.

Type Casting: Since readObject() returns a general Object, you must cast it with (Students) so you can access the
specific fields of your class.

4. Key Mechanism: toString()
When you run System.out.println(s), Java automatically calls the toString() method you defined in the Students class.

Because the object was successfully restored from the file, it still contains the name "Dhanush," which is why it prints Student: Dhanush.

🧠 Maverick Insight: The "Try-with-Resources"
-----------------------------------------------------------------------------------------------------------------------
Notice the syntax try (ObjectOutputStream out = ... ). This is called Try-with-Resources.

The Benefit: It ensures that the file is automatically closed even if an error occurs.

The Analogy: It’s like a smart fridge door that closes itself—it prevents "memory leaks" and keeps your system resources clean.
 */
