package Satya_Sir_Java.ArrayProgramming;

import java.util.Arrays;

public class CopyOneArrayToAnother5 {
    static void copyArray(int []original, int []duplicate){
        for(int i=0; i<original.length; i++){
            duplicate[i] = original[i];
        }
        System.out.println("Duplicate Array:- "+Arrays.toString(duplicate));
    }
    public static void main(String[] args) {
        int [] original = {1,2,3,4,5,6,7};
        int [] duplicate = new int [original.length];
        System.out.println("Original Array:- "+Arrays.toString(original));
        copyArray(original, duplicate);
    }
}
