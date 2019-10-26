
package creatingclasses;

public class RoadBike extends BicycleParent {
    public int tireSize;                   // atrrubutes
    public String handleBar;

    public RoadBike (int gear, int speed, int tireSize, String handleBar){         //constarcatror with 4 paramtres
        super(gear,speed);                     //that means that part class 2 paramter contrsactor
        this.tireSize = tireSize;
        this.handleBar = handleBar;
    }

    public void changeTireSize(int newTire){
        this.tireSize = newTire;
    }

    public String toString(){
        return (super.toString()+
                "tire size "+ this.tireSize + " handle bar " +this.handleBar);
    }
}
