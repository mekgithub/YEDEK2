package creatingclasses;

public class CarsTest {
    public static void main(String[] args) {
        Suv mySuv=new Suv();
             mySuv.run();
        System.out.println(mySuv.wheels);
        System.out.println(mySuv);
        Car myCar=new Car();
        System.out.println(myCar.brand);
        myCar.run();
        mySuv.climb();

    }
}
