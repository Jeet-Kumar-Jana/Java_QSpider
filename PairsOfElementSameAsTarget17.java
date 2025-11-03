package Satya_Sir_Java.ArrayProgramming;

public class PairsOfElementSameAsTarget17 {
    static void pairs(int []arr, int target){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    System.out.print("["+arr[i]+","+arr[j]+"]");
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6,7};
        int target= 5;
        pairs(arr, target);
    }
}
