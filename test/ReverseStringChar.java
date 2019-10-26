package test;

public class ReverseStringChar {
    public static void main(String[] args) {
        String input="North AMERICAN";
        char[] newInput=input.toCharArray();
        for(int i=newInput.length-1; i>=0; i--){
            System.out.print(newInput[i]);

        }

    }
}