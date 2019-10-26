package creatingclasses;

public class OverloadMethod {
    public static void main(String[] args) {
        printString();
        printString("I love java");
        printString("java",20);

    }
    public static void printString(){
        for(int i=1; i<=100 ; i++){
            System.out.println(i + "Hello world");
    }

    }
    public static void printString(String str){
        for(int i=1; i<100 ; i++){
            System.out.println(str);
        }

    }
    public static void printString(String str,int num){
        for(int i=1; i<=num ; i++){
            System.out.println(str);

    }
    }

}
