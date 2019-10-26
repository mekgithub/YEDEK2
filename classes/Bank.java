package classes;

public class Bank {

    private int accountNumber;
    private String accountName;
    private double balance;

    public Bank(int accountNumber, String accountName, double balance){
        this.accountNumber=accountNumber;
        this.accountName=accountName;
        this.balance=balance;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accountNumber=" + accountNumber +
                ", accountName='" + accountName + '\'' +
                ", balance=" + balance +
                '}';
    }
    void addMoney(double amount){
        this.balance=this.balance+amount;
    }
    void drawMoney(double amount){
        this.balance=this.balance-amount;
    }
    void changeAccountNme(String newName){
        this.accountName=newName;
    }
    double showCurrentBalance(){
        return  this.balance;
    }
}

