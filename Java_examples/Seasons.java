public class Seasons {
    public static void main(String[] args){
        int degree = 1281654155;
        if(degree<=20){
            System.out.println("Winter");
        }
        else if (degree > 20 && degree <= 40 ){
            System.out.println("Fall");
        }
        else if (degree>40 && degree <= 60){
            System.out.println("Spring");
        }
        else {
            System.out.println("Summer");
        }

    }
}
