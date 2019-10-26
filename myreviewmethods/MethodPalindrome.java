package myreviewmethods;

public class MethodPalindrome {
    public static void main(String[] args) {
       // MethodPalindrome.isPalindrome("kabakli");
       MethodPalindrome.consecutiveWords("aaabbbcc");
      //  MethodPalindrome.letter();

    }
    public static void isPalindrome(String letter){
        for(int i=1; i<letter.length()/2; i++){
           if(letter.charAt(i-1)==letter.charAt(letter.length()/2-i)){
               System.out.println("This is Palindrome");
           }
           else{
               System.out.println("This is not Palindrome");
           }
        }
    }
    public static String consecutiveWords(String word){
        String removed="";
        int next=1;
        for(int i=0; i<word.length() ; i++ ) {
            if(word.charAt(i)!=word.charAt(next)){
                removed=removed+word.charAt(i);
            }
            next++;
        }
        return removed;
    }
    public static void letter(){
        String word="Seattle";
        //System.out.println(word.trim());
        //System.out.println(word.toLowerCase());
       // System.out.println(word.toUpperCase());
      //  System.out.println(word.toString());
    }
}

