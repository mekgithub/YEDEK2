import java.util.Scanner;
public class StringCompare {
        public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter F or M");
            String gender = scanner.next();
            if(gender.equals("m")){
                System.out.println("Male");
            }
            else {
                System.out.println("Female");
            }
        }
}
