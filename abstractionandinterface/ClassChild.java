package abstractionandinterface;

import jdk.swing.interop.SwingInterOpUtils;

public class ClassChild implements InterfaceA,InterfaceB {
    public void methodA(){
        System.out.println("This is form Interfac A");
    }
    public void methodB(){
        System.out.println("This is interface B");
    }
}
