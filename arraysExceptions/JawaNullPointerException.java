package arraysExceptions;

public class JawaNullPointerException {
    public static void main(String[] args) {
        printNextLetters(null);//burada nulll yerşne abc yazrsak output bcd olur,ancak null koyunca exceptıon olusur.

    }
    public static void printNextLetters(String input){
         char letter;
         try{
        for(int i=0; i<input.length(); i++){
            letter=input.charAt(i);
            letter++;
            System.out.print(letter);
        }
        }catch (NullPointerException e){
             System.out.println("ı can not do this for null");
         }
        System.out.println("codes contınue");
    }
}
