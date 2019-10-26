/*
Write a Java method to create an integer array with "n" elements and put random numbers between 1000-5000​
Sample​
createRandomIntegerArray(5)​
output: ​
{2455,4978,1007,3255,2823}​
 */

package arraysExceptions;

public class ArrayRandomMethod {
    public static int[] createArrayRandomIntegers(int length){
        int[] arrRandom = new int[length]; //create new array with parameter (parapmeter used for size of the array
        double randomNumber;
        for(int i=0 ; i<arrRandom.length ; i++){
            randomNumber = Math.random()*(5000-1000)+1000;
            arrRandom[i] = (int) randomNumber;
        }
        return arrRandom;
    }
}
