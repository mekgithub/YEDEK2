package classandmethodsexample;

public class Suggestions {
    public static void suggestionFood(){
        double rand=(Math.random())*(3)+1;
     if((int)rand==1){
         System.out.println("Drink Soup");

     }
     else if((int)rand==2){
         System.out.println("Eat Hamburger");

     }
     else{
         System.out.println(" Enjoy Salad");
     }



    }
    public static void suggestCloth(){
        double rand=Math.random()*3+1;
        if((int)rand==1){
            System.out.println("RED SHİRT");

        }
        else if((int)rand==2){
            System.out.println("BLUE JEAN");
        }
        else{
            System.out.println("White Hat");
        }
    }

}
