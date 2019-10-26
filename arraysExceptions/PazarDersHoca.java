package arraysExceptions;

public class PazarDersHoca {
    public static void main(String[] args) {
        System.out.println(generatePass());

    }
    public static String generatePass(){
        String password="";
        String [][] myValues={
                {"A","B","C","D","E","F","G"},
                {"a","b","c","d","e","f","g"},
                {"é","+","%","&","!","£","$","½","~~","<","|"},
                {"1","2","3","4","5","6"}
        };
        double rand;
        for(int i=0; i<3; i++){
            rand=Math.random()*7;
            password=password+myValues[0][(int)rand];

        }
        for(int i=0;i<3;i++){
            rand=Math.random()*7;
            password=password+myValues[1][(int)rand];
        }
        for(int i=0; i<1;i++){
            rand=Math.random()*12;
            password=password+myValues[2][(int)rand];

        }
        for(int i=0;i<5;i++){
            rand=Math.random()*7;
            password=password+myValues[3][(int)rand];

        }
        return password;
    }
}

