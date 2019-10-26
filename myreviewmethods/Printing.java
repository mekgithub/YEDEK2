package myreviewmethods;

public class Printing {
    public static void listASCII() {
        for (int i = 0; i <= 255 ; i++) {
            System.out.print((char) i);
            if (i % 32 == 0) {
                System.out.println(i);
            }
        }
    }
    public static void prinMYName(String name){
        for(int i=1;i<10; i++){
            System.out.println(name);
        }
    }
    public static void printOneToHundred(int x){
        for(int i=1;i<10; i++){
            System.out.println(x);

        }
    }
    public static double calcVolume(int a,int b,int c){
        double volume=a*b*c;
        System.out.println("This cube's volume is: " +volume);
        return volume;
    }
        public static void main (String[]args){
          /*  Printing.listASCII();
            Printing.prinMYName("Mehmet");
            Printing.printOneToHundred(100);*/
            System.out.println( Printing.calcVolume(3,5,6));
        }
}
