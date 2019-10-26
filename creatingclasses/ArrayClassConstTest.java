package creatingclasses;

public class ArrayClassConstTest {
    public static void main(String[] args) {
        ArrayClassConstractor myInstance=new ArrayClassConstractor(); //we will create instance this line
        System.out.println(myInstance.size);
        ArrayClassConstractor myInstance2=new ArrayClassConstractor(20);
       // int[] newArray=myInstance.initalArray();
       // myInstance.printEvenindexes(newArray);
        myInstance.printEvenindexes(myInstance.initalArray());//her zaman içiten start alır.start from nside
        myInstance.printOddindexes(myInstance.initalArray());

    }
}
