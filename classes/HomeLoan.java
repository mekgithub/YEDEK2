package classes;

public class HomeLoan extends Loan {
   private int PMI;

    public HomeLoan(double interestRate, int numberOfPayment, double amount, int PMI) {
        super(interestRate, numberOfPayment, amount);
        this.PMI = PMI;
    }
    @Override
    double calculateMonthlyPayment(){
        return super.amount*super.interestRate/super.numberOfPayment+this.PMI;
    }
    @Override
    double calculateTotalPayment(){
        return super.amount*super.interestRate+this.PMI*super.numberOfPayment;

    }
}
