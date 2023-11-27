package main.java.Programs;

import java.util.HashMap;

public class consecutiveRepeatedCharacter {

    public static char consecutiveCharacter(){
        String str = "Staaaaaandarrrrd";
        int count = 0;
        char res = str.charAt(0);
        for(int i =0;i<str.length();i++){

            int curr_count =1;
           for (int j =i+1;j<str.length();j++){
               if(str.charAt(i)!=str.charAt(j)){
                break;}
               curr_count++;
           }
           if(curr_count>count){
               count = curr_count;
               res = str.charAt(i);
           }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(consecutiveRepeatedCharacter.consecutiveCharacter());
    }
}
