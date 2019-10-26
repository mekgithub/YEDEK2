package arraysExceptions;

public class findMaxLengthArrayWord {
    public static void main(String[] args) {
        String [] usaCities={"Utah","Calıfornıa","newYork","NewJersey","houston"};
        String maxLength="";
        for(int i=0 ; i<usaCities.length ; i++){
            if(usaCities[i].length()>=maxLength.length()){
                maxLength = usaCities[i];
            }
        }
        System.out.println(maxLength);
    }

}


