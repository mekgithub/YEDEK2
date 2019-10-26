package arraysExceptions;

public class ArrayAndMathException {
    public static void main(String[] args) {
        int [] myArr={1,2,3,4,5,6};
        try {
            myArr[9]=5/0;
            }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index exceeded");
        }
    }
}
