package test;

public class Password {
    public static String passwordCheck(String password){
         String answer="";
        if(password.length()>=6){
            System.out.println("Password is OK");

        }
        else{
            System.out.println(" Password shoud be at least 6 character");
        }
        return answer ;
    }

    public static void main(String[] args) {
        passwordCheck("abcdef");
    }
}
