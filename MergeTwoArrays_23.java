package Satya_Sir_Java.ArrayProgramming;

import java.util.Arrays;

public class MergeTwoArrays_23 {

    static int[] mergeArray(int []a1, int []a2){
        int [] a3 = new int[a1.length+a2.length];
        for(int i=0,j=0,k=0; i<a3.length; i++){
            if(i<a1.length){
                a3[i] = a1[j];
                j++;
            }
            else{
                a3[i] = a2[k];
                k++;
            }
        }
        return a3;
    }


    public static void main(String[] args) {
        int []a1 = {1,2,3,4,5};
        int []a2 = {6,7,8,9};
        int []a3 = mergeArray(a1, a2);
        System.out.println(Arrays.toString(a3));
    }
}
