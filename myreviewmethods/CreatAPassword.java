package myreviewmethods;

public class CreatAPassword {
    public static void main(String[] args) {

      /*  double rand=Math.random()*1000000;
          int pasword=(int)rand;
           System.out.println(pasword);*/
      // CreatAPassword.createPasString();
       /* for(int i=1; i<10 ; i++) {
            CreatAPassword.cretaPsStr();
            System.out.println();
        }*/
        //System.out.println();
       // CreatAPassword.createIntPasword();
        //CreatAPassword.creataIntStrPasw();
        //CreatAPassword.creataIntStrPasw();
        for(int i=1; i<10 ; i++) {
            System.out.println(CreatAPassword.creataIntStrPasw());
        }



            }
            public static void createPasString() {
                    double rand;
                    char pasword;
                    int count;
                        for (int j = 1; j < 7; j++) {
                        rand = Math.random()*(122-97)+97;
                        count=(int) rand;
                        pasword=(char) count;
                        System.out.print(pasword);
                    }
                }
                public static void cretaPsStr(){
                char pasword;
                 double rand;
                 int count;
                  for(int i=1; i<7 ; i++){
                      rand=Math.random()*(122-97)+97;
                      count=(int)rand;
                      pasword=(char)count;
                      System.out.print(pasword);
                  }
                }
                public static void createIntPasword(){
                int pasw;
                double rand;
                for(int i=1 ; i<10 ;i++){
                    rand=Math.random()*1000000;
                    System.out.println((int)rand);
                }
                }
                public static String creataIntStrPasw() {
                    String pasword = "";
                    double rand;
                    for(int i=1; i<4 ; i++){
                        rand=Math.random()*10;
                        pasword=pasword+(int)rand;
                    }
                    for(int j=1 ; j<4; j++){
                        rand=Math.random()*(122-97)+97;
                        pasword=pasword+(char)(int)rand;

                    }
                    return pasword;

                }
}
