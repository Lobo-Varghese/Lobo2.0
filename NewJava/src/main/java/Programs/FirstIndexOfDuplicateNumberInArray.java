package main.java.Programs;

import java.util.HashMap;

public class FirstIndexOfDuplicateNumberInArray {
    public static void main(String[] args) {
        FirstIndexOfDuplicateNumberInArray.firstOccuranceIndex();
    }

    public static void firstOccuranceIndex() {

        int[] arr = new int[]{1,2,9,4,3,7,7};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int a=0;a<=arr.length-1;a++){
            if(hm.containsKey(arr[a])){
                System.out.println("First Occurrence of : "+ arr[a] + " is : "+hm.get(arr[a]));
            }else{
                hm.put(arr[a],a);
            }

        }

    }
}
