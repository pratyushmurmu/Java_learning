package Basics_01;
// Java String concat() Method with Examples:
/*
Syntax of concat() Method
public String concat (String s);

Parameters:

A string to be concatenated at the end of the other string.
Return Value:

Concatenated(combined) string.
Exception:

NullPointerException: When either of the string is Null.
*/
public class concatString {
    //Combining Two Strings with concat() Method
    public static void main(String[] args) {
        String s1 = "Forrest";
        String s2 = " Gump";

        s1 = s1.concat(s2);

        System.out.println(s1);//Forrest Gump
    }
}

// Sequential Concatenation of Multiple Strings
class concating{
    public static void main(String[] args) {
        String s1 = "Computer ";
        String s2 = "Science ";

        String s3 = s1.concat(s2);
        String s4 = "Engineering ";
        String s5 = "Department";
        String s6 = s4.concat(s5);
        String str = s3.concat(s6);

        System.out.println(str);//Computer Science Engineering Department

    }
}

// Handling NullPointerException in String concat()
/*
class concatation{
    public static void main(String[] args) {
        String s1 = "Ravi";
        String s2 = null;

        String s3 = s1.concat(s2);
        System.out.println(s3);
    }
}
*/

/*
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.isEmpty()" because "str" is null
	at java.base/java.lang.String.concat(String.java:2974)
	at Basics_01.concatation.main(concatString.java:53)

Process finished with exit code 1

 */

// Reversing a String Using concat() Method

class Reverse{
    public static void main(String[] args) {
        // Declare original string variable
        String a = "Dhurandhar";

        // Declare another string variable and initialize it with an empty string
        String b = " ";

        // Iterate through each character in string "a" from the last index to the first.
        for (int i = a.length()-1; i >= 0; i--){  //( for (int i = a.length();....)---> It throws an "Off-By-One" Error (The Exception) i.e. StringIndexOutOfBoundsException: Index 10 out of bounds for length 10
            // which happens because string "Dhurandhar" has 10 characters and in Java, indexing starts at 0. So character indices are 0, 1, 2, 3, 4, 5, 6, 7, 8, 9.
            // The loop starts at i = a.length(), which is 10. When we call a.charAt(10), Java looks for the 11th character, finds nothing.
            // So always start your reverse loop at a.length() -1)
            // Extract the current character at index "i" of the "a" string
            char ch = a.charAt(i);

            // Convert the character to a String object using the "Character.toString" method
            String ch1 = Character.toString(ch);

            // Concatenate the converted character String to the end of the "b" string
            b = b.concat(ch1); //(Earlier it was b.concat(ch1) by mistake. Thus it do creates a new string but it doesn't save it back into b.)
        }

        System.out.println(" "+ a);
        System.out.println(" "+ b);
    }
}
/*
Output:
Dhurandhar
  rahdnaruhD
 */



