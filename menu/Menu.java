package menu;
import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Display.displayMenu();
        Scanner ask = new Scanner(System.in);

        System.out.print("SOUP? (1-2-3)");
        int soup = ask.nextInt();

        System.out.print("MEAL? (1-2-3)");
        int meal = ask.nextInt();

        System.out.print("SALAD? (1-2)");
        int salad =ask.nextInt();

        Display.displayReceipt(soup,meal,salad);



    }
}
