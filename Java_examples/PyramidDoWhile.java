public class PyramidDoWhile {
    public static void main(String[] args) {
      /*  int lines = 10;
        do {

            lines--;
        }while (lines>0);
    }
}*/
      //  public static void main (String[]args){
            String star = "*";
            int count = 0;
            do {
                System.out.println(star);
                star = star + "*";
                count++;
            } while (count < 5);
        }
    }
