import java.util.Scanner;
public class NumberGUessingversionthree {

        public static void main(String[] args) {

            int numberToGuess = 101;
            Scanner numberInput = new Scanner(System.in);
            System.out.print("Guess? : ");

            int start =0;
            while(start<4) {
                int userNumber = numberInput.nextInt();
                if (userNumber == numberToGuess) {
                    System.out.println("CONGRATS!!!");
                } else if (userNumber > numberToGuess) {
                    System.out.println("Larger. Try again");
                } else {
                    System.out.println("Smaller. Try again");
                }
                start++;
            }
        }
    }

