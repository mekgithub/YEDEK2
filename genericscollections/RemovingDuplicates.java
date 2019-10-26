package genericscollections;
import java.util.*;
public class RemovingDuplicates {
    public static void removeRepeatingValues(ArrayList<Integer> arr){
        int temp;
        int len = arr.size();
        for (int i=0 ; i<len ; i++) {
            temp =arr.get(i);
            arr.remove(i);
            if(!arr.contains(temp)){
                arr.add(temp);
            }
            len = arr.size();
        }

        System.out.println(arr);
    }

    public static void main(String[] args) {
        ArrayList<Integer> myArr = new ArrayList<Integer>(Arrays.asList(1,2,2,3,3,4));
        removeRepeatingValues(myArr);
    }
}
