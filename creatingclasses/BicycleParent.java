package creatingclasses;

public class BicycleParent {
    public int gear;//bunlar attributes
    public int speed;

    public  BicycleParent(int gear,int speed){// bu constratcror
        this.gear=gear;
        this.speed=speed;

    }
    public void speedUp(int increase){//meotd1
        this.speed=this.speed+increase;
    }
    public  void slowDown(int decrease){// metod2
        this.speed=this.speed-decrease;

    }
    public String toString(){ // tostring metodu...toStrng metod is mean to see the all atributes of class..
        return("number of gears +" + this.gear+ "\n" + "Bike's speed is" + this.speed);

    }

}
