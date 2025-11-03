package Satya_Sir_Java.ArrayProgramming;

import java.util.Arrays;

public class HalfOfArrayReverse {
    static void halfReverse(int []arr){
        int n = arr.length/2; // 4
        int temp;
        for(int i=0; i<n/2; i++){
            temp=arr[i];
            arr[i] = arr[(n-1)-i];
            arr[(n-1)-i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int []a = {0,1,2,3,4,5,6,7,8,9};
        halfReverse(a);
    }
}
