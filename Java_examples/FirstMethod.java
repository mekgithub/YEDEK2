public class FirstMethod {
    public static void printHello(int number){
        for(int i=1; i<=number; i++)
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        FirstMethod.printHello(3);
    }
}