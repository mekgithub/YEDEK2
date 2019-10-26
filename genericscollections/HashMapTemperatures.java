package genericscollections;

import java.util.HashMap;

public class HashMapTemperatures {
    public static void main(String[] args) {
        HashMap<String,Integer> myTemp=new HashMap<String, Integer>();
        myTemp.put("LosAngeles",85);
        myTemp.put("Chicago",30);
        myTemp.put("Denver",55);
        myTemp.put("Orlando",90);

        int average=0;
        for(String key:myTemp.keySet()){ // buradaki keyset values demektir.
            System.out.println(" City: " + key+ " Temperature " + myTemp.get(key));
            average=average+myTemp.get(key);

        }
        System.out.println(" Average Temperature : " + average/myTemp.size());
    }
}
