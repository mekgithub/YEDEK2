package arraysExceptions;

public class ExceptionArray {
    public static void main(String[] args) {
        int[] myArr={12,122,3223,44557,567,666,8887,789,8,80987,};
        try {
            System.out.println(myArr[5]);
        }
        catch (Exception e){
            System.out.println("you just exceeded the ındex bound,try again");
        }
        for(int number: myArr){
            System.out.println(number);
        }

    }
}
