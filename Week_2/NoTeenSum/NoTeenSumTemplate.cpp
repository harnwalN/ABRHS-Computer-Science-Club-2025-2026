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
#include <iostream>
using namespace std;

int fixTeen(int n) {
    return 0;;
}

int noTeenSum(int a, int b, int c) {
    return 0;
}

int main() {
    cout << (noTeenSum(1, 2, 3) == 6) << endl;
    cout << (noTeenSum(2, 13, 1) == 3) << endl;
    cout << (noTeenSum(2, 1, 14) == 3) << endl;
    return 0;
}