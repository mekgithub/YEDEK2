public class WhilePrntTable {
    public static void main(String[] args) {
        for(int i=1; i<5; i++){
            System.out.print(i);
            char letter='a';
            for(int j=1; j<4; j++ ){
                System.out.print(letter);
                letter++;
            }
            System.out.println();

            }
        }

    }




// for(int i=1 ; i <= 10 ;i++){                           //
//            for(int j=1 ; j<11 ; j++){
//                if(j<=i) {
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//for(int k=1 ; k<10 ; k++){
//            System.out.printf("%5d",k);
//        }
//        System.out.println();
//        System.out.println("-------------------------------------------------");
//        for(int i=1 ; i<10 ; i++) {
//            System.out.print(i + "|");
//            for (int j=1 ; j<=9 ; j++) {
//                System.out.printf("%5d",i*j);