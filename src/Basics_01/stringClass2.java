package Basics_01;
//Java.lang.String class in Java | Set 2
// String Class Methods:

//1. codePointAt(int index): It returns the Unicode code point of the character at the specified index.
public class stringClass2 {
    public static void main(String[] args) {
        String s = "Lion";
        int i = s.codePointAt(2);
        System.out.println("The Unicode value of character at index 2: " + i);// The Unicode value of character at index 2: 111
    }
}

//2. codePointBefore(int index): Returns the Unicode code point of the character before the specified index.

class code0{
    public static void main(String[] args) {
        String f = "Baahubali";
        int a = f.codePointBefore(6);
        System.out.println("The Unicode value of character before the index 6: " + a);
        //The Unicode value of character before the index 6: 98
    }
}
/*
The Target: You called f.codePointBefore(6).

The Logic: Java looks at the character at index (6 - 1), which is index 5.

The Character: At index 5, the character is lowercase 'b'.

The Unicode: * 'a' is 97.

'b' is 98.
 */

//3. codePointCount(int beginIndex, int endIndex): Returns the number of Unicode code points in the specified range.
class code1{
    public static void main(String[] args) {
        String t = "Pirates Of The Caribbean";
        int b = t.codePointCount(2,15);
        System.out.println("The number of Unicode code points in the specified range: " + b);
        //The number of Unicode code points in the specified range: 13
    }
}
/*
The Logic of codePointCount(beginIndex, endIndex)
This method counts the number of "Unicode code points" between the beginIndex (inclusive) and the endIndex (exclusive).

Begin Index (2): The counting starts at index 2.

End Index (15): The counting stops just before index 15.

Mapping the String: "Pirates Of The Caribbean":
Index: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14,[15]
Char:  P, i, r, a, t, e, s,  , O, f,   ,  T,  h,  e,   , C

If you count the characters from index 2 ('r') up to index 14 (the space before 'C'), you get exactly 13 characters.
 */

// 4.subSequence(int beginIndex, int endIndex): Returns a CharSequence that is a subsequence of the string.
class code2{
    public static void main(String[] args) {
        String u = "Bhootakalam";
        CharSequence c = u.subSequence(1,11);
        System.out.println(c);//hootakalam
    }
}

// 5. contains(CharSequence s): Checks if the string contains the specified sequence.
class code3{
    public static void main(String[] args) {
        String v = "Brahmayugam";
        boolean d = v.contains("Brahmayugam");
        System.out.println(d);//true
    }
}

// 6. contentEquals(CharSequence s): Checks if the given CharSequence exactly matches the string.
class code4{
    public static void main(String[] args) {
        String w = "Kishkindakadam";
        boolean e = w.contentEquals("Kishkinda");
        System.out.println(e);//false
    }
}

// 7. endsWith(String suffix): Returns true if the string ends with the specified suffix.
class code5{
    public static void main(String[] args) {
        String x = "Eko";
        boolean fi = x.endsWith("o");
        System.out.println(fi);//true
    }
}

// 8. startsWith(String prefix): Returns true if the string starts with the specified prefix.
class code6{
    public static void main(String[] args) {
        String y = "https://www.geeksforgeeks.org/java/java-lang-string-class-java-set-2/";
        boolean g = y.startsWith("https:");
        System.out.println(g);//true
    }
}

// 9. getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin): Copies characters from a string into a destination character array.
class code7{
    public static void main(String[] args) {
        String z = "Indira Gandhi Institute Of Technology";
        System.out.println("String: " + z);// String: Indira Gandhi Institute Of Technology

        char[] array = new char[13];
        z.getChars(0,13,array,0);

        System.out.println("Char array contains: ");// Char array contains:
        for (int i =0; i < array.length; i++){
            System.out.print(array[i] +" ");// I n d i r a   G a n d h i
        }
    }
}
/*
Output:
String: Indira Gandhi Institute Of Technology
Char array contains:
I n d i r a   G a n d h i
----------------------------------------------------------------------------------------------------------------
The Anatomy of getChars()
The method requires four specific parameters to coordinate the transfer:

srcBegin (0): The index in the String where you want to start copying from (Inclusive).

srcEnd (13): The index in the String where you want to stop copying (Exclusive).

dst (array): The destination array where the characters will be "pasted."

dstBegin (0): The index in the array where you want to start pasting the characters.
1. Visualizing the Transfer:
In your code, you are taking the first 13 characters of "Indira Gandhi Institute Of Technology" and placing them into an array of size 13.
String
Index:     0  1  2  3  4  5  6   7  8  9  10  11  12
Character: I  n  d  i  r  a [sp] G  a  n   d   h   i
Because your srcEnd is 13, it grabs everything from index 0 to 12.

2. Why use this instead of toCharArray()?
You might wonder, "Why not just use z.toCharArray()?"

toCharArray(): Copies the entire string. If you only need a small piece of a huge string, this is a waste of memory.

getChars(): Is a Selective Copy. You can grab exactly what you need and place it exactly where you want it in an existing array.
This is much faster in high-performance "Seinen" level applications.
 */

// 10. toCharArray(): Converts the entire string into a new character array.
class code8{
    public static void main(String[] args) {
        // Define a string
        String a = "Kanyakumari";

        // Convert the string to a character array
        char[] ar = a.toCharArray();
        System.out.println(ar);//Kanyakumari
    }
}
// Note: Use getChars() when copying partial content into an existing array.

// 11. hashCode(): Returns the hash code for the string using the formula:
class code9{
    public static void main(String[] args) {
        String c = "A Knight Of The Seven Kingdoms";
         int hash = c.hashCode();
        System.out.println(hash);//-1461041857

        String d = "Naval";
        int Hashset = d.hashCode();
        System.out.println(Hashset);//75040878
    }
}
/*
A Hash Code is essentially a "digital fingerprint" for an object.
It is a single integer representing the contents of the string, allowing Java to find or compare objects incredibly fast.
 Why is it Negative?
 You might be surprised to see -1461041857.
 In Java, an int has a maximum value of 2^{31}-1 (2,147,483,647).
 Because your string "A Knight Of The Seven Kingdoms" is quite long, the math in the formula produces a number much larger than 2 billion.
 When the number exceeds the maximum limit, it "overflows" and wraps around into the negative range.
 This is completely normal in Java.
 */

// 12. intern(): Returns the canonical representation of the string from the String pool.
class code10{
    public static void main(String[] args) {
        String e = new String("Joker").intern();
        System.out.println(e);//Joker
    }
}
/*
1. What is intern()?
Normally, when you use the new keyword, Java is forced to create a brand new object in the general heap memory, even if that same string already exists elsewhere.

The intern() method is a way of telling Java: "Check the String Pool.
If 'Joker' is already in there, give me the reference to that existing one.
If it's not there, put this one in the pool and then give me the reference."

2. Why is the output "Joker"?
The output is "Joker" simply because intern() returns the string value itself.
It doesn't change the characters; it only changes where in memory the variable e points.

3. The "Seinen" Deep Dive: Memory Visualization
This is where the magic happens. Let's look at what happens behind the scenes in your code:

new String("Joker"): This creates an object in the regular Heap memory.

.intern(): Java looks into the String Pool.

The Result: The variable e now points to the version of "Joker" inside the Pool, not the one in the general Heap.

4. Why would you ever use this? (The Pro Move)
In massive applications (like a social media site or a big DSA problem with millions of strings), you might
have the word "Follow" appearing 1,000,000 times.

Without intern(), you have 1,000,000 separate objects in memory (very expensive).

With intern(), all 1,000,000 variables point to one single "Follow" string in the pool.
This saves a massive amount of RAM.
 */

// 13. isEmpty(): Returns true if the string length is 0.
class code11{
    public static void main(String[] args) {
        String faah = "Fahaad";
        boolean result = faah.isEmpty();
        System.out.println(result);//false
    }
}

// 14. format(String format, Object... args): Returns a formatted string using format specifiers.
class code12{
    public static void main(String[] args) {
        String g = "Tetrahedronicblast";

        String res = String.format("This is a %s!",g);
        System.out.println(res);//This is a Tetrahedronicblast!
    }
}
/*
Specifier | Data Type             | Example  Output
%s           String                   "Hello World"
%d           Integer (Decimal)        "10, 500, -2"
%f           Float/Double               3.14159
 */

// 15. matches(String regex): Checks if the string matches the given regular expression.
class code13{
    public static void main(String[] args) {
        String h = "The Family Man";
        boolean yes = h.matches("[a-zA-Z\\s]+");
        System.out.println(yes);//false for ([a-zA-Z]+) and true for ([a-zA-Z\s]+)
    }
}
/*
Why's the output false?

The output is false because of the spaces between the words.

1. The Strictness of matches()
The matches() method is an "all or nothing" operation. It only returns true if the entire string, from the very first character to the very last, fits the pattern exactly.

In your string "The Family Man", you have two spaces:

The [space] Family [space] Man

2. Decoding the Pattern [a-zA-Z]+
Your regex [a-zA-Z]+ translates to: "I only accept a sequence of one or more uppercase or lowercase letters."

It does not include the space character.

The moment Java hits the space after "The", it sees a character that isn't a letter (a-z or A-Z).

Since the pattern doesn't account for spaces, the match fails immediately.

The Fix:
If you want to allow spaces in your name check, you have to explicitly tell the regex to look for them.
Here are three ways to do it:

Option A: Add a literal space
Just put a space inside the brackets:
"[a-zA-Z ]+" (Matches letters and spaces)

Option B: Use the whitespace shorthand
Use \\s to represent any whitespace (spaces, tabs):
"[a-zA-Z\\s]+"
*/

// 16. regionMatches(...): Compares a region of one string with a region of another string.
class code14{
    public static void main(String[] args) {
        // Create two string objects
        String io = "Kohraa";
        String og = "Pataal Lok";

        // Comparing substring of io and og
        boolean rest = io.regionMatches(5,og,0,5);

        System.out.println(rest);//false
    }
}
/*
1. Decoding the Parameters
The method io.regionMatches(5, og, 0, 5) uses four specific coordinates to define the battleground:

5 (srcOffset): Start looking in the first string (io) at index 5.

og (other): The second string you are comparing against.

0 (otherOffset): Start looking in the second string (og) at index 0.

5 (len): Compare exactly 5 characters from these starting points.

2. Why the output is false
Let's look at the actual characters being compared based on your offsets:

Region in io ("Kohraa"):
Starts at index 5.
Character at index 5 is 'a'.

Wait! There is only 1 character left in "Kohraa" starting from index 5.

Region in og ("Pataal Lok"):
Starts at index 0.
The first 5 characters are "Pataa".

The Verdict:
Even though the method asks to compare 5 characters, "Kohraa" only has 1 character available from index 5 onwards.
Java sees that the requested length (5) exceeds the remaining characters in the first string, and
the characters it can see ('a' vs 'P') don't match anyway. Therefore, it returns false.
 */

// 17. split(String regex): Splits the string using a regular expression.
class code15{
    public static void main(String[] args) {
        String str1 = "Pratyush Murmu";
        String[] arr = str1.split(" ");
        for (String str : arr){
            System.out.println(str);
        }
    }
}
/*
Output:
Pratyush
Murmu

1. How the Code Works
The magic happens at str1.split(" ").

The Target: You have the string "Pratyush Murmu".

The Delimiter: You provided a single space " " as the argument.
This tells Java: "Every time you see a space, cut the string right there."

The Storage: The split() method returns a String Array (String[]).
It doesn't modify the original string (because strings are immutable);
it creates new, smaller strings and packs them into an array.

Step |       Action             |           Result
1        "Locate delimiter " "      Java finds the space at index 8.
2         First Slice               "Everything before index 8 becomes arr[0] (""Pratyush"")."
3         Second Slice              "Everything after index 8 becomes arr[1] (""Murmu"")."
4         The Loop                  "The for-each loop visits arr[0], then arr[1], printing them on new lines."
 */

// 18. join(CharSequence delimiter, CharSequence... elements): Joins elements using the specified delimiter.



