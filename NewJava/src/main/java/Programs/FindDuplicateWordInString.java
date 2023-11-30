package main.java.Programs;

import java.util.HashMap;

public class FindDuplicateWordInString {

    public static void main(String[] args) {
       // FindDuplicateWordInString.duplicateWord();
        FindDuplicateWordInString.duplicateWordUsingMap();
    }

    public static void duplicateWord() {
        String str = "Today is hot day of day of";
        String[] strspl = str.split(" ");
        int count=0;
        for(int i =0;i<strspl.length;i++){
            int curr_count =0;
            for(int j=0;j<strspl.length;j++){
                if(strspl[i].equalsIgnoreCase(strspl[j])){
                    curr_count++;
                    if(curr_count>count){
                        count=curr_count;
                        if(count>1){
                            System.out.println(strspl[i]);

                        }
                    }
                }
            }
        }
    }


    public static void duplicateWordUsingMap(){
        String str = "Today is hot day of day of";
        String[] strspl = str.split(" ");
        HashMap<String,Integer> hm = new HashMap<>();
        for(String s :strspl){
            if(hm.containsKey(s)) {
                hm.put(s, hm.get(s)+1);
            }else{
                hm.put(s,1);
            }
        }
        System.out.println(hm);
    }
}
