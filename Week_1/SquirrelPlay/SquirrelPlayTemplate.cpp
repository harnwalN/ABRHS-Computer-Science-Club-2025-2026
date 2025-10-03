#include <iostream>
using namespace std;

/*
 * Coding Bat Logic-1: Squirrel Play
 * https://codingbat.com/prob/p141061
 * 
 * The squirrels in Palo Alto spend most of the day playing.
 * In particular, they play if the temperature is between 60 and 90 (inclusive).
 * Unless it is summer! Then the upper limit is 100 instead of 90.
 * 
 * Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise
 */



// Template Code:
bool squirrelPlay(int temp, bool isSummer) {
    return false;
}

int main() {
    cout << (squirrelPlay(80, false) == true) << endl;
    cout << (squirrelPlay(95, false) == false) << endl;
    cout << (squirrelPlay(95, true) == true) << endl;
    return 0;
}
