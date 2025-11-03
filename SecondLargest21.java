package Satya_Sir_Java.ArrayProgramming;

public class SecondLargest21 {
    static void secondLargest(int [] arr){
        int largest = arr[0];
        int second = Integer.MIN_VALUE;
        for(int i=1; i<arr.length; i++){
            if(largest<arr[i]){
                second = largest;
                largest = arr[i];
            }
            else if(largest>arr[i] && arr[i]>second){
                second = arr[i];
            }
        }
        System.out.print("Second largest element is :- "+second);
    }
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6,7};
        secondLargest(arr);
    }
}
