public class displayPyramid {
    public static void main(String[] args) {
        for(int i=1;i<11 ;i++){
            for(int j=11;j>i ;j--){
                System.out.print(" ");

            }
            for(int k=11;k<=2*i-1;k++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
