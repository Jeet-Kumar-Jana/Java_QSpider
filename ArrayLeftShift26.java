package Satya_Sir_Java.ArrayProgramming;

import java.util.Arrays;

public class ArrayLeftShift26 {
    static int[] leftShift(int []arr){
        int temp = arr[0];
        for(int i=0; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
        return arr;
    }

    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        int b[] = leftShift(arr);
        System.out.println(Arrays.toString(b));
    }
}
