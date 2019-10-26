package myreviewmethods;

public class ConsecutiveWords {
    public static void main(String[] args) {
        System.out.println( ConsecutiveWords.conseWords("aaabbbccd"));

    }
    public static String conseWords(String word){
        int next=1;
        String removed="";
        for(int i=0; i<word.length() ; i++){
            if(word.charAt(i)!=word.charAt(next)){
                removed=removed+word.charAt(i);
            }
            if(next<word.length()-1) {
                next++;
            }
        }
        removed=removed+word.charAt(word.length()-1);

        return  removed;
    }

}
