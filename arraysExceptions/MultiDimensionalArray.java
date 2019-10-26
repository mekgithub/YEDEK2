package arraysExceptions;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] multi={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0; i<multi.length;i++){
            for(int j=0; j<multi[i].length; j++){
                System.out.println(multi[i][j]);

            }
        }
         String [] [] names={{"tame"},{"alies"},{"wilson"},{"jennifer"},{"michael"},{"david"}};
        for(int i=0; i<names.length ;i++){
            for(int j=0; j<names[i].length; j++){
                System.out.println(names[i][j]);

            }
        }
        char [][] letters={{'A','w','z'},{'b'},{'C'},{'D'},{'e'},{'F'},{'g'}};
        for(int i=0; i<letters.length ; i++){
            for(int j=0; j<letters[i].length ; j++){
                System.out.println(letters[i][j]);

            }
        }
        int [][] numbers=new int[10][10] ;
        int counter=1;
        for(int i=0 ; i<=10 ; i++){
            for(int j=0; j<=10; j++){
                numbers[i][j]=counter;
                System.out.println(counter);
                counter ++;

            }
        }
    }
}
