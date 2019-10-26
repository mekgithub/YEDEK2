package abstractionandinterface;

import jdk.swing.interop.SwingInterOpUtils;

public class DemoGenericTest {
    public static void main(String[] args) {
        DemoGeneric<Integer> myGen = new DemoGeneric<Integer>();
        myGen.setFirst(10);
        System.out.println(myGen.getFirst());
    }
}