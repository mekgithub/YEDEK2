package creatingclasses;

public class CoffeMaker {
    private int cups;
    private int  timer;

    public CoffeMaker(int cups,int timer){
        this.cups=cups;//bu ve asgidali 'CoffeMaker'in gorevi initilazinsdir
        this.timer=timer;
    }
   public CoffeMaker(){
        this.cups=6;//bu ve yukaridkai 'CoffeMaker'in gorevi initilazinsdir
        this.timer=20;
    }
    public int getCups() {
        return cups;
    }
    public void setCups(int cups) {
        this.cups = cups;
    }
    public int getTimer() {
        return timer;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }
    public void setTheTimer(int newTimer){
        this.timer=timer;
        System.out.println("Timer is: " + this.timer);
    }
    public void checkTheStatus(){
        if(this.timer==0){
            System.out.println(this.cups + " cupscoffe is ready");

        }
        else{
            System.out.println("Not ready yet");
        }
    }
    public void resetTimer(){
        this.timer=0;
        System.out.println("Timer is reset");
    }
}
