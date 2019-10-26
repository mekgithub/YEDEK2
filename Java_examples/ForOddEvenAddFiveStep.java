import java.util.Scanner;
public class ForOddEvenAddFiveStep {
    public static void main(String[] args) {
        for(int i=0 ; i<101 ; i++){
            if(i%2==1){
                System.out.println("Odd number = "+i);
            }
            else{
                System.out.println("Even number = "+i);
            }
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter start ");
        int start = scanner.nextInt();
        System.out.print("Please enter end ");
        int end = scanner.nextInt();
        System.out.print("Please enter step ");
        int step = scanner.nextInt();
        if(start<end){
            for (int j = start; j <= end; j = j + step) {
                System.out.println(j);
            }
        }
        else {
            System.out.println("start should bu less then end");
        }
    }
}

