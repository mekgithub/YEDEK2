package creatingclasses;

 public class ArrayClassConstractor {
    int size;
   public ArrayClassConstractor(){
       this.size=10;
   }
   public ArrayClassConstractor(int size){
       this.size=size;
   }
   public int[] initalArray(){
       int[] returnArray=new int[this.size];
       for(int i=0; i<this.size; i++){
         returnArray[i]=i+1;
       }
       return returnArray;
   }
   public void printOddindexes(int [] array){
       for(int i=0; i<array.length ; i++){
           if(i%2!=0){
               System.out.println(array[i]);
           }
       }
   }
   public void printEvenindexes(int [] array){
       for(int i=0;i<array.length; i++){//length main is attribute of array..and array is object..
           if(i%2==0){
               System.out.println(array[i]);
           }
       }
   }
}
