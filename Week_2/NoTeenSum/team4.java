package Week_2.NoTeenSum;

public class team4 {
    // return sum a, b, c
    // if a or b or c == "teen" (13-19)
    // --> replace it with 0
    // exception: 15 and 16
    // --> helper function "public int fixTeen(int n)" --> returns real value

    public class NoTeenSumTemplate {
        public static void main (String[] args) {
            System.out.println(noTeenSum(1, 2, 3) == 6);
            System.out.println(noTeenSum(2, 13, 1) == 3);
            System.out.println(noTeenSum(2, 1, 14) == 3);
        }

        public static int noTeenSum(int a, int b, int c) {
            return fixTeen(a) + fixTeen(b) + fixTeen(c);
        }

        public static int fixTeen(int n) {
            if(n >= 13 && n <= 19) {
                if(n != 15 || n != 16) {
                    return 0;
                }
            }

            return n;
        }
    }



}