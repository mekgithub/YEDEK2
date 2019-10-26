package arraysExceptions;
//uzunlugu 4 ten kucuk lan kelımlerı output yapmak
public class ArrayLengthOfElements {
    public static void main(String[] args) {
        String [] mysStringArray={"abaca","sagsk","ds","a","adsf","poıug","ghj","qwe","hdshdwadj"};
        int numberOfEleents=0;
        String word="";
        for(int i=1;i<mysStringArray.length ; i++){
            word=mysStringArray[i];
            if(word.length()<4){
                numberOfEleents++;

            }
            System.out.println("there  " +numberOfEleents+"   strngs");


            }

        }
    }
/*ÇOZUMUN IKINCI METODU.BU DAHA GUZEL ***
         public static void main(String[] args) {
        String[] myStringArray = {"sdfsdf","fsd","sdf","gfdgs"};
        int numberOfElements = 0;
           //String word="";
        for(int i=0 ; i<myStringArray.length ; i++){
                //word = myStringArray[i];
                if(myStringArray[i].length()<4){
                    numberOfElements++;
                }
        }
        System.out.println("There "+numberOfElements +" strings");
    }*/