public class ForHourGlassNumbers {
    public static void main(String[] args) {
        for(int i=1; i<8;i++){
            //Spaces
            for(int j=1;j<i; j++){
                System.out.print("-");
            }
            //Numbers
            for(int k=i; k<8; k++){
                System.out.print(" "+k);//Because between numbers have a space.
            }
            System.out.println();
        }
        for(int i=1; i<7; i++){
            for(int j=7; j>i;j--){
                System.out.print("-");
            }//numbers
            for(int k=7-i;k<8;k++){
                System.out.print(k+ " ");

            }
            System.out.println();
        }
    }
}
