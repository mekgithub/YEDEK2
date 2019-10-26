package test;

public class StringReverse {
    public static String isPalindrome(String word){
        String answer="";
        String reverseWord= "";
        for(int i=word.length()-1 ; i>=0 ; i--){
            reverseWord=reverseWord + word.charAt(i);
        }
        if(reverseWord.equals(word)){
            answer ="Yes palindrome";
        }
        else{
            answer= "No not a palindrome";
        }
        return answer;
        //This method returns reversed (backward) version of te original String
    }
    public static String reverseTheString(String inputString){
        String reversed="";
        for(int i=inputString.length()-1 ; i>=0 ; i--){
            reversed= reversed + inputString.charAt(i);

        }
        return reversed;
    }
}
