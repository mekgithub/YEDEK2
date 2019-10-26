package myreviewmethods;

public class OddNumbers {
    static void oddNumbers(int x, int y){
        for(int i=Math.min(x,y) ; i<=Math.max(x,y) ; i++){
            if(i%2!=0){
                System.out.println(i);
            }

        }

    }

    public static void main(String[] args) {
        OddNumbers.oddNumbers(3,50);
    }
}
