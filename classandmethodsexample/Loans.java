package classandmethodsexample;

public class Loans {
    public int calculateMortgage(int month, int montlyPayment){
        int result = montlyPayment*(360-month);
        return result;
    }
    public double calculateCarInsurance (int carPrice, int months){
        double insurance= (carPrice/months)*0.9-months;
        return insurance;
    }
}

