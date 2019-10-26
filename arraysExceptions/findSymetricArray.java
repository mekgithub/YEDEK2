/*
Write a Java method to check whether given array is symmetric or not​
Sample array ​
{1,2,3,3,2,1}​
Output​
Array is symmetric ​
Sample array ​
{1,2,3,4,2,3}​
Output​
Array is not symmetric​
 */
package arraysExceptions;

public class findSymetricArray {
    public static void main(String[] args) {
        int []symArray={1,2,3,3,4,1};
        System.out.println(isSymetric(symArray));
    }
    public static boolean isSymetric (int []arr){
        boolean result=true;
        int index=arr.length-1;
        for(int i=0; i<arr.length/2 ;i++){
            if(arr[i]!=arr[index]){
                result=false;
            }

            index--;

        }
        return result;
    }


}

