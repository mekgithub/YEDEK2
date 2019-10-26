package classandmethodsexample;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Invoices invoice= new Invoices();
        System.out.println("what is your electric consumption");
        int consumpt=scan.nextInt();

        String myElectric=invoice.evaluateElectric(800);

        System.out.println("what is your internet speed");
        int speed=scan.nextInt();
        String myInternet=invoice.evaluateIntener(250);

        Loans loan=new Loans();

        System.out.println("your monthly payment?");
        int mothnlyPay=scan.nextInt();
        System.out.println("which payment as month?");
        int month=scan.nextInt();

        System.out.println("Wht id your csr totsl price?");
        int carPrice=scan.nextInt();
        System.out.println("What is your installment quantity?");

        int mortgage=loan.calculateMortgage(15,1800);
        double carinsurance=loan.calculateCarInsurance(50000,72);
        System.out.println(myElectric);
        System.out.println(myInternet);
        Suggestions suggestion=new Suggestions();
        suggestion.suggestionFood();
        Suggestions suggestcloth=new Suggestions();
        suggestion.suggestCloth();








    }
}
