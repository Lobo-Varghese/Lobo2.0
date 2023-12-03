package main.java.Programs;

public class StringLenWithoutLenMethod {

    public static void main(String[] args) {
        StringLenWithoutLenMethod.StringLen();
    }

    public static void StringLen() {
        String str = "LoboVarghese";
        String[] strSpt =  str.split("");
        int count=0;
        for(String s:strSpt){
            count++;
        }
        System.out.println(count);
    }
}
