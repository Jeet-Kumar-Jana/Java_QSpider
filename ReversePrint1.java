package Satya_Sir_Java.ArrayProgramming;

public class ReversePrint1 {
    static void reverse(int [] a){
        for(int i=a.length-1; i>=0; i--){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6,7};
        reverse(arr);
    } 
}
