package Satya_Sir_Java.ArrayProgramming;

import java.util.Arrays;

public class ArrayReverse {
    static void reverseArray(int []arr){
        int count=arr.length;
        int n = arr.length/2;
        int temp;
            for(int i=0; i<arr.length/2; i++){
                
                    temp=arr[i];
                    arr[i] = arr[arr.length-1-i];
                    arr[arr.length-1-i] = temp;
                
            }
        
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int []a = {0,1,2,3,4,5,6,7,8,9};
        reverseArray(a);
    }
}
