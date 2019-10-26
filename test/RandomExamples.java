/*
Create a 6-digits password using random method​

Sample passwords:​

123456​

999999​

100000​

468931​
 */


package test;

public class RandomExamples {
    //Solution with producing 6 digits number using range approach
    public static int createRandomPassword(){
        double randomNumber = Math.random()*(1000000-100000) + 100000;
        int result = (int) randomNumber;
        return result;
    }
    //Solution wirth String and concat
    public static String createRandomPassString(){
        String password =""; //String container created
        double rand; //variable for random number
        for(int i=1 ; i<7 ; i++){ // to create 6 iterations
            rand = Math.random()*10; // produce random number 0-9
            int randInt = (int) rand; //type casting double to int
            password = password + randInt; //concat
        }
        return password;
    }
}
