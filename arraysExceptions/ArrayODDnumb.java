package arraysExceptions;

import java.util.Scanner;

public class ArrayODDnumb {
    public static void main(String[] args) {
        int[] myNumbers={1,123,12343,12479,51246,637,711,820,900,1113};
       int counter=0; // to count number of odd numbers
      for(int i=0;i<myNumbers.length; i++){
          if(myNumbers[i]%2!=0){// Check is it ODD?
              counter=counter+1;
          }
       }
        System.out.println(counter);


        //Ask user;
        Scanner scanner=new Scanner(System.in);
        int [] myArray=new int[5];

       for(int i=0; i< myArray.length ; i++){
        System.out.println("enter nuber:");
        myArray[i]= scanner.nextInt();
       }
        //System.out.println(myArray);

       int numberofodds=0;
       for(int i=0; i<myArray.length ; i++){
           if(myArray[i]%2==1){
               numberofodds++;

           }

       }
        System.out.println("There are " +numberofodds + "  odd numbers in your numbers");

    }


}
