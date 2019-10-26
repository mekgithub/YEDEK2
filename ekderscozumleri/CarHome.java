package ekderscozumleri;

public class CarHome {
    int modelYear;
    String carModel;

    public CarHome(int year,String model){
        modelYear=year;
        carModel=model;


    }

    public static void main(String[] args) {
        CarHome myObj=new CarHome(1969,"Mustang");
        System.out.println(myObj.modelYear+"  "+myObj.carModel);
    }


}
