package creatingclasses;

public class AdvancedCalculator extends Calculator {
    public String screenColor; // attrribute
    public AdvancedCalculator(){ // Constr
        super.displayValue=0;
        this.screenColor="blue";

    }
    public AdvancedCalculator(String color){
        super();
        this.screenColor=color;
    }
    public double calcAverage(int a,int b){
        super.displayValue=(a+b)/2;
        return displayValue;
    }
    public int calcFactorial(int number){
        int result=1;
        for(int i=number;i>0 ; i--){
            result=result*i;
        }
        return result;
    }
    public  double squareroot(double number){
        return Math.sqrt(number);
    }
    public double power(double number,int pow){
        return Math.pow(number,pow);
    }
    public String toString(){
        return super.displayValue + this.screenColor;
        //buradaki super.displayvalue attrubute of parent class dir,his.screecolor ise attribute of current classdir
    }

}
