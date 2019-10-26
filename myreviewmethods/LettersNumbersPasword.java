package myreviewmethods;

public class LettersNumbersPasword {
    public static void main(String[] args) {
        //printsASCII();
        //multipTable();
        //oddNumbers(1,33);
        prinPyramid();
    }
    public static void printsASCII() {
        for (int i = 97; i <= 122; i++) {
            System.out.println((char) i);

        }
    }
    public static void multipTable(){
        for(int i=1; i<=10; i++){
            for(int j=1;j<=10; j++){
                int result=i*j;
                System.out.println(i+"x"+j+result);
            }
            System.out.println();
        }
    }
    public static void oddNumbers(int numb1,int numb2){
        for(int i=numb1;i<=numb2; i++) {
            if (i % 2 != 0) {
                System.out.println("numb1 is a odd number:" + i);
            }
        }
    }
    public static void prinPyramid(){
        for(int i=1;i<=10 ; i++){
            for(int j=1; j<=i; j++){
                System.out.println("2*i-1");
            }
            for(int k=)
        }
    }

}
