package creatingclasses;

import java.awt.*;

public class ShapesTest {
    public static void main(String[] args) {
        Shapes myShape= new Shapes();
       // System.out.println(myShape.symbol);
        myShape.printPyramid();
        Shapes myShape2=new Shapes('@', 15,20 );
        myShape2.printPyramid();
        myShape2.printRectangle();
        Shapes myShape3 = new Shapes('$',25, 16);
        myShape3.printRectangle();
        myShape.printRectangle();
    }
}
