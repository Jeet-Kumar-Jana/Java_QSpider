package Satya_Sir_Java.ArrayProgramming;

import java.util.Arrays;

public class ArrayRightShift27 {
    static int[] rightShift(int []arr){
        int temp = arr[arr.length-1];
        for(int i=arr.length-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        return arr;
    }

    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        int b[] = rightShift(arr);
        System.out.println(Arrays.toString(b));
    }
}
