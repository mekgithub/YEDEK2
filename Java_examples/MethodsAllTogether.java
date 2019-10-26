public class MethodsAllTogether {
    static int balance = 1000;
    public static void main(String[] args) {
        MethodsAllTogether.printNumbers();
    }
    static void printNumbers(){//printNumbers is name of method// stataic and void s keyword
        int start=1;
        while (start<=100){
            System.out.println(start);
            start++;

        }
    }
    public static void printMultiplicationTABLE(){
        for(int i=1;i<11;i++){
            for(int j=1;j<=10; j++){
                System.out.println(i+"X"+j+ "=" + i*j);

            }
        }
    }
    public  void printOddNumbers(int start,int stop){
        if(start<=stop){
            int number=start;
            do{
                if(number%2==1){
                    System.out.println(number);
                }

                number++;
            }while (number<stop);
        }
        else{
            System.out.println("Start shoold be smallaer than stop");
        }
    }
    public static void addNumbers(int a,int b){
        System.out.println(a+b);
    }
    public static int addNumbersReturn (int num1,int num2){
        int addition =num1+ num2;
        return addition;
    }
}
