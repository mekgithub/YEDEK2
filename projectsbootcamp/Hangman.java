package projectsbootcamp;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Hangman {
    public static void main(String[] args) {
        String [] fruits={"Apple","Banana","Grape","Orange"};
        System.out.println(getFruit(fruits));
        System.out.println(getUserChar());
    }
    public static String getFruit(String [] meyve){
       double rand=Math.random()*4;
       String word=meyve[(int)rand];

       return word;
        }
        public static char getUserChar(){
        Scanner inputWord=new Scanner(System.in);
            System.out.println("enter character please");
        char character=inputWord.next().charAt(0);
        return character;
        }
      /*  public static int getCompare(String []arr){
        String rand=getFruit(arr);
        String word=arr[(int)rand]
        for(int i=0;i<=word.length()){

        }*/



}
