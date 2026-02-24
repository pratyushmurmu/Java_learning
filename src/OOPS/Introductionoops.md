# Java OOP(Object Oriented Programming) Concepts
Object-Oriented Programming (OOP) is a programming paradigm based on the concept of objects that contain data (fields) and behavior (methods). It focuses on designing software that closely represents real-world entities. It is used to:

**Improves code reusability**

**Enhances maintainability and scalability**

**Makes programs easier to understand and manage**

**Closely models real-world entities**

## Characteristics of an OOP(Object Oriented Programming)
### 1. Class
A Class is a user-defined blueprint or prototype from which objects are created. It represents the set of properties or methods that are common to all objects of one type. Using classes, you can create multiple objects with the same behavior instead of writing their code multiple times. In general, class declarations can include these components in order:

**Modifiers**: A class can be public or have default access (Refer to this for details).

**Class name**: The class name should begin with the initial letter capitalized by convention.

**Body**: The class body is surrounded by braces, { }.

***Example***: A Car represents a class (blueprint), while BMW, Mercedes, and Audi represent objects (instances) created from that class.

![](https://media.geeksforgeeks.org/wp-content/uploads/20260122164735278794/Class.webp):(https://media.geeksforgeeks.org/wp-content/uploads/20260122164735278794/Class.webp)

### 2. Object
An Object is a basic unit of Object-Oriented Programming that represents real-life entities. A typical Java program creates many objects, which as you know, interact by invoking methods. The objects are what perform your code, they are the part of your code visible to the viewer/user. An object mainly consists of:

**State**: It is represented by the attributes of an object. It also reflects the properties of an object.

**Behavior**: It is represented by the methods of an object. It also reflects the response of an object to other objects.

**Identity**: It is a unique name given to an object that enables it to interact with other objects.

**Method**: A method is a collection of statements that perform some specific task and return the result to the caller.

### 3. Abstraction
**Abstraction in Java** is the process of hiding implementation details and showing only the essential features of an object. It helps users focus on what an object does rather than how it does it.

**Hides complexity**: Internal implementation details are hidden from the user.

**Improves maintainability**: Changes in implementation do not affect the user code.

**Enhances flexibility**: Supports loose coupling through abstract classes and interfaces.

***Example***: An ATM or a coffee machine represents abstraction, where the user interacts with simple operations while the internal working and implementation details remain hidden.
![](https://media.geeksforgeeks.org/wp-content/uploads/20260122165522767666/hides_certain_details_and_show_only_essential_information.webp):(https://media.geeksforgeeks.org/wp-content/uploads/20260122165522767666/hides_certain_details_and_show_only_essential_information.webp)

### How to Achieve Abstraction
It is achieved in Java using **abstract classes** and **interfaces**.

**Interfaces** can provide 100% abstraction, while abstract classes provide partial abstraction.

### 4. Encapsulation
**Encapsulation** is the process of wrapping data and methods into a single unit, usually a class, and restricting direct access to the data. It acts as a protective shield that prevents data from being accessed directly from outside the class.

**Data members are hidden using the private access modifier.**

**Access to data is provided through public getter and setter methods.**

**It improves data security, maintainability, and controlled access.**
![En img](https://media.geeksforgeeks.org/wp-content/uploads/20250729105432133992/Encapsulation.webp)

### 5. Inheritance 
**Inheritance** is a core OOP concept in Java that allows one class to acquire the fields and methods of another class using the extends keyword. It represents an “is-a” relationship between classes.

**The class being inherited is called the superclass, and the inheriting class is the subclass.**

**A subclass can use existing features of the superclass and also add its own.**

**Inheritance promotes code reusability and reduces redundancy.**

***Example***: Dog, Cat, Cow can be Derived Class of Animal Base Class. 
![in img](https://media.geeksforgeeks.org/wp-content/uploads/20250722182112048071/inheritance-660x454.png)

### Types of Inheritance in Java
![ty img](https://media.geeksforgeeks.org/wp-content/uploads/20260122170656569199/inheritance_in_java.webp)
Java supports the following types of inheritance:
**Single Inheritance**: One subclass inherits from one superclass.

**Multilevel Inheritance**: A class is derived from another derived class, forming a chain.

**Hierarchical Inheritance**: Multiple subclasses inherit from a single superclass.

**Multiple Inheritance (through Interface)**: A class inherits from multiple interfaces since Java does not support multiple inheritance using classes.

**Hybrid Inheritance (through Interface)**: A combination of two or more types of inheritance, achievable using interfaces.

