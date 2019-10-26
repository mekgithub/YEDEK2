package arraysExceptions;

public class arrayHOME {
    public static void main(String[] args) {

        String password = "";
        double rand;

        for(int i=1 ; i<4 ; i++){
            for(int j=1; j<=i ;j++){

            rand =Math.random()*(122-65)+65;
            int randInt=(int) rand;
            password = password + (char)randInt;
            randInt ++;
                    }
       System.out.println(password);

    }
}/*        char letter = 'a';

        for(int i=1 ; i<6 ; i++){
        System.out.printf("%2d | ",i); // printing numbers
        int count=1; //while loop counter initialization
        while(count<5){
            System.out.printf("%3s",letter); //printing letters
            count++; //while increment
            letter++; // char increment
            //System.out.print(" "+(int)letter);
        }
        System.out.println();*/
}