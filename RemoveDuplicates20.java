package Satya_Sir_Java.ArrayProgramming;

public class RemoveDuplicates20 {
    static void removeDuplicates(int arr[]){
        int dummy = Integer.MIN_VALUE;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++)
            if(arr[i] == arr[j] && arr[i] != dummy){
                arr[j] = dummy;
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] != dummy){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6,7,3,4,2,3,1,2,5,3,6,7,3,4};
        removeDuplicates(arr);
    }
}
