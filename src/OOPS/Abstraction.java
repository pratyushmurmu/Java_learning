package OOPS;
/*
Abstraction in Java:
Abstraction in Java is the process of hiding internal implementation details and showing only essential functionality to the user.
It focuses on what an object does rather than how it does it.

Abstraction hides the complex details and shows only essential features.
Abstract classes may have methods without implementation and must be implemented by subclasses.
By abstracting functionality, changes in the implementation do not affect the code that depends on the abstraction.
 */
/*
How to Achieve Abstraction in Java?
Java provides two ways to implement abstraction, which are listed below:

--> Abstract Classes (Partial Abstraction)
--> Interface (100% Abstraction)
 */
/*
Real-Life Example of Abstraction
The television remote control is the best example of abstraction. It simplifies the interaction with a TV by hiding all the complex technology.
We don't need to understand how the TV internally works; we just need to press the button to change the channel or adjust the volume.
 */

abstract class TV{
    abstract void TurnOn();
    abstract void TurnOff();
}
class TVRemote extends TV{
    @Override  // Override fulfills the "contract" set by the abstract class;
               // it provides the mandatory implementation for an unfinished method.
    /*
    Explanation:
    The "Contract" Concept: In professional Java development, we view abstract methods as a legal agreement. The superclass says,
    "I don't know how to turn on, but I promise every child of mine will have a way to do it".

     No Code to "Override": Since the original method was abstract, there were no curly braces {} or logic to begin with.
     You are defining it, not just re-defining it.
     */
    void TurnOn(){
        System.out.println("TV is turned ON");
    }
    @Override
    void TurnOff(){
        System.out.println("TV is turned OFF");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        TV Remote = new TVRemote();
        Remote.TurnOn();
        Remote.TurnOff();
    }
}
/*
Output:
TV is turned ON
TV is turned OFF
 */

