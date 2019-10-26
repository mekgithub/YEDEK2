package creatingclasses;

public class Shapes {

        char symbol;
        int width;
        int heigth;
        Shapes(){
            this.symbol= '*';
            this.width=10;
            this.heigth=10;

        }
        Shapes(char mySymbol,int myWidth,int myHeigth ){
            this.symbol=mySymbol;
            this.heigth=myHeigth;
            this.width=myWidth;
        }
        public void printPyramid(){
            for(int i=1; i<heigth ; i++){
                for(int j=1; j<i ; j++){
                    System.out.print(this.symbol);
                }
                System.out.println();
            }
        }
        public void printRectangle(){
            for(int i=1; i<this.heigth ; i++){
                for(int j=1; j<this.width; j++){
                    System.out.print(this.symbol);

                }
                System.out.println();
            }
        }
        public void printRectangle(char sym){
            for(int i=1; i<this.heigth ; i++){
                for(int j=1; j<this.width; j++){
                    System.out.print(sym);
        }
                System.out.println();
            }
        }
}
