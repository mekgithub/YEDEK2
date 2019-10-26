package creatingclasses;

public class ArraysTest {
    public static void main(String[] args) {
        Arrays myArr=new Arrays();
        int [] paramArray={10,20,30,40,50,60,70,80,90,190,3};
        System.out.println(myArr.returnIndex(paramArray,50));// eleman 50 in indexi kac onu outputta gorecegiz

        StatArrays myStat=new StatArrays();
        System.out.println(myStat.returnAvarage(paramArray));
        System.out.println();
    }
}
// asagidaki sonucta 4 cikiyor bu elemet 5 in indexidir