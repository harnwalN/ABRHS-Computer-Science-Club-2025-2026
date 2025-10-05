package Week_2;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Welcome to Week 2 Java!";

        // Return character at a specific index
        System.out.println(str.charAt(3)); // c
        
        // Return index of a character or substring
        str.indexOf('W'); // 0
        str.indexOf('W', 2); // 11

        // Return last index of a character or substring
        str.lastIndexOf('a'); // 21
        str.lastIndexOf('a', 19); // 19

        // Return Length of the string
        System.out.println(str.length()); // 23

        // Checks if strings are equal
        System.out.println(str.equals("Welcome to Week 2 Java!")); // true
        System.out.println(str.equals("welcome to week 2 java!")); // false

        // Check if string contains a substring
        System.out.println(str.contains("Java")); // true
        System.out.println(str.contains("java")); // false

        // Return substring from range [start to end)
        System.out.println(str.substring(0, 7)); // Welcome

        // Convert to uppercase
        System.out.println(str.toUpperCase()); // WELCOME TO WEEK 2 JAVA!

        // Convert to lowercase
        System.out.println(str.toLowerCase()); // welcome to week 2 java!

        // Replace characters
        System.out.println(str.replace('o', 'a')); // Welcame ta Week 2 Java!
        System.out.println(str.replace("Week", "Month")); // Welcome to Month 2 Java

        
    }
}
