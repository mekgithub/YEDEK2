package creatingclasses;

public class StringOperationsTest {
    public static void main(String[] args) {
        StringOperations myStrNoParam = new StringOperations();
        System.out.println(myStrNoParam.reversed());
        StringOperations myStrParam= new StringOperations("Java");
        System.out.println(myStrParam.reversed());
        System.out.println(myStrNoParam.reversed());
    }
}
