package Week_2;

import java.util.*;

public class ArrayListIntro {
    public static void main(String[] args) {
        // Initialization
        ArrayList<Integer> myList = new ArrayList<>();

        // Adding elements to the end
        myList.add(5); //  [5]
        myList.add(23); // [5, 23]
        myList.add(17); // [5, 23, 17]

        // Adding element at specific index
        myList.add(1, 21); // [5, 21, 23, 17]

        // Printing the ArrayList
        System.out.println(myList);

        // Accessing elements
        System.out.println(myList.get(2)); // 23

        // Removing elements by index
        myList.remove(2); // [5, 21, 17]

        System.out.println(myList);
    }
}