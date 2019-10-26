package creatingclasses;

public class Paint {
    protected String colorName;
    protected double sqfeet;
    protected double totalprice;


    public  Paint(String colorName,double sqfeet,double price){//CONSTR;eger buraya public yazmasaydik we can only accesss current class olacakti,
        //// yani eger public degil de default olsaydi
        this.colorName=colorName;
        this.totalprice=price;
        this.sqfeet=sqfeet;
    }
    protected void calculatePrice(){
        this.totalprice=sqfeet/100*32.99;

    }
    protected void calculatePrice(double sqfeet){
        this.totalprice=sqfeet;
    }
    public String toString() {
        return "Paint{" +
                "colorName='" + colorName + '\'' +
                ", sqfeet=" + sqfeet +
                ", price= $ " + totalprice +
                '}';
    }
}
