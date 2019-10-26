package arraysExceptions;

public class ArrayRandom {
    public static void main(String[] args) {
        int[] arr = new int[20];
        double randomNumber;
        for(int i=0 ; i<arr.length ; i++){
            randomNumber = Math.random()*(4000)+1000;
            arr[i] = (int) randomNumber;
            System.out.println(arr[i]);//buraya bunu ben koydum hocanın aşağıda yazdıklarını kapattım.aşağıdaki for lara gerek varmı?
        }

       /* for(int i=0 ; i<arr.length ; i++){
            System.out.println(arr[i]);
        }*/
       /* MyArrayMethods.listAllElement(arr);
        int[] returnedArray= ArrayRandomMethod.createArrayRandomIntegers(100);
        MyArrayMethods.listAllElement(returnedArray);*/
    }
}
