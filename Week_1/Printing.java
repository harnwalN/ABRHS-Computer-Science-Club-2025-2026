package Week_1;

public class Printing {
    public static void main (String[] args) {
        System.out.println("Hello, World!");
        // Prints "Hello, World!" and a new line

        System.out.println("Hello," + " World!");
        // Prints "Hello, World!" and a new line

        System.out.println('Hello, World!');
        // Throws an error because of single quotes

        System.out.println('a');
        // Allowed because 'a' is a char

        System.out.print("Hello, ");
        System.out.print("World!");
        // Prints "Hello, World!" without a new line
    }
}

