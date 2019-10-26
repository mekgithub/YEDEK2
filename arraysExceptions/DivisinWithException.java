package arraysExceptions;

public class DivisinWithException {
    public static void main(String[] args) {
        System.out.println(divideTwoNumbers(3,0));
    }
    public static double divideTwoNumbers(int num1, int num2){
        double result=0;
        try {
            result=num1/num2;
        }
        catch (RuntimeException e){
            System.out.println("Division by zero is not possible please try again");

        }
        return  result;
    }
}
