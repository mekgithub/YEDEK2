package creatingclasses;

public class Car {
    public String brand;

    Car(){
        this.brand="Ford";
    }
    Car(String brand){

        this.brand=brand;
    }
    public void run(){
        System.out.println("Engine is running");
    }


}
