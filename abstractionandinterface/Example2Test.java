package abstractionandinterface;

public class Example2Test {
    public static void main(String[] args) {
        Example2<Integer> myExample = new Example2<>(1,2,2);
        System.out.println(myExample.findEqual());
    }
}
