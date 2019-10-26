package creatingclasses;

public class Modifiers {
    public double balance;//burada public yerine private yazarsak test kımsında erişim yapılamaz.
    Modifiers(){

        this.balance=10.0;
    }
    public  void setBalance(double myBalance){

        this.balance = myBalance;
    }
    public double getBalance(){

        return this.balance;
    }

}
