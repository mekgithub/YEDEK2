package myreviewmethods;

public class BakwardString {
    public static void main(String[] args) {
        BakwardString.backString("1234");
    }
    public static void backString(String word){
        for(int i=word.length()-1 ; i>=0 ; i--){
            System.out.print(word.charAt(i));
        }

    }
}
