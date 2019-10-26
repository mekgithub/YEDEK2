/*
Create a 6-characters password using random method​

Password properties:​

First 3 characters  is letter (lower case)​

Last 3 character is numbers​

Sample passwords : ​

asd123​

xyz569​

​
 */
package test;

public class PasswordNumbersLetters {
    public static String createPasswordNumsLetters(){
        String password = "";
        double rand;
        //for first 3 characters. Letters
        for(int i=1 ; i<4 ; i++){
            rand = Math.random()*(122-65)+65; //to produce random number in range 65-122
            password = password + (char)rand;
        }
        //for last 3 characters. Numbers
        for (int j=1 ; j<4 ; j++) {
            rand = Math.random()*10;
            password = password + (int)rand;
        }

        return password;
    }
}
