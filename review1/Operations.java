package review1;

public class Operations {
    public static void main(String[] args) {
        System.out.println("hele qurban ahanda sonuc be yav: " +doCalculate(10,0,"divide"));

    }
    public static int doCalculate(int x,int y, String operation){
        int calculate=0;
        if(operation.equals("add")){
            calculate=x+y;
        }
        else if (operation.equals("divide")){
            try {
                calculate = x / y;
            }
            catch (ArithmeticException e){
                System.out.println("division zero");
            }
        }
        else if (operation.equals("multiplied")){
            calculate=x*y;
        }
        else{
            calculate=x-y;
        }
        return calculate;
}
}
