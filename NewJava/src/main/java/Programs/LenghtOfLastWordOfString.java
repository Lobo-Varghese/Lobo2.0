package main.java.Programs;

import java.util.ArrayList;
import java.util.List;

public class LenghtOfLastWordOfString {

    public static void main(String[] args) {
        LenghtOfLastWordOfString.lengthOfWord();
    }

    public static void lengthOfWord(){
        String str = "The length of last Word";
        String[] strsplt = str.split(" ");
        List<String> li = new ArrayList<String>();
        for (String s : strsplt){
                li.add(s);
        }
        System.out.println("Last Word:  "+ li.get(li.size()-1));
        System.out.println("Last Word lenght:  "+ li.get(li.size()-1).length() );
    }
}
