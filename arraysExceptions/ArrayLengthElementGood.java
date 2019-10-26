package arraysExceptions;
//uzunlugu 4 ten kucuk olan kac elelman var?
public class ArrayLengthElementGood {
    public static void main(String[] args) {
        String[] myStringArray = {"sdfsdf","fsd","sdf","gfdgs"};
        int numberOfElements = 0;
        //String word="";
        for(int i=0 ; i<myStringArray.length ; i++){
            //word = myStringArray[i];
            if(myStringArray[i].length()<4){
                numberOfElements++;
            }
        }
        System.out.println("There "+numberOfElements +" strings");
    }
}
