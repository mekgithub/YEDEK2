package genericscollections;

import java.util.ArrayList;

public class ConvertString {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Volvo");
        list.add("BMW");
        list.add("MERCEDES");
        String[] array = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        System.out.println(list);
        }
    }

