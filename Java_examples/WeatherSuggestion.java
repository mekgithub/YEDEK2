import java.util.Scanner;
public class WeatherSuggestion {


        public static void  main(String[]args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter temperature : ");
            int degree = scanner.nextInt();
            if(degree > 30){
                System.out.println("Wear Hat");
            }
            else {
                System.out.println("Wear Jacket");
            }

        }
    }

