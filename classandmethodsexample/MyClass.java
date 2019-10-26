package classandmethodsexample;

public class MyClass {
    public static int counterUpperCase(String input){
        int counter=0;
        for(int i=0; i<input.length(); i ++){
            if(input.charAt(i)>=65 && input.charAt(i)<=90){
               counter ++;
            }
        }
        return counter;
    }


    public static void main(String[] args) {
        int result=counterUpperCase("Bayraminiz Mubarek Olsun Be Ya");
        System.out.println(result);
    }


}
