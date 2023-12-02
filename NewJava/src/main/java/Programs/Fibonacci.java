package main.java.Programs;

public class Fibonacci {
    public static void main(String[] args) {

        Fibonacci.fibonacci()
        ;
    }
    public static void fibonacci(){
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int c = 0;
        for(int i =0;i<=5;i++){
           c = a+b;
           a=b;
           b=c;
       System.out.println(c);

        }
    }
}
