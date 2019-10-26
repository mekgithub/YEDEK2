public class WhileUpsideDownTriangle {
    public static void main(String[] args) {
        int outer = 1;
        int limitInner=6;
        while(outer<6){
            int spaces=1;
            while (spaces<outer){
                System.out.print("  ");
                spaces++;
            }

            int inner = 1;
            while(inner<limitInner) {
                System.out.print("* ");
                inner++;
            }
            limitInner--;
            System.out.println();
            outer++;
        }
    }
}
