package ekderscozumleri;

import java.util.HashMap;

public class Uygulma2 {
    public static void main(String[] args) {
        HashMap<String,String> capitalcities=new HashMap<String, String>();
        capitalcities.put("England","London");
        capitalcities.put("Norvay", " Oslo");
        capitalcities.put("Germany","Berl'n");
        capitalcities.put("usa","washington");
        for(String i:capitalcities.keySet()){
            System.out.println(" key: " +i  + "  value : " + capitalcities.get(i));
        }
    }

}
