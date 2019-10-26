package creatingclasses;

public class ElectricBillTest {
    public static void main(String[] args) {
        ElectricBill myBill= new ElectricBill(12345,0,"Lake Hurton",90.0);
        myBill.displayMemberInfo();
        myBill.getBillAmount();
    }
}
