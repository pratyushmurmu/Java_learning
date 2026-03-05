package OOPS;
/*
Packages in Java:
A package in Java is a mechanism to group related classes, interfaces, and sub-packages into a single unit. Packages help
organize large applications, avoid naming conflicts, provide access protection, and make code modular and maintainable.
 */
/*
In Simple Layman's term:
1. The "Two Johns" Problem (Naming Conflicts):
Imagine you are in a crowded market and you yell, "Hey, John!" Five different men named John turn around. You are confused, and they are confused.

In Java: You might create a class called User. But a library you downloaded also has a class called User.

The Package Solution: You put yours in a folder called com.maverick.project and the other is in com.google.auth.

Now, Java knows exactly which "John" you are talking about: maverick.User vs. google.User.

2. The "Kitchen Cabinet" (Organization):
Think of your kitchen. You don't put your socks in the same drawer as your spoons.

Spices Package: Turmeric, Salt, Chili Powder.

Utensils Package: Spoons, Forks, Knives.

By grouping "related" things together, you don't have to search the whole house to find a fork. In your Java repo, you might have
a sorting package for your DSA algorithms and a models package for your classes like Man or Father.

3. The "Staff Only" Door (Access Protection):
In a big office, some rooms are open to the public (the Lobby), but some rooms are "Staff Only" (the Server Room).

Packages allow you to say: "This specific method is only for classes inside this folder. No outsiders allowed." This is what
your friends meant about "taking responsibility"—packages help you hide the "messy" parts of your code so other people (or your future self)
don't accidentally break them.

4. How it looks in the "Real World":
When you look at the top of a Java file and see:
package com.gfg.dsa.arrays;

It’s just telling the computer: "I am currently sitting in the 'arrays' folder, which is inside the 'dsa' folder, which is
inside the 'gfg' folder."
 */

/*
Types of Java Packages:

1. Built-in Packages
Built-in Packages comprise a large number of classes that are part of the Java API. Some of the commonly used built-in packages are:

--> java.lang: Contains language support classes(e.g, classes that define primitive data types, math operations). This package is
               automatically imported.

--> java.io: Contains classes for supporting input/output operations.

--> java.util: Contains utility classes that implement data structures such as Linked Lists and Dictionaries, as well as support
               for date and time operations.

--> java.applet: Contains classes for creating Applets.

--> java.awt: Contains classes for implementing the components for graphical user interfaces (like buttons, menus, etc). 6)
 */

/*
Example: Using java.util.Random (Built-in Package)
 */

import java.util.Random;
public class Packages {
    public static void main(String[] args) {
        Random ran = new Random();

        int num = ran.nextInt(100);
        System.out.println("Random Number: " + num);//Random Number: 55
    }
}
/*
Explanation:
1. The Invitation (import java.util.Random;)
Imagine Java is a massive library. You can't carry every book at once, or your "backpack" (memory) would be too heavy.

This line tells Java: "Go to the java department, look in the util (utility) folder, and bring me the Random tool."

2. The Machine (Random ran = new Random();)
This is where you actually build the tool.

* Random is the type of machine.

* ran is the name you gave to your specific machine.

* new Random() is the act of unboxing it and plugging it in.

3. The Action (ran.nextInt(100);)
Now you are pressing a button on your machine.

nextInt(100) tells the machine: "Give me a random whole number starting from 0 up to (but not including) 100."

It's like a digital die with 100 sides (0 to 99).

4. The Result (System.out.println(...))
Finally, you take the number the machine gave you (which you stored in the variable num) and display it on the screen.
 */

/*
2. User-defined Packages
User-defined Packages are the packages that are defined by the user.
 */
