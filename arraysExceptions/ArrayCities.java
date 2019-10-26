package arraysExceptions;
//şehirleri yukarıdan aşağı ve aşağıdan yukarı sıaralamak..
public class ArrayCities {
    public static void main(String[] args) {

        String[]cities={"New york,","Los Angeles", "Ann Arbor","Chicago","innapolis","Salt Lake City"};
        System.out.println("Cities in regular order");
        for(int i=0 ; i< cities.length ; i++) {
            System.out.println(cities[i]);
        }
        System.out.println("Cities in reverse order");
        for(int i=cities.length-1 ; i>=0 ; i--){
            System.out.println(cities[i]);
        }
    }
}
