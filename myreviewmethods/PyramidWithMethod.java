package myreviewmethods;

public class PyramidWithMethod {
    public static void main(String[] args) {
        PyramidWithMethod.printPyramid();

    }
    public static void printPyramid(){
        for(int i=1 ; i<11 ; i++){
            for(int j=11; j>i ; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lines
        for(int i=1; i<11 ; i++){
            //spaces
            for(int j=1; j>i ; j++){
                System.out.print(" ");
            }
            for(int k=11; k>i ; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
