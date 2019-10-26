package myreviewmethods;

public class WriteaSTRING {
    public static void main(String[] args) {
        WriteaSTRING.writeString("NABARLO");

    }
    public static String writeString(String word){
        for(int i=0; i<=word.length() ; i++) {
            System.out.println(word.charAt(i));
        }
        System.out.println();
        return word;
    }
}
