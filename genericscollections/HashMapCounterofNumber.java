package genericscollections;

import java.util.HashMap;

public class HashMapCounterofNumber {
    public static void findoccurs(int[] arr) {

        HashMap<Integer,Integer>  occurs=new HashMap<>();

        int counter=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    counter++;
                }
            }
            occurs.put(arr[i],counter);
            counter=0;
        }
        System.out.println(occurs);
    }

    public static void main(String[] args) {
        int[] array={1,2,3,4,3,2,2,5,5,6,6,7,8};
        findoccurs(array);
    }
}
