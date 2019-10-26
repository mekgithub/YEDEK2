/*
1-we create an in 10x10 array and put values from 1 to 100
2-print sum of all rows
3-print sum alla columns
4-print numbers divisible by 4
5-print numbers as triangle
 */
package arraysExceptions;
//
public class TenByTenClass {
    public static void main(String[] args) {
        int [][] numbers=new int[10][10];
        int number = 1;
        int rowSum=0;
        int divisibleNumb=0;

                for(int i=0 ; i< 10; i++){
                    for(int j=0 ; j<10 ; j++){
                        numbers[i][j]=number;
                        number++;
                        rowSum=rowSum+ numbers[i][j];//for row sum

                        System.out.printf("%4d", numbers[i][j]) ;//burada %4d yazmasak sayılar ust uste gelmez..

                    }
                    System.out.print("  Sum  : " + rowSum);
                    rowSum=0;// to reset for next row
                    System.out.println();

                }
                // this nested loops for column Sum
                int  colSum= 0 ;
                for(int i=0 ; i<10 ; i++){
                    for(int j=0 ;j<10 ; j++){
                        colSum=colSum + numbers [j][i];

                    }
                    System.out.println(colSum);
                    colSum=0;
                }
        int divisibleArr=0;
        for (int i=0 ; i<10 ; i++){
            for(int j=0 ;j<10 ; j++){
                if(numbers[i][j]%4==0){
                    divisibleArr=numbers[i][j];
                    System.out.println(divisibleArr);
                }
                //this nested

            }
        }
        //
    }
}
