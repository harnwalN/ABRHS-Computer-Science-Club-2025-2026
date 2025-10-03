package Week_2.NoTeenSum;
/*
 * Coding Bat Logic-2: No Teem Sum
 * https://codingbat.com/prob/p182879
 * 
 * Given 3 int values, a b c, return their sum.
 * However, if any of the values is a teen -- in the range [13, 19] -- then the number is evaluated as 0
 * 15 and 16 are an exception - they don’t count as teens
 * Utilize a separate helper "public int fixTeen(int n) that takes in an int value and returns int n’s true value as evaluated by the teen rule.
 */



// Template Code:
public class NoTeenSumTemplate {
    public static void main (String[] args) {
        System.out.println(noTeenSum(1, 2, 3) == 6);
        System.out.println(noTeenSum(2, 13, 1) == 3);
        System.out.println(noTeenSum(2, 1, 14) == 3);
    }

    public static int noTeenSum(int a, int b, int c) {
        return 0;
    }

    public static int fixTeen(int n) {
        return 0;
    }
}