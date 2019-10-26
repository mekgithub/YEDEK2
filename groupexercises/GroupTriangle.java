package groupexercises;

public class GroupTriangle {
    public static void main(String[] args) {
        for(int i=1; i<6 ; i++){
            System.out.println(i);
        }
       // System.out.println();
        int numb = 1;
            for (int i = 1; i < 6; i++) {
                for (int j = 1; j <= i; j++) {
                    do {
                    System.out.print(j);
                    numb++;
                }while (numb < i);
            }
                System.out.println();
        }

    }
}

