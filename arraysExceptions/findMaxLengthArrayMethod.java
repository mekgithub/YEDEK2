package arraysExceptions;

public class findMaxLengthArrayMethod {
    public static String findMaxInArray(String array){
        String [] usaCities={"Utah","Calıfornıa","newYork","NewJersey","houston"};
        String maxLength="";
        for(int i=0 ; i<usaCities.length ; i++){
            if(usaCities[i].length()>=maxLength.length()){
                maxLength = usaCities[i];
            }
        }
        return maxLength;
    }

}

