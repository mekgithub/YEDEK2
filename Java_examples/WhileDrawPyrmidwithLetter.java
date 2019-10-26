public class WhileDrawPyrmidwithLetter {
    public static void main(String[] args) {
        char letter='A';
        for(int i=1; i<=5; i++){
           System.out.println(letter);
           letter++;
            for(int j=1; j<=i; j++){
                System.out.print(letter);
                letter++;
            }
        }
        letter++;
        System.out.println();
    }
}
//System.out.println("Letters for loop");
//            char c = 'A';
//            for (int a = 1; a <= 5; a++) {
//                for (int b = 1; b <= a; b++) {
//                    System.out.print(c);
//                }
//                c++;
//                System.out.println();