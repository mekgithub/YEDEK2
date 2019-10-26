package arraysExceptions;

public class FinallyExample {
    public static void main(String[] args) {
        int [][] myArr={
                {1,2},
                {3,4,5,6},
        };
        int[][] result= convertArray(myArr);
        for(int i=0; i<result.length ; i++){
            for(int j=0; j<result[i].length ;j++){
                System.out.println(result[i][j]);
            }
        }
    }
    public static int[][] convertArray(int [][] arr){
        int [][] converted=new int[arr[0].length][arr.length];
        try{
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[i].length ; j++){
                converted[j][i]= arr[i][j];
            }
        }
        }finally {
            return converted;
        }
    }
}
