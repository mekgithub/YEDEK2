
// bu bolum ıcın ppt dekı overoadıng method(ways to overload mthod) kısmına bakmalı,orada 3 yol oldugunu soyluyor.
// AYRICA Main methodundan da overload yapılabılır..ancak return method larda overloa olmuyor,(strıng ve ınt gıbı)bkz;PPt bu polndroa d benziyor
package creatingclasses;

public class Conversion {
    public static void main(String[] args) {
        convertLength(10);
        convertLength(10.0);
        convertLen("Cm to inch ",10);
        convertLen(10, "inch to cm");
    }
    public static void convertLength(int cm){
        System.out.println(cm + " cm is : "+ cm/2.54 + " inch");
    }
    public static void  convertLength(double inch){
        System.out.println(inch + " inch is : "+inch*2.54 + " cm");
    }

    public static void convertLen(double len,String msg){
        System.out.println(msg + len*2.54);
    }
    public static void convertLen(String msg, double len){
        System.out.println(msg + len/2.54);
    }

}
