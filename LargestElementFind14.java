package Satya_Sir_Java.ArrayProgramming;

public class LargestElementFind14 {
    static void largestElement(int []arr){
        int largest=arr[0];
        for(int i=1; i<arr.length; i++){
            if(largest<arr[i]){
                largest = arr[i];
            }
        }
        System.out.print("Largest element is :- "+largest);
    }
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,20,5,6,7};
        largestElement(arr);
    }
}
