package creatingclasses;

public class Suv extends Car {
      int wheels;
      Suv(){                        //Cons without param
          this.wheels=6;            //this fromcurrent class
      }
      public void climb(){
          System.out.println("I can climb teh mountain");
      }

}
