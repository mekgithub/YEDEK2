public class AgeExample {
    public static void main(String[]args) {
        int ageToCheck = 1120;
        if(ageToCheck < 0){
            System.out.println("Age can not be negative");
        }
        else if (ageToCheck >= 120){
            System.out.println("Age can not be larger than 120");
        }
        else {
            System.out.println("OK");
        }
    }
}
