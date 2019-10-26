package genericscollections;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String,String> myFirstHasmAP=new HashMap<String,String>();
        myFirstHasmAP.put("Java "," Medium");
        myFirstHasmAP.put("Sql "," Entry");
        myFirstHasmAP.put("Selenium "," Master");
        myFirstHasmAP.put("Cucumber "," Expert");
        System.out.println(myFirstHasmAP);

        for(String key:myFirstHasmAP.keySet()){
            System.out.println("Key:   " + key + " Value " + myFirstHasmAP.get(key));

        }

    }
}
