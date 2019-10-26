package arraysExceptions;

public class ShippingCalculate {
    public static void main(String[] args) {
        System.out.println(calculateShipping(11.3,14.7,500,"Urgent"));

    }
    public static double calculateShipping(double weight, double volume,double distance, String gonderi){//BUradakilerInput
        double price=0;                         //bu ve asagıdkaıler output ıcın..
        int pointWeight=0;                      //yukarıddaki price  ve buradaki gibi değerleri initiliaz ediyoruz..
        int pointVolume=0;
        if(weight>01 && weight<=5){
            pointWeight=12;
        }
        else if(weight>=6 && weight<=12){
            pointWeight=29;
        }
        else if(weight>=13){
            pointWeight=50;
        }
        else{
            System.out.println("Gecersiz weight");
        }
        //int pontVolume=0; buradad da tanımlayabiliridk,aynı skobun içine oldugu için..
        if(volume>=5 && volume<=10){
            pointVolume=20;
        }
        else if(volume>=11 && volume<=20){
            pointVolume=45;
        }
        else{
            System.out.println("Gecersiz Volume");
        }

        if(gonderi.equals("Urgent")){
            price=((pointWeight*pointVolume)/5)*distance/100;
        }
        else{
            price=((pointWeight*pointVolume)/5)*distance/100;
        }
        return price;
    }
}