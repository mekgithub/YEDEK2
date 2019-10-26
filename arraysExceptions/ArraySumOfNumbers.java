package arraysExceptions;

public class ArraySumOfNumbers {
    public static void main(String[] args) {
        int []myNumbers={1,2,3,4,5,6,7,8};
        int total=0;
        for(int i=0; i<myNumbers.length; i++){
            System.out.println();
            total = total +myNumbers[i];

        }
        System.out.println(total);
    }

}
