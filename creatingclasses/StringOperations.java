package creatingclasses;

public class StringOperations {
    String str;
    public StringOperations(){
        this.str="Hello";
    }
    public StringOperations(String str){
        this.str=str;
    }
    public String reversed(){
        String reversedAttribute="";
        for(int i=this.str.length()-1;i>=0; i--){
            reversedAttribute=reversedAttribute+this.str.charAt(i);

        }
        return reversedAttribute;
    }
    public String reversed(String toBeReversed){
        String reversedStr="";
        for(int i=toBeReversed.length()-1; i>=0; i--){

        }
        return reversedStr;
    }
    public String makeOnlyFirstLetterUpper(){
        String strUpperFirst="";//empty string to concat.
        strUpperFirst=this.str.toLowerCase();//
        char firstLetter=this.str.charAt(0);
        strUpperFirst = strUpperFirst+firstLetter;
       String allLowerCase=this.str.toLowerCase();
       for(int i=1; i<allLowerCase.length(); i++)
           strUpperFirst = strUpperFirst + allLowerCase.charAt(i);


        return strUpperFirst;
    }

}
