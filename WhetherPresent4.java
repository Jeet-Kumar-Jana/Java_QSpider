package Satya_Sir_Java.ArrayProgramming;

public class WhetherPresent4 {
    static void whetherValuePresent(int []arr, int n){
        boolean isPresent = false;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == n){
                isPresent=true;
            }
            
        }
        if(isPresent == true){
            System.out.println("Value is present");
        }
        else{
            System.out.println("Value is not present");
        }
    }
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6,7};
        int value = 20;
        whetherValuePresent(arr, value);
    }
}
