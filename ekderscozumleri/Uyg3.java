package ekderscozumleri;

import java.util.HashMap;

public class Uyg3 {
    public static void main(String[] args) {
        HashMap<String,Integer> people=new HashMap<String, Integer>();
        people.put("Ali Sami",9);
        people.put("Alexander",9);
        people.put("QAISAR",9);
        people.put("peyton",9);
        for (String i:people.keySet()) {
            System.out.println(" key: " + i + "  value: " + people.get(i));


        }

    }
}
