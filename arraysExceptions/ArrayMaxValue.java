package arraysExceptions;

public class ArrayMaxValue {
    public static void main(String[] args) {
        int [] myArr={1,2,3,4,5,6,7,8,9,10,-4};
        int max = findMaxValue(myArr);
        int min= findMinValue(myArr);
        System.out.println("your min value is " +min);
        System.out.println("your max value is " +max);
    }
    public static int findMaxValue(int [] arr){
        int container = arr[0];
        for(int i=1; i<arr.length ; i++){
            if(arr[i]>container){
                container=arr[i];

            }
        }
        return container;
    }
    public static int findMinValue(int [] arr2){
        int container= arr2[0];
        for (int i=1; i<arr2.length; i++){

            if(arr2[i]<container){
                container=arr2[i];
            }
        }
        return container;

    }
 /*   public static int smymetricValue(int [] arr3){
        int container=arr3[0];
        int count=arr3.length/2;
        for(int i=0; i<arr3.length; i++){
            for(int j=0; j<count; ){
                if(arr3[j]=count){

                }

            }


        }
    }*/

}
