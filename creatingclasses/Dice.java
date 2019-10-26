package creatingclasses;

public class Dice {
    private int faces;
    public Dice(){
        this.faces=6;
    }
    public Dice(int faces){
        this.faces=faces;
    }
    public int getFaces(){
        return  faces;
    }
    public int rollTheDice(){
        int result;
        double randomNumber=Math.random()*this.faces+1;//asında bu(faces+1-1)+1 demek ama kısaca faces+1 oldu.
        result=(int)randomNumber;
        return result;
    }
}
