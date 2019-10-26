package projectsbootcamp;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class AdventureGame {
    public static void main(String[] args) {
        System.out.println("AROUND THE WORLD IN 80 DAYS!");
        System.out.println("are you ready for the most exciting tour of the world, ");
        System.out.println("you can choose the most convenient and cheapest options");
        System.out.println("first please specify days limit for your travel");

        Scanner preference=new Scanner(System.in);
        int start=preference.nextInt();
        System.out.println(start);
        int days=0;
        if(days<20){
            System.out.println("you can choose a continent");
            System.out.println("Africa,Antarctica,Europe,Asia,Avusturia,SouthAmerica");
        }
       else if(days<40 &&  days>20){
            System.out.println("you can choose two continents");
        }
       else{
            System.out.println("hurra!the excitement of the whole world tour begins for you");
        }
        System.out.println("start");

     Scanner vehicle=new Scanner(System.in);
        System.out.println("What kind of vehicle type do you like for travel?");
        System.out.println("Train ?" +"Plane ?" + "4X4 ?"+"Ship ?");
        String vehicleType=vehicle.next();
        System.out.println(vehicleType);
         if(vehicleType.equalsIgnoreCase("Train")){
             System.out.println("your trip cost will be 10000$ please");
         }
         else if(vehicleType.equalsIgnoreCase("Plane")){
             System.out.println("your trip cost will be 30000$");
         }
         else {
             System.out.println("your trip cost will be 20000$");
         }

    }

}
