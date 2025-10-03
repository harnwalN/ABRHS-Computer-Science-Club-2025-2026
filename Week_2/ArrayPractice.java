package Week_2;

import java.util.*;

public class ArrayPractice {
    public static void main(String[] args) {
        //--- Array declaration and initialization ---//
        // What will arrays contain after the following line?
        int[] intArray = new int[2];
        double[] doubleArray = new double[2];
        String[] strArray = new String[2];
        char[] charArray = new char[2];
        boolean[] boolArray = new boolean[2];

        // Check
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(doubleArray));
        System.out.println(Arrays.toString(strArray));
        System.out.println(Arrays.toString(charArray));
        System.out.println(Arrays.toString(boolArray));
        System.out.println();

        //--- Array Indexing ---//
        // Assign values to each index of intArray
        intArray[0] = 10;
        intArray[1] = 20;
        String[] fruits = {"apple", "banana", "cherry", "dragonfruit"};

        // What will the following print?
        System.out.println(fruits[1]);
        System.out.println(fruits[2+2/2]);
        intArray[0] += 5;
        System.out.println(intArray[0]);
    }
}
