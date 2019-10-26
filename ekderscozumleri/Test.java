package ekderscozumleri;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
      ArrayList<Integer> myList=new ArrayList<>();
      myList.add(10);
      myList.add(12);
        System.out.println(myList);
        for(int i=1; i<10; i++){
            myList.add(i);

        }
        System.out.println(myList);
        System.out.println(myList.size()-1);
        System.out.println(myList.size());

    }
}

