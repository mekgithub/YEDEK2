package computer;

public  abstract class Mobiles {
    public abstract void turnWifiOn();
    public abstract void turnWifiOf();

    public void hookUpBlueTooth(){
        System.out.println("Bluetooth hooked up");
    }
}
