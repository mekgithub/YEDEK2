package genericscollections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RemovingDuplicateStrings {
    public static void removeDuplicateStrings(ArrayList<String> arr){
        ArrayList<String> emptyArray = new ArrayList<>();
        for(int i=0 ; i<arr.size() ; i++){
            if(!emptyArray.contains(arr.get(i))){
                emptyArray.add(arr.get(i));
            }
        }
        System.out.println(emptyArray);
    }

    public static void main(String[] args) {
        ArrayList<String> test = new ArrayList<String>(Arrays.asList("Chicago","New Orleans","Atlanta","Chicago"));
        removeDuplicateStrings(test);

    }
}
