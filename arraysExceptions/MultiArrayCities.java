package arraysExceptions;

public class MultiArrayCities {
    public static void main(String[] args) {
        String [][] cities={
                {"Arlingto","Rihmond","Albany","Fairfax"},
                {"Houston","Charlotte","Baton rouge","Oklahoma City","Boulder"},
                {"SanDiego","Atlanta","Miami","Austin","Mineapolis","San Fransico"},
                {"Kansas city","Pisttsburg","Los Angeles"}
        };
        //printCitiesWithFirstLetterA(cities);
        //prinCitiesReversed(cities);
        //printCitiesBetweenAandH(cities);
        printCitiesHasA(cities);

    }


    public static void printCitiesHasA(String [][] cities){
        System.out.println("-----------");
        boolean hasA=false;
        for(int i=0 ; i<cities.length ; i++){
            for(int j=0; j<cities.length ; j++){
                for(int k=0 ; k<cities[i][j].length(); k++){
                    if(cities[i][j].charAt(k)=='a'){
                        hasA=true;

                    }

                }
                if(hasA){

                    System.out.println(cities[i][j]);


                }
                hasA=false;
            }
        }
    }

    public static void prinCitiesReversed(String[][] cityArray){
        String city=null;// buraya isterk null yerine "" de yazabilşrdik
        int theLastIndex=0;
        for(int i=0 ; i<cityArray.length ; i++){
            for(int j=0 ; j<cityArray[i].length ; j++){
                city=cityArray[i][j];
                theLastIndex=city.length()-1;
                for(int k=theLastIndex ; k>=0 ; k--){

                    System.out.print(city.charAt(k));
                }
                System.out.println();
            }
        }
    }


    public static void printCitiesWithFirstLetterA(String [][] cityNames){
        for(int i=0 ; i<cityNames.length ; i++){
            for(int j=0 ; j<cityNames[i].length ; j++ ){
                String city=cityNames[i][j];
                if(city.charAt(0)=='A'){
                    System.out.println(cityNames[i][j]);
                }
            }
        }
    }
    public static void printCitiesBetweenAandH(String [][] myCities){

        for(int i=0 ; i<myCities.length ; i++){
            for(int j=0 ; j<myCities[i].length ; j++){
                if(myCities[i][j].charAt(0)>=65 && myCities[i][j].charAt(0)<=72){
                    System.out.println(myCities[i][j]);
                }

            }
        }

    }

}
