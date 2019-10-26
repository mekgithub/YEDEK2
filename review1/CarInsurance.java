/*
Write a class for car insurance according to requirements below​
Properties​
Model year (private)​
Number of tickets (private)​
Number of accidents(private)​
Price offer ​
Base price (final)​
Constructors​
With all parameters​
Methods​
MakeOffer​
Base price + (current year - model year) * 50 + (30 * number of tickets) + (100* number of accidents)
 */
package review1;

public class CarInsurance {//they are global variables
    int modelYear;
     int tickets;
     int accidents;
    double offerPrice;
    final double basePrice=199.99;

    public CarInsurance(int modelYear, int tickets, int accidents,double offerPrice){//in de paranatez they are local varialbles
        this.modelYear = modelYear;
        this.tickets = tickets;
        this.accidents = accidents;
        this.offerPrice = offerPrice;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    public int getAccidents() {
        return accidents;
    }

    public void setAccidents(int accidents) {
        if(accidents>0) {
            this.accidents = accidents;
        }
        else {
            System.out.println("I believe you entered  negative value accidently!!");
        }
    }

    public double getOfferPrice() {
        return offerPrice;
    }

    public void setOfferPrice(double offerPrice) {
        this.offerPrice = offerPrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void makeOffer(int currentYear){//if we use static we cannaot use the global variables.so we use thenonstatic..
        double offer = this.basePrice + (currentYear-this.modelYear)*50+(30*this.tickets) + (100*this.accidents);
        System.out.println(offer);
    }
}
