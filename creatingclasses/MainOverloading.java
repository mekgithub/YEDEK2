package creatingclasses;

public class MainOverloading {
    public static void main(String[] args) {
       //System.out.println("Here Original main");
        main("hello");
       // main("1","2");
    }
    public static void main(String parameter1) {
        System.out.println("Main with 1 String parameter   " + parameter1);
      //  main("param 1","param 2");

    }

    public static void main(String parameter1,String parameter2) {
        System.out.println("Main with 2 String parameteres  "+ parameter1+parameter2);
    }

}
