package myreviewmethods;

import java.security.PublicKey;

public class YazBozTahtasi {
    public static void main(String[] args) {
       // YazBozTahtasi.printHelloWorld(10);
        //YazBozTahtasi.addTwoNumbers(5,9);
        //YazBozTahtasi.addTwoNumbers(4,8);
       // YazBozTahtasi.multNumb(8,9);
        //YazBozTahtasi.listASCII();
       // YazBozTahtasi.multTable();
       // YazBozTahtasi.oddNumb(3,58);
        YazBozTahtasi.printMyName(10);
    }
    public static void printHelloWorld(int number){
        for(int i=1; i<number ; i++){
            System.out.println("HELLO");
        }
    }
    public static int addTwoNumbers(int x,int y){
        int z=x-y;
        if(x<y){ System.out.println(Math.abs(z)); }
        else { System.out.println(z); }
        return z;
    }
    public static int multNumb(int x,int y){
        int result=x*y;
        System.out.println(result);
        return result;
    }
    public static void listASCII(){
        for(int i=1; i<255; i++){
            System.out.println((char)i);
        }
    }
    public static void multTable(){

        for(int i=1; i<=10 ; i++){
            for(int j=1 ; j<=10 ; j++){
                System.out.print("  "+ i +  " x" + j+"="+ i*j);
            }
            System.out.println();
        }
    }
    public static void oddNumb(int x, int y){
        for(int i=Math.min(x, y); i<Math.max(x,y); i++){
            if(i%2!=0){
                System.out.print(i+",");
            }
        }
    }
    public static void printMyName(int x){
        for(int i=1; i<=x ; i++)
            System.out.println("Mehmet");
    }



    
}
