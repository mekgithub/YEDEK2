public class ForDiamondSTARS {
    public static void main(String[]main){
        int limitSpaces =11;
        int limitStars = 1;
        for(int i=1 ; i<11 ; i++){
            for(int j=1 ; j<limitSpaces ; j++ ){
                System.out.print("S ");
            }
            for(int k=1 ; k<=limitStars ; k++){
                System.out.print("* ");
            }
            System.out.println();
            limitSpaces--;
            limitStars = limitStars +2;
        }
    }
}
