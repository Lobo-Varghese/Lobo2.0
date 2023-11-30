package main.java.Programs;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class FirstIndexOfDoubledNumberInArray {

    public static void main(String[] args) {
        System.out.println(FirstIndexOfDoubledNumberInArray.doubledNumber());
    }

    public static int doubledNumber(){
        int[] arr = {1, 2, 3, 5, 5,4,4};

        int k =  0;
        for(int i=0; i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]) {
                 k = i;
                 break;
                }
            }
            if (k!=0) break;
        }
        return k;
    }
}
