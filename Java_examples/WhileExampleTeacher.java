import java.util.Scanner;
public class WhileExampleTeacher {
    public static void main(String[] args) {
        Scanner scanner=new Scanner((System.in));

        String answer= "";
        while (!answer.equalsIgnoreCase("Y")){
            System.out.println("You will be a perfect tester (Y/N");
            answer= scanner.next();
        }
    }
}
