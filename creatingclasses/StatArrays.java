package creatingclasses;
//Create StatArrays class according to requirements listed below and use alla features of the Arrays class;
//.Extra Methods; a) Average of tehe array b)Min value of the int array c) Max value of the array/

public class StatArrays extends Arrays {
    public double returnAvarage(int[] array){
        int sum=0;
        double average=0;
        for(int i=0; i<array.length; i++){
            sum=sum+array[i];
        }
        average=sum/array.length;
        return average;
    }
    public int returnMax(int [] array){
        int max=array[0];
        for(int i=0; i<array.length; i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }
    public int returnMin(int []array){
        int min=array[0];
        for(int i=0;i<array.length; i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;
    }
}
