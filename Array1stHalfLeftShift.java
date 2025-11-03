package Satya_Sir_Java.ArrayProgramming;

import java.util.Arrays;

public class Array1stHalfLeftShift {
    static void leftShift1stHalf(int [] arr){
        int n = arr.length/2;
        int temp = arr[0];
        for(int i=0; i<n-1; i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int []a = {0,1,2,3,4,5,6,7,8,9};
        leftShift1stHalf(a);
    }
}
