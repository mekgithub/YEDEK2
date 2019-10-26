package test;
import java.util.Scanner;
public class ShapesTest {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print(" number of lines");
        int linesPyramid= scanner.nextInt();
        System.out.print("Symbol of the Pyramid");
        String symbolPyramid=scanner.next();
        Shapes.printPyramid(linesPyramid,symbolPyramid);
        //Shapes.printUpSideDownPyramid();
    }
}

/* public static void sum(int num1,int num2) {
        int result=num1+num2;
        System.out.println(num1+ "+" + num2+ "="+ result);

    }

    public static void substruction( int num1, int num2) {
        int result=num1-num2;
        System.out.println(num1+"-"+num2+"="+result);

    }

    public static void multiplied(int num1,int num2) {
        int result=num1*num2;
        System.out.println(num1+"*"+num2+"="+result);

    }

    public static void divide(int num1,int num2) {
        int result=num1/num2;
        System.out.println(num1+"/"+num2+"="+ result);

    }

    public static void main(String[] args) {
        System.out.println("sum");
        sum(5,6);
        System.out.println("subtruction");
        substruction(10,2);
        System.out.println("multiplied");
        multiplied(10,2);
        System.out.println("divide");
        divide(20,4);

    }
    */
