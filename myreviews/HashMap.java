package myreviews;

public class HashMap {
    public static void main(String[] args) {
        java.util.HashMap<String,String> myCitisies=new java.util.HashMap<>();
        myCitisies.put("eNGLAND","LONDON");
        myCitisies.put("BELGIUM","BRUKSEL");
        myCitisies.put("turkey","ankara");
       // System.out.println(myCitisies);
       // System.out.println(myCitisies.get("BELGIUM"));
       // myCitisies.clear();
       // System.out.println(myCitisies.size());
      //  System.out.println(myCitisies);
        for(String i:myCitisies.keySet()){
            System.out.println("keys"+i+ "values"+ myCitisies.get(i));

        }


    }
}
