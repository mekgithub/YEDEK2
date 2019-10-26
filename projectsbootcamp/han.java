package projectsbootcamp;
import java.util.Scanner;

public class han {
    public static void main(String[] args){
        String arr[] = {"blue","red","green","yellow"};
        printHangman(arr);
    }

    public static String getWord(String arr[]){
        double random = Math.random()*arr.length;
        String word = arr[(int)random];
        return word;
    }

    public static char userChar(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a lowercase char: ");
        char userChar = input.next().charAt(0);

        return userChar;
    }

    public static void printHangman(String[] arr){
        String word = getWord(arr);
        int totalCounter = 0;
        int[] status = new int[word.length()];
        while (totalCounter != word.length()) {
            char userEntry = userChar();
            for (int i = 0; i < word.length(); i++) {
                if (status[i] == 0 && userEntry == word.charAt(i)) {
                    status[i] = 1;
                    totalCounter++;
                    break;
                }
            }

            for (int j = 0; j < status.length; j++) {
                if (status[j] == 0) {
                    System.out.print("_ ");
                } else if (status[j] == 1) {
                    System.out.print(word.charAt(j));
                }
            }
            System.out.println();
        }
    }

}