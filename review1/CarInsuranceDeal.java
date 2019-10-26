/*
Write a class Insurance Deal and use all features of the Insurance class​
Extra properties​
Discount percentage​
Extra constructor​
All parameters + discount percentage​
Extra Method​
Previous calculation * discount percentage
 */
package review1;

public class CarInsuranceDeal extends CarInsurance{//ilk bunu yazdigimda komple kirmizi alt cizgi oldu,sebebi constr istemesidir.asagda cons tanimlnacak
    double discountPercentage;
    public CarInsuranceDeal(int modelYaer,int tickets,int accidents,double offerPrice, int discountPercentage){
        super(modelYaer,tickets,accidents,offerPrice);
        this.discountPercentage=discountPercentage;
    }
    public void makeDealOffer(int currentYear){
        double offer=(super.basePrice+(currentYear-super.modelYear)*50+(30*super.tickets)+(100*super.accidents))*(this.discountPercentage/100);
        System.out.println(offer);
    }

}