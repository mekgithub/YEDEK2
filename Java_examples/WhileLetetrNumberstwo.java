public class WhileLetetrNumberstwo {
    public static void main(String[] args) {
        //character declaration
        char letter = 'a';

        for(int i=1 ; i<6 ; i++){
            System.out.printf("%2d | ",i); // printing numbers
            int count=1; //while loop counter initialization
            while(count<5){
                System.out.printf("%3s",letter); //printing letters
                count++; //while increment
                letter++; // char increment
                //System.out.print(" "+(int)letter);
            }
            System.out.println();
        }
    }
}

