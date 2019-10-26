/*
For any String variable split all words and return as String Array
sample:
"Java is Fun"
returning Array
String arr[] = {"Java","is","Fun"}
 */
package creatingclasses;

public class StringArray {
    public static void arraysString(String word){
        word = word+" ";
        int count = 0;
        for(int i=0; i < word.length(); i++){
            if(word.charAt(i) == ' '){
                count++;
            }

        }
        //System.out.println(count);
        String[] myArray = new String[count];
        int wordIndex = 0;
        String oneWord ="";
        for(int j = 0; j < word.length();j++){
            if(word.charAt(j) != ' '){
                oneWord=oneWord+word.charAt(j);
            }
            else{
                myArray[wordIndex] =oneWord;
                wordIndex++;
                oneWord="";
            }

        }


        for(String wrd:myArray){
            System.out.println(wrd);
        }

        //return myArray;
    }

    public static void main(String[] args){
        arraysString(" Java  is  Fun");
    }
}
