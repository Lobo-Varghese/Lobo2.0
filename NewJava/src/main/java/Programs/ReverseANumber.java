package main.java.Programs;

public class ReverseANumber {
    public static void main(String[] args) {
        ReverseANumber.reverseNumber();
    }

    public static void reverseNumber() {
        int num = 2345;
        String str = String.valueOf(num);
        System.out.println(str.length());
        int last;
        int rev = 0;
        for(int i = 0;i<=str.length()-1;i++){
            last = num%10;
            rev = rev*10;
            num = num/10;
            rev = rev+last;
        }
        System.out.println("reverseNumber =: "+rev);
    }
}
