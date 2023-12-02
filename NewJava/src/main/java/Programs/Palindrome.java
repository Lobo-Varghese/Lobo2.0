package main.java.Programs;

public class Palindrome {
    public static void main(String[] args) {
        Palindrome.palindrome();

    }

    public static  void palindrome(){
        String str = "Madamw";
        char c;
        StringBuilder s = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
          c =  str.charAt(i);
          s.append(c);
        }
        System.out.println(s);
        if(str.equalsIgnoreCase(String.valueOf(s))){
            System.out.println(str + " is a palindrome");
        }else{
            System.out.println(str + " is not a palindrome");
        }
    }
}
