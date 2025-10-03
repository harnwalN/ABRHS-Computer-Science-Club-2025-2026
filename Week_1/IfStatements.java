package Week_1;

public class IfStatements {
    public static void main(String[] args) {
        if (true) {
            System.out.println("This will always print.");
        } else {
            System.out.println("This will never print.");
        }

        if (false) {
            System.out.println("This will never print.");
        } else if (true) {
            System.out.println("This will always print.");
        } else {
            System.out.println("This will never print.");
        }
    }
}
