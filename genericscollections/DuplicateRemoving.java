package genericscollections;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateRemoving {
    public static void removeDuplicates(ArrayList<Integer> arr) {//[arantez ici parameter
        ArrayList<Integer> newArr=new ArrayList<>();//empty new array list
        for(int element:arr){// visit all elemn of arr
                if(!newArr.contains(element)){
                    newArr.add(element);
                }
        }
        System.out.println(newArr);
    }

    public static void main(String[] args) {
        ArrayList<Integer> myList=new ArrayList<>(Arrays.asList(1,2,3,3,4,2,5,1,3,6));
        removeDuplicates(myList);

    }
}
