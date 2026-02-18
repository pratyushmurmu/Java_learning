package Basics_01;

public class OperatorsAndVariables {
    // Type psvm inside {} for this given below:
    //     public static void main(String[] args) {
    //
    //    }
    public static void main(String[] args) {
        System.out.println("Hello Pratyush!!!!"); // sout --> Shortcut for ' System.out.println();'
        // integer variable
        int age = 22;

        // String variable
        String name = "IGIT";

        // double variable
        double cgpa = 8.60;

        System.out.println("Age: "+ age);
        System.out.println("Name: "+ name);
        System.out.println("CGPA: "+ cgpa);

        // Arithmetic Operators
        int a = 345, b = 654;

        int sum= a+b;
        int diff= a-b;
        int product= a*b;
        int divisor= a/b;
        int modulo= a%b;

        System.out.println("Sum="+ sum); //999
        System.out.println("Difference="+ diff); //-309
        System.out.println("Product="+ product); //225630
        System.out.println("Divisor="+ divisor); //0
        System.out.println("Remainder="+ modulo); //345

        //Unary Operators
         int c = 45;
         int d = 45;

         //Using unary operators
        System.out.println("Post increment: "+(c++)); //45 (First print c= 45 then c++ = 46)
        System.out.println("Pre increment: "+(++c)); //47 (First ++ = 47 then print ++c = 47)
        System.out.println("Post decrement: "+(d--)); //45 (First print d= 45 then d-- = 44)
        System.out.println("Pre decrement: "+(--d)); //43 (First -- = 43 then print --d = 43)

        // assignment operator
        int n = 20;
        n+=5;
        System.out.println("After +=: "+ n);//25

        n-=5;
        System.out.println("After -=: "+ n);//20

        n*=5;
        System.out.println("After *=: "+ n);//100

        n/=5;
        System.out.println("After /=: "+ n);//20

        n%=5;
        System.out.println("After %=: "+ n);//0

        //Relational Operators
        int num1= 4;
        int num2= 5;
        int num3= 3;

        System.out.println("num1>num2: "+ (num1>num2));// false
        System.out.println("num1<num2: "+ (num1<num2));// true
        System.out.println("num1>=num2: "+ (num1>=num2));// false
        System.out.println("num1<=num2: "+ (num1<=num2));// true
        System.out.println("num1==num3: "+ (num1==num3));// false
        System.out.println("num1!=num3: "+ (num1!=num3));// true

        //Logical Operators
        boolean x= true;
        boolean y= false;

        System.out.println("x && y: "+ (x &&y));// false
        System.out.println("x || y: "+ (x || y));// true
        System.out.println("!x: "+ (!x));// false

        //Ternary operator
        int s=11, t=22, u=33, result;
        result=((s>t)?(s>u)?s:u:(t>u)?t:u);
        System.out.println("Max of three numbers= "+ result);//33

        //1. The Outer Condition: (s > t)
        //The computer first asks: Is 11 > 22?

          //      Result: false.

            //    Action: Because it is false, the computer ignores the first half ((s > u) ? s : u) and jumps straight to the code after the first colon.

        //2. The "False" Path: (t > u) ? t : u
        //Now the computer only cares about this part because it already knows t is bigger than s. It now compares t with u.

        //Condition: Is 22 > 33?

          //      Result: false.

            //    Action: It picks the value after the second colon, which is u.

        //3. Final Result
        //The value of u (33) is assigned to result.

        //Bitwise Operators and Shift Operators
        int e = 0b1010; // '0b'-> Prefix denotes binary; 0b1010= 10 in decimal
        int f = 0b1100; // 0b1100= 12 in decimal

        //AND (&): Result is 1 only if both bits are 1.
        System.out.println("e & f :"+ (e & f)); //8  (1010 & 1100 = 1000 (Decimal 8))
        //OR (|): Result is 1 if at least one bit is 1.
        System.out.println("e | f : "+ (e | f)); //14 (1010 | 1100 = 1110 (Decimal 14))
        //XOR (^): Result is 1 if the bits are different.
        System.out.println("e^f : "+ (e^f)); //6 (1010 ^ 1100 = 0110 (Decimal 6))
        //NOT (~): Flips every bit (0 becomes 1, 1 becomes 0).
        System.out.println("~e: "+ (~e)); //-11 (~1010 becomes -11 due to Two's Complement (how Java stores negative numbers).)
        //Left Shift (<<): Pushes bits to the left and adds 0s at the end. Shifting left by n is like multiplying by 2^n.
        System.out.println("e << 2: "+ (e << 2)); //40 (1010 << 2 becomes 101000 (Decimal 40).)
        //Right Shift (>>): Pushes bits to the right. Shifting right by n is like dividing by 2^n.
        System.out.println("e >> 3: "+ (e >> 3)); //1 (1010 >> 3 becomes 0001 (Decimal 1).)
        //Unsigned Right Shift (>>>): Similar to right shift, but it always fills the empty leading spots with 0, regardless of whether the number is positive or negative.
        System.out.println("f >>> 4: "+ (f >>> 4)); //0 (1100 (12) >>> 4 pushes all bits out of the frame, resulting in 0.)

        //instanceof Operator
        //The instanceof operator is a comparison operator used to check if an object belongs to a specific class or implements a specific interface.
        //It returns a boolean value: true if the object is an instance of the specified type, and false otherwise.
        String str = "Hello";
        System.out.println(str instanceof String); //true [Simple Class Check]
        //(You created a variable str that holds a String object.Since str is indeed a String, the result is true.)

        Object obj = Integer.valueOf(10);
        System.out.println(obj instanceof Integer); //true [The Power of Polymorphism]
        //(Even though the reference type is Object, the actual object in memory is an Integer. Therefore, instanceof Integer returns true.)
        System.out.println(obj instanceof String); //false
        //(An Integer object is not a String. They belong to different "branches" of the class tree. Therefore, it returns false.)
    }
}
