package myreviewmethods;

public class MultiplicationTable {
     static void multipTable(){

        for(int i=1; i<=10;i++){
            for(int j=1; j<=10;j++){
                int result=i*j;
               System.out.print("" +i+"*"+j+"="+result+" , ");


            }
        }
    }

    public static void main(String[] args) {
        MultiplicationTable.multipTable();
    }
}
