package myreviewmethods;

public class MethodDesignPasword {
    public static void main(String[] args) {
        MethodDesignPasword.checkinPasword("ABCDEFG");

    }
    public static String checkinPasword(String pasword){

        if(pasword.length()<6){
            System.out.println("Pasword not suitible");

        }
        else{
            System.out.println("pasword is OK");
        }
        return pasword;
    }
}
