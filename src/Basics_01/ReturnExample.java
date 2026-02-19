package Basics_01;

public class ReturnExample {
    // A simple method that takes two integers as input and returns their sum
    public static int calcSum(int num1, int num2){
        System.out.println("Calculating the sum of "+num1+" and "+num2);
        // Prints a message indicating the process has started
        int sum = num1 + num2;
        System.out.println("The sum is "+sum);

        return sum;// return the calculated sum

        // Note: Any code after the 'return' statement will
        // not be executed. But "Final" is an exception in
        // the case of try-catch-final block.
        // System.out.println("end"); // error : unreachable
        // statement
    }
    public static void main(String[] args) {
        int result = calcSum(6,8);// Call the calcSum method

        System.out.println("Result: "+result);// Prints the result
    }
}
