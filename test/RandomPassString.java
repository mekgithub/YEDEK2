/*
Create a 6-characters password using random method​
Password consist of lower case letters​
Sample passwords:​
abcdef​
aaappp​
qqqqq
 */
package test;

public class RandomPassString {
    public static String createRandomStringPass(){
        String password = ""; // Empty container
        double rand; //to store random double value
        int randInt; // to store double to int value
        char randChar; // to store int to char conversion value
        for(int i=6 ; i>=1 ; i--){
            rand = Math.random()*(122-97)+97; //producing random number in range 97-122
            randInt = (int) rand; // double to integer type casting
            randChar = (char) randInt; // integer to char type casting (conversion)
            password = password + randChar; // for concat

        }
        return password;
    }
}
