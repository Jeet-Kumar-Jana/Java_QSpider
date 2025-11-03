package Satya_Sir_Java.ArrayProgramming;

public class AverageOfElements9 {
    static int average(int []arr){
        int avg=0;
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum +=arr[i];
        }
        avg = sum/arr.length;
        return avg;
    }
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6,7};
        System.out.println(average(arr));
    }
}
