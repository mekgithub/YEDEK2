package ekderscozumleri;
import java.util.Scanner;
public class duplicateValuesWithScanner {

        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the size of an array:");
            int size = scan.nextInt(); // to fix the length of an array
            int [] arr = new int [size]; // to fill an array with integers
            for(int k = 0; k<arr.length;k++){
                System.out.println("Enter the elements of an array:");
                arr[k] = scan.nextInt();
            }
            //int [] arr={2,6,4,3,2,8,6,4,9,8};
            for(int i = 0; i < arr.length; i++){
                for(int j=i+1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.println(arr[j]);
                    }
                }
            }
}
}
