package review1;

public class deneme {
    static void myStatic(){
        System.out.println("STATIC GARDAS");
    }
    public void MyPublic(){
        System.out.println("PUBLIC GARDAS");
    }

    public static void main(String[] args) {
        myStatic();
        deneme myObj=new deneme();
        myObj.MyPublic();
    }
}


