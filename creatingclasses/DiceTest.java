package creatingclasses;

public class DiceTest {
    public static void main(String[] args) {
        Dice myDice=new Dice();
        System.out.println(myDice.getFaces());
        System.out.println(myDice.rollTheDice());
        Dice myDice2=new Dice();
        System.out.println(myDice2.rollTheDice());
        Dice myCustomDice=new Dice(20);//faces 20 that is the initial value
        System.out.println(myCustomDice.rollTheDice());

    }

}
