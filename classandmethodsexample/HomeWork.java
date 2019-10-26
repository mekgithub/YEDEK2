package classandmethodsexample;
public class HomeWork {

    public static void main(String[] args) {
        System.out.println("toplama");
        toplama(5,6);
        System.out.println("cikarma");
        cikarma(20,10);
        System.out.println("cikarma2");
        cikarma2(10,15);
        System.out.println("bolme");
        bolme(12,4);
        System.out.println("carpma");
        carpma(12,12);
        int z=myMethod(1000,2000);
        System.out.println(z);
        checkAge(20);
    }
    public static int myMethod(int x, int y){
        return x+y;

    }
    public static void checkAge(int age){
       if(age<18){
           System.out.println("age denied");
       }
       else{
           System.out.println("age accepted");
       }
    }
    public static void toplama(int say1,int say2){
        int sonuc=say1+say2;
        System.out.println(say1 +"+"+ say2+"="+sonuc);

    }
    public static void cikarma(int say1,int say2){
        int result=say1-say2;
        System.out.println(say1+"+"+say2+"="+result);
    }
    public static void cikarma2(int sayi1,int sayi2){
        if(sayi1>sayi2){
            int result=sayi1-sayi2;
            System.out.println(sayi1+"-"+sayi2+"="+result);

        }
        else {
            System.out.println(sayi1+"kucukutur"+sayi2);
            int result=sayi2-sayi1;
            System.out.println(sayi2+"-"+sayi1+"="+result);
        }

    }
    public static void carpma(int sayi1,int sayi2){
        int result=sayi1*sayi2;
        System.out.println(sayi1+"X"+sayi2+"="+result);
    }
    public static void bolme(int sayi1,int sayi2){
        double result=sayi1/sayi2;
        System.out.println(sayi1+"/"+sayi2+"="+result);
    }

}