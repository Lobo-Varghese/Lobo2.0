package main.java.Programs;

import java.util.Arrays;

public class AscendingDecendingNumber {
    public static void main(String[] args) {
        AscendingDecendingNumber.Ascending();
    }

    public static void Ascending() {
        int[] arr = new int[]{2,4,8,1,4,9};
        int[] temp = {0};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    temp[0] = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp[0];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
