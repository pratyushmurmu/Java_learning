package Basics_01;
import java.util.Scanner;

public class numberGuessgame { // Class names should start with Uppercase

    public static void playGame() { // All logic must be in a method
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int)(100 * (Math.random()));
        int loops = 5;
        int guess = 0; // Declare here so it's accessible outside the loop

        System.out.println("Choose a number between 1 and 100");
        System.out.println("You have " + loops + " attempts.");

        boolean won = false;
        for (int i = 0; i <= loops; i++) {
            System.out.print("Attempt " + i + " - Enter your guess: ");
            guess = sc.nextInt();

            if (guess == number) {
                System.out.println("Congratulations!!! Your guess is correct.");
                won = true;
                break; // Exit the loop early if they win
            } else if (guess > number) {
                System.out.println("Oops! Your guess is greater than the secret number.");
            } else {
                System.out.println("Oops! Your guess is less than the secret number.");
            }
        }

        if (!won) {
            System.out.println("You exhausted your chances. The correct number was " + number);
        }
        sc.close();
    }

    public static void main(String[] args) {
        playGame(); // Call the static method
    }
}



// The original error code:
//---------------------------------------------------------------------------------------------------
/*
package Basics_01;

import java.util.Scanner;

public class numberGuessgame {
    Scanner sc = new Scanner(System.in);

    int number = 1 + (int)(100 * (Math.random()));

    int loops = 5;
    System.out.println("You have to choose a number between 1 and 100");
     System.out.println("You have "+ loops+" attempts to choose the correct number");

     for(int i = 1; i <= 5; i++){
         System.out.println("Enter your guess: ");
         int guess = sc.nextInt();
    }

     if(guess == number){
        System.out.println("Congratulations!!! your guess is correct");
        sc.close();

        return;
    }
      else if(guess > number){
        System.out.println("Oops your guess is greater than "+number);
    }

      else{
        System.out.println("Oops your guess is less than "+number);
    }
      System.out.println("Oops you have exhausted your chances. The correct number was " + number + " .Never mind try again");
      sc.close();

    }

public static void main(String[] args) {
    numberGuessgame();
}
*/

/*
1. The "Floating Code" Error
You have placed your game logic (the for loop, if-else statements, and System.out.println)
directly inside the class body.

The Rule: In Java, you can only declare variables or methods inside a class.
Executable code (like loops and print statements) must be inside a method.

The Fix: Move all your logic into a method, like public void play().

        2. The Variable Scope Error
You declared int guess inside your for loop:

Java
for(int i = 1; i <= 5; i++){
int guess = sc.nextInt(); // Created here
}
// guess is "dead" here!
        if(guess == number) { ... } // Error: cannot find symbol 'guess'
The Problem: Variables declared inside a loop only exist inside that loop.
Once the loop ends, guess is deleted from memory.

The Fix: Declare int guess; above the loop so the if-else statements can see it.

        3. Static vs. Non-Static Error
In your main method, you try to call numberGuessgame();.

The Problem: main is static (it belongs to the class), but your method is (currently) instance-based.
Also, you used the class name as if it were a method.
*/