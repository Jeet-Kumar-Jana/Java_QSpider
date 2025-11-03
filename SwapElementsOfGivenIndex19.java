package Satya_Sir_Java.ArrayProgramming;

import java.util.Arrays;

public class SwapElementsOfGivenIndex19 {
    static int [] swap(int [] arr, int i1, int i2){
        if(i1>i2){
            System.out.println("Invalid Index");
        }
        else{
            arr[i1] +=arr[i2];
            arr[i2] = arr[i1] - arr[i2];
            arr[i1] -= arr[i2]; 
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6,7};
        int i1 = 2;
        int i2 = 5;
        System.out.println(Arrays.toString(swap(arr, i1, i2)));
    }
    
}
