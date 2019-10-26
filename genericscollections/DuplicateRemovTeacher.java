package genericscollections;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateRemovTeacher {
    public static void removeDuplicates(ArrayList<Integer> arr){
        ArrayList<Integer> newArr = new ArrayList<>();
        for (int i=0 ; i<arr.size() ; i++){
            if(!newArr.contains(arr.get(i))){
                newArr.add(arr.get(i));
            }
        }
        System.out.println(newArr);
    }

    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>(Arrays.asList(1,2,3,3,4,2,5,1,3,6));
        removeDuplicates(myList);
    }
}
