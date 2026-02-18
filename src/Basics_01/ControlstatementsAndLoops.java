package Basics_01;

public class ControlstatementsAndLoops {
    public static void main(String[] args) {
        // --------Conditional Statements--------
        //Java if Statement
        int i = 20;

        if (i > 15) {
            System.out.println("Condition is valid. Print the number");
        }

        //Java if-else Statement
        int n = 66;

        if (n > 60) {
            System.out.println("n is greater than 60");
        } else {
            System.out.println("n is lesser than 60");
        }

        //Java nested-if Statement
        int sal = 89000;

        if (sal < 95000) {
            System.out.println("Loan approved");
        }
        if (sal == 89000) {
            System.out.println("Loan application in waitlist");
        }

        //Java if-else-if ladder
        int collections = 30000000;
        int budget = 30000000;
        if (collections > budget) {
            System.out.println("Movie is a hit");
        } else if (collections < budget) {
            System.out.println("Movie is a flop");
        } else {
            System.out.println("Movie is an average grosser");//Movie is an average grosser
        }
        //Java Switch Case
        int no = 78;
        switch (no) {
            case 10:
                System.out.println("no is between 0-10");
                break;
            case 20:
                System.out.println("no is between 11-20");
                break;
            case 30:
                System.out.println("no is between 21-30");
                break;
            case 40:
                System.out.println("no is between 31-40");
                break;
            case 50:
                System.out.println("no is between 41-50");
                break;
            case 60:
                System.out.println("no is between 51-60");
                break;
            case 70:
                System.out.println("no is between 61-70");
                break;
            case 80:
                System.out.println("no is between 71-80");
                break;
            case 90:
                System.out.println("no is between 81-90");
                break;
            case 100:
                System.out.println("no is between 91-100");
                break;
            default:
                System.out.println("no is beyond 100");
        } //no is beyond 100 (since switch compares single value not ranges)

        //Ternary Operator (? :) in Java
        int s = 56, t = 67;
        int min = (s < t ? s : t);
        System.out.println("Minimum is: " + min);//Minimum is: 56


        // ------------Loops-------------
        // for loop
        int u = 100;
        for (int j = 0; j <= 9; j++) {
            int sum = u + j;
            System.out.println("Sum: " + sum);
        }

        //Enhanced for loop (for each)
        String[] names = {"Sweta", "Gudly", "Amiya"};

        for (String name : names) {
            System.out.println("Name: " + name);
        }

        //while Loop
        int k = 0;
        while (k <= 10) {
            System.out.println(k + " "); // 0 1 2 3 4 5 6 7 8 9 10
            k++;
        }

        //do-while Loop
        int g = 5;
        do {
            System.out.print(g + " ");//5 6 7 8 9 10
            final int i1 = g++;
        } while (g <= 10);

        //Jump Statements in Java

        //Continue Statement
        for (int l = 0; l < 5; l++) {
            if (l == 2) {
                System.out.println();
                // using continue keyword
                // to skip the current iteration
                continue;
            }
            System.out.println(l); //0 1   3 4
        }
        //Break statement ( to exit a loop )
        int m = 10;
        for (int o = 0; o < m; o++) {
            if (o == 4)
                break;
            System.out.println(o);//0 1 2 3
        }
        //Break statement ( as a form of goto )
        for (int h = 0; h < 3; h++) {
            one: {
                two: {
                    three: {
                        System.out.println("h=" + h);

                        // These MUST be inside the nested blocks to work
                        if (h == 0) break one;   // Jumps to the end of 'one'
                        if (h == 1) break two;   // Jumps to the end of 'two'
                        if (h == 2) break three; // Jumps to the end of 'three'
                    }
                    // Code here only runs if h is NOT 0 or 2
                    System.out.println("After block three");
                }
                System.out.println("After block two");
            }
            System.out.println("After block one");
        }
        //h=0
        //After block one
        //        h=1
        //After block two
        //After block one
        //        h=2
        //After block three
        //After block two
        //After block one

        //Process finished with exit code 0

        //Return statement in next one.

    }
}
