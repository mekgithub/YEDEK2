public class WhileDrawNumberPyramid {
    public static void main(String[] args) {
        int q=1;
        for(int i=1; i<=5; i++){
            System.out.println(q);
            q++;
            for(int j=1; j<i;j++){
                System.out.print(q);
                q++;

            }
            q++;
            System.out.println();
        }
    }
}
//  char letter='A';
//        for(int i=1; i<=5; i++){
//           System.out.println(letter);
//           letter++;
//            for(int j=1; j<=i; j++){
//                System.out.print(letter);
//                letter++;
//            }
//        }
//        letter++;
//        System.out.println();
//    }
//}