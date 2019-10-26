package arraysExceptions;
import java.util.Scanner;
public class ArrayExceptionWithMethod {
    public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
        System.out.println("row ındex");
        int row=scan.nextInt();
        System.out.println("column index");
        int column = scan.nextInt();

        System.out.println(giveMeValue(row,column));

        System.out.println("Next Line ın my codes");
    }
    public static String giveMeValue(int rowIndex,int columnIndex){
        String result="";
        int [][] myArray={
                {1,2,3,4,5},
                {3,1,2,3,4,5,6,7,8678,92345,0,10},
                {2,24,5,65,7,68,87,7,9,978,234576,523454,412323,23,32},
                {1234,123456,98765,76543,76543},
        };
        try{
        result = result + myArray[rowIndex][columnIndex];

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ındex bound(s) exceeded");
        }
        return result;
    }

}
