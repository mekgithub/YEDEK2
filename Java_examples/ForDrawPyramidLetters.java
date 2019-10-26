public class ForDrawPyramidLetters {
    public static void main(String[] args) {
        char letter='A';
        for(int i=1;i<=6; i++){
            for(int j=1; j<=i; j++){
                System.out.print(letter);

            }

            for(int k=6; k>i; k--){
                System.out.print(" ");
            }
            letter++;
            System.out.println();
        }//

    }

}
//RESULT;
//A
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF

