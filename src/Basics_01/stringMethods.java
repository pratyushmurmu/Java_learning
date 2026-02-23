package Basics_01;
//Java String Methods
/*In Java, a String represents a sequence of characters used for storing and manipulating text.
It is immutable and provides many built-in methods for operations like concatenation, comparison, and manipulation.
*/

import java.io.CharArrayWriter;

public class stringMethods {
    public static void main(String[] args) {
        String str = new String("Gajendra Purohit");

        System.out.println("Length: "+ str.length());//Length: 16
        System.out.println("Uppercase: "+ str.toUpperCase());//Uppercase: GAJENDRA PUROHIT
        System.out.println("Substring: "+ str.substring(4,9));//Substring: ndra
    }
}

//Commonly Used Java String Methods:
//1. int length() Method

//This method provides the total count of characters in the string.
class Length{
    public static void main(String[] args) {
        String a = "S.Shankar";
        System.out.println(a.length());//9
    }
}

//-------------------------------------------------------------------------------------------------------------------------------------
//2. charAt(int i) Method

//This method returns the character at ith index.
class atCharacter{
    public static void main(String[] args) {
        String s = "Darjeeling";
        System.out.println(s.charAt(7));//i
    }
}

//---------------------------------------------------------------------------------------------------------------------------------------------
//3. String substring(int i) Method

//This method return the substring from the ith index character to end.

class subStringOne{
    public static void main(String[] args) {
        String str = "Kaarkuzhal Kadavaiye";
        System.out.println(str.substring(6));//zhal Kadavaiye
    }
}

//--------------------------------------------------------------------------------------------------------------------------------------------------
//4. String substring(int i, int j) Method

//This method returns the substring from i to j-1 index.

class subString{
    public static void main(String[] args) {
        String f = "Fuck You All";
        System.out.println(f.substring(2,10));//ck You A
    }
}

//5. String concat( String str) Method

//This method appends the given string to the end of the current string.

class conCat{
    public static void main(String[] args) {
        String rat = "Infernal Affairs";
        System.out.println(rat.concat(" 2"));//Infernal Affairs 2
    }
}

//---------------------------------------------------------------------------------------------------------------------------------------
//6. int indexOf(String s) Method

/* This method returns the index within the string of the first occurrence of the specified string.
If the specified string s is not found in the input string, the method returns -1 by default.*/

class index{
    public static void main(String[] args) {
        String in = "Nathula Pass";
        System.out.println(in.indexOf("l"));//5
        System.out.println(in.indexOf("Pass"));//8
    }
}

//------------------------------------------------------------------------------------------------------------------------------------
/*
7. int indexOf(String s, int i) Method

This method returns the index within the string of the first occurrence of the specified string, starting at the specified index.
*/

class inString{
    public static void main(String[] args) {
        String c = "Gangs Of Wasseypur";
        System.out.println(c.indexOf("Wasseypur",5));
    }
}
/*
1. The Anatomy of the SearchTarget Substring: "Wasseypur"The Offset (fromIndex): 5The Execution: Java jumps directly to index 5 of the string "Gangs Of Wasseypur" and looks forward from there.
2. The String Index Map
   Let's look at how Java "sees" your string:
   Index:0  1   2   3   4      5    6   7      8    9   1   0   11...
   Char: G	a	n	g	s	[SPACE]	O	f	[SPACE]	W	a	s	...
*/
/*
Why the Output is 9
The Starting Point: Because you provided 5, Java ignores the first 5 characters (G, a, n, g, s).

The Discovery: It starts scanning at index 5 (which is the space after "Gangs"). It continues until it finds the character 'W'.

The Match: The character 'W' that starts the word "Wasseypur" is located at index 9.

The Result: Even though Java started looking from index 5, it always returns the absolute index of the match relative to the very beginning of the string (index 0).

In a big industry level project (like building a search engine or a text editor), you often need to find multiple occurrences of the same word.

You find the first one at index 9.

To find the next one, you would call indexOf("Wasseypur", 10).

This tells Java: "I already found the one at index 9, start looking after it so I don't get the same result again."
*/

//-------------------------------------------------------------------------------------------------------------------------------------
//8. int lastIndexOf(String s) Method

//This method returns the index within the string of the last occurrence of the specified string.
//If the specified string s is not found in the input string, the method returns -1 by default.

class lastIndex{
    public static void main(String[] args) {
        String t = "Kamakhyanagar";
        System.out.println(t.lastIndexOf("a"));//11
    }
}
//-------------------------------------------------------------------------------------------------------------------------------

/*
9. boolean equals(Object otherObj) Method

This method compares this string to the specified object.
*/

class Boolean{
    public static void main(String[] args) {
        String bool = "Thiruvananthapuram";
        System.out.println(bool.equals("Thiruvananthapuram"));//true
        System.out.println(bool.equals("Ravi"));//false
    }
}

//--------------------------------------------------------------------------------------------------------------------------------

/*
10. boolean equalsIgnoreCase(String anotherString) Method

This method checks if two strings are equal, without considering letter case.
*/

class boolIgnore{
    public static void main(String[] args) {
        String i = "Bhubaneswar";
        System.out.println(i.equalsIgnoreCase("bhubaneswar"));//true
    }
}

//-------------------------------------------------------------------------------------------------------------------------------

/*
11. int compareTo(String anotherString) Method

This method compares two string lexicographically.
*/

class compare{
    public static void main(String[] args) {
        String g = "Hello, Alisha";
        System.out.println(g.compareTo("Hello, Subhalaxmi"));
    }
}
/*
Why the result is -18Once Java finds a mismatch, it stops looking at the rest of the string
(it doesn't care about "lisha" or "ubhalaxmi") and performs a simple subtraction of their Unicode (ASCII) values.
        The formula used is:
        Result = (Unicode of Character in String 1) - (Unicode of Character in String 2)
The Math: Unicode value of 'A' is 65.Unicode value of 'S' is 83.

Calculation: 65 - 83 = -18.
How to interpret the result:
Negative Result: Means the first string comes before the second string in a dictionary.
Positive Result: Means the first string comes after the second string.
Zero: Means the strings are exactly identical.
*/

/*

//-------------------------------------------------------------------------------------------------------------------------------------------

12. int compareToIgnoreCase(String anotherString) Method

This method compares two string lexicographically, ignoring case considerations.
*/

class comIgnore{
    public static void main(String[] args) {
        String d = "Goa, Daman and Diu";
        System.out.println(d.compareToIgnoreCase("Daman and Diu"));
    }
}

/*
Why the output is 3?
When you compare two strings where one is not a prefix of the other, Java usually subtracts character values.
But when it realizes it's comparing two completely different sequences, it looks at the lengths if a mismatch
occurs at the start or if one string ends before a mismatch is found.Actually, in this specific case,
it's even simpler: The strings are being compared from index 0.
First Character Mismatch:
String 1 (d) starts with 'G'.
String 2 (argument) starts with 'D'.
The Comparison:
Since 'D' comes before 'G' in the alphabet, Java performs the subtraction: (Value of 'G' - Value of 'D').
D is the 4th letter, G is the 7th.
71 (G) - 68 (D) = 3.
*/
//-----------------------------------------------------------------------------------------------------------------------------------------

/*
13. String toLowerCase() Method

This method converts all the characters in the String to lower case.
*/

class Lowercase{
    public static void main(String[] args) {
        String b = "Sapta Sagaradaache Ello - Side B";
        System.out.println(b.toLowerCase());//sapta sagaradaache ello - side b
    }
}

//-----------------------------------------------------------------------------------------------------------------------------------------
/*
14. String toUpperCase() Method

This method converts all the characters in the String to upper case.
*/

class upper{
    public static void main(String[] args) {
        String y = "sapta sagaradaache ello - side b";
        System.out.println(y.toUpperCase());//SAPTA SAGARADAACHE ELLO - SIDE B
    }
}

//-------------------------------------------------------------------------------------------------------------------------------------------
/*
15. String trim() Method

This method returns the copy of the String, by removing whitespaces at both ends.
It does not modify the whitespace characters present between the text.
 */

class Trim{
    public static void main(String[] args) {
        String k = "     Lalo Salamanca    ";
        System.out.println("Breaking Bad "  +k.trim() + " Soprano");//Breaking Bad Lalo Salamanca Soprano
    }
}

//-----------------------------------------------------------------------------------------------------------------------------------------
/*
16. String replace(char oldChar, char newChar) Method

This method returns a new string where all instances of oldChar are replaced by newChar.
 */

class Replace{
    public static void main(String[] args) {
        String a  = "Arigato Omaibass";
        System.out.println(a.replace("Omaib", "Biom"));//Arigato Biomass
    }
}

//----------------------------------------------------------------------------------------------------------------------------------------
/*
17. boolean contains(CharSequence sequence) Method

This method returns true if string contains the given string.
 */

class Contain{
    public static void main(String[] args) {
        String v = "Guillermo del Toro";
        System.out.println(v.contains("Toro"));//true
    }
}

//----------------------------------------------------------------------------------------------------------------------------------------
/*
18. char[] toCharArray() Method

This method converts the string into a new character array.
 */
class charArrays{
    public static void main(String[] args) {
        String w = "Zan Jelensky";
        char[] chars = w.toCharArray();
        for (char c : chars){
            System.out.print(c + "-");//Z-a-n- -J-e-l-e-n-s-k-y-
        }
    }
}

//----------------------------------------------------------------------------------------------------------------------------------------
/*
19. boolean startsWith(String prefix) Method

This method returns true if string starts with this prefix.
 */

class Starts{
    public static void main(String[] args) {
        String to = "Mohanlal-Mammootty’s";
        System.out.println(to.startsWith("Mohanlal"));//true
    }
}

































