package main.java.Programs;

public class PatternProgram {
    public static void main(String[] args) {
       // PatternProgram.patternLeftTriangle();
        //PatternProgram.patternRightTriangle();
        //PatternProgram.patternInvertedLeftTriangle();
        PatternProgram.patternInvertedRightTriangle();
    }

    public  static  void patternLeftTriangle(){
        for(int i = 0;i<=4;i++){
            for(int j =0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patternRightTriangle(){

        for(int i=0;i<=4;i++){
            for(int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public  static void patternInvertedLeftTriangle(){
        for (int i = 0; i <= 4; i++) {
            for(int j = 4; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patternInvertedRightTriangle(){
        for (int i = 0; i <= 4; i++) {
            for (int k = 0; k <=i ; k++) {
                System.out.print(" ");
            }
            for (int j = 4; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
