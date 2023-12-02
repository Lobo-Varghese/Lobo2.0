package main.java.Programs;

public class ThirdLargestElementInArray {
    public static void main(String[] args) {
        System.out.println("Third Largest :  "+ThirdLargestElementInArray.thirdLargestElement());
    }

    public static int thirdLargestElement() {
        int[] arr = {1, 4, 7, 3, 5, 9, 3, 2, 0};
        int[] tempArr = {0};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    tempArr[0] = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tempArr[0];
                }
            }
        }
        for(int k:arr) {
            System.out.println(k);
        }
        return arr[arr.length-3];
    }
}
