package main.java.Programs;

import java.util.Arrays;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        RemoveElementFromArray.removeElement();
    }

    public static void removeElement(){
        int[] arr = new int[]{1,2,3,4,5,6};
        int[] arr_new = new int[arr.length-1];
        int j=3;
        for(int i=0,k=0;i<arr.length;i++){
            if(i!=j){
                arr_new[k] = arr[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(arr_new));
    }
}
