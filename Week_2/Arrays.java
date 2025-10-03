package Week_2;

public class Arrays {
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
        for (int i = 1; i <= moreNumbers.length; i++) {
            moreNumbers[i] = i;
        }
        // --> moreNumbers: [1, 2, 3]

        System.out.println(moreNumbers[0]); // Prints first element --> 1


        String[] moreWords = new String[2];
        // --> moreWords: [null, null] (default value of String)
        moreWords[0] = "Chris";
        // --> moreWords: ["Chris", null]
        moreWords[1] = "Rules";
        // --> moreWords: ["Chris", "Rules"]

        System.out.println(moreWords[1]);
        // --> Prints second element --> "Rules"

        System.out.println(numbers.toString());
        System.out.println(words.toString());
    }
}
