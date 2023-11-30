package main.java.Programs;

import java.util.HashMap;
import java.util.Map;

public class DivideOnVowelAndOccuranceOfCharacter {

    public static void main(String[] args) {
        DivideOnVowelAndOccuranceOfCharacter.occuranceOfCharacter();
    }

    public static void occuranceOfCharacter() {
        String s = "Automation";
        char[] character = s.toCharArray();
        HashMap<Character,Integer> hm = new HashMap<>();
        for (char c : character){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            if(hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }else{
                hm.put(c,1);
            }}
        }
        for(Map.Entry<Character,Integer> entry : hm.entrySet()){
                System.out.println("Key: "+entry.getKey()+"     "+"Occurance: "+entry.getValue());

        }
    }
}
