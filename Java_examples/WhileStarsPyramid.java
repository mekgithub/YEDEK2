public class WhileStarsPyramid {
    public static void main(String[] args) {
        int lines =1;
        int limit=7;
        int numberOfStars=1;
        while(lines<8){
            //int limit =7;
            //To print spaces (left hand side)
            int spaces=limit;
            while(spaces>1){
                System.out.print(" ");
                spaces--;
            }
            //to print stars
            int stars=1;
            while(stars<=numberOfStars){
                System.out.print("*");
                stars++;
            }
            System.out.println(); //to move cursor next line (to obtain lines)
            lines++;
            limit--;
            numberOfStars = numberOfStars+2;
        }
    }
}
