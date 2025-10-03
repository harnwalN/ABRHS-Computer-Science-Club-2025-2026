package Week_1.SquirrelPlay;
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
public class SquirrelPlayTemplate {
    public static void main (String[] args) {
        System.out.println(squirrelPlay(80, false) == true);
        System.out.println(squirrelPlay(95, false) == false);
        System.out.println(squirrelPlay(95, true) == true);
    }

    public static boolean squirrelPlay(int temp, boolean isSummer) {
        return false;
    }
}