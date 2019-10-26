package creatingclasses;

public class Calculator {
    int displayValue;                                  // this is attribute
    public Calculator(){                              // consytractor
        this.displayValue=0;

    }
    public int add(int number1,int number2){              //bu ve alttaki OVERLOADING
        return number1+number2;
    }
    public int add(double num1,double num2){
        return (int) (num1+num2);
    }
    public double divide(int num1,int num2){
        double result=0;                                // BU BOLUM EXCEPTION
        try{
            result=num1+num2;
        }
        catch (ArithmeticException e){

        }
        return result;
    }
    public int subtract(int num1,int num2){    // BU BOLUM METOTLAR/
        return  num1-num2;
    }
    public  int multiply(int num1,int num2){
        return num1*num2;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "displayValue=" + displayValue +
                '}';
    }
}
