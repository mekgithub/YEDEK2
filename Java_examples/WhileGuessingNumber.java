import java.util.Scanner;

public class WhileGuessingNumber {

        public static void main(String[] args) {

            int numberToGuess = 101;
            Scanner numberInput = new Scanner(System.in);
            System.out.print("Guess? : ");

            boolean guess= true;
            while(guess) {
                int userNumber = numberInput.nextInt();
                if (userNumber == numberToGuess) {
                    System.out.println("CONGRATS!!!");
                    guess=false;
                } else if (userNumber > numberToGuess) {
                    System.out.println("Larger. Try again");
                } else {
                    System.out.println("Smaller. Try again");
                }
                //start++;
            }
        }
}
