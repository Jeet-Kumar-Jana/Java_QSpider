package Satya_Sir_Java.ArrayProgramming;

import java.util.Arrays;

public class Array2ndHalfRightShift {
    static void rightShift2ndHalf(int [] arr){
        int n = arr.length/2;
        int temp = arr[arr.length-1];
        for(int i=arr.length-1; i>=n+1; i--){
            arr[i] = arr[i-1];
        }
        arr[n] = temp;
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int []a = {0,1,2,3,4,5,6,7,8,9};
        rightShift2ndHalf(a);
    }
}
