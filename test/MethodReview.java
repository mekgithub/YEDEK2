package test;
//this is rview of alla methods with examples..:
public class MethodReview {
    public static void main(String[] args) {
        printmyname();
        prnMyname("VoidWithPARAMETER");
        System.out.println(printMyname());
        System.out.println(printMyn("StringWithPARAMETER"));
    }
    //Void method without parameter
    public static void printmyname(){
        System.out.println("voidWthoutParameter");
    }
    public static void prnMyname(String name){

        System.out.println(name);
    }
    //String method without parameter
    public static String printMyname(){
        String Name="StringWithoutParameter";
        return Name;
    }
    //String method with parameter
    public static String printMyn(String name){
        return name;

    }
}
