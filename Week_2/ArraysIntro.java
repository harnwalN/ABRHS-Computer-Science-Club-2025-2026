package Week_2;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        // Use an initializer list to set values of an array
        int[] numbers = {1, 2, 3, 4, 5};
        // --> numbers: [1, 2, 3, 4, 5]
        String[] words = {"Hello", "World"};
        // --> words: ["Hello", "World"]

        // Declare arrays with default starting values
        int[] moreNumbers = new int[3];
        // --> moreNumbers: [0, 0, 0] (default values for int array)

        // Assign values to specific indices
        for (int i = 0; i < moreNumbers.length; i++) { // iterates through i = 1, 2, 3
            moreNumbers[i] = i+1;
        }
        // --> moreNumbers: [1, 2, 3]

        System.out.println(moreNumbers[0]); // Prints first element --> 1

        // Assignment of values
        String[] moreWords = new String[2];
        // --> moreWords: [null, null] (default value of String)
        moreWords[0] = "Chris";
        // --> moreWords: ["Chris", null]
        moreWords[1] = "Rules";
        // --> moreWords: ["Chris", "Rules"]

        System.out.println(moreWords[1]);
        // --> Prints second element --> "Rules"

        // Iterate through and print all elements of the array
        for (int i = 0; i < moreWords.length; i++) {
            System.out.println(moreWords[i]);
        }
        // --> Prints:
        // Chris
        // Rules
        // 

        // Easier method of checking array contents
        System.out.println(Arrays.toString(numbers));
        // --> Prints: [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(words));
        // --> Prints: [Hello, World]
    }
}
