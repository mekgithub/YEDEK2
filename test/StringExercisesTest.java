package test;
import java.util.Scanner;
public class StringExercisesTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the String");
        String inputString=scanner.next();
        StringExercises.writeTopToBottom(inputString);

        StringExercises.writeBackward("abc");
        String input= "abcde";
        String start="";
        for(int i=input.length()-1; i>=0 ; i--){
            start= start+input.charAt(i);
            System.out.println(start);
        }
    }
}
