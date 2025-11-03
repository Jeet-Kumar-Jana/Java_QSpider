package Satya_Sir_Java.ArrayProgramming;

public class NthLargestElement {
    static void nthLargest(int[]arr, int n){
        int dummy = Integer.MIN_VALUE, index=0, max1 = Integer.MIN_VALUE;

        for(int i=1; i<=n; i++){
            int max=arr[0];
            for(int j=1; j<arr.length; j++){
                if(arr[j] == max1){
                    arr[j] = dummy;
                }

                if(max <= arr[j] && arr[j] != Integer.MIN_VALUE){
                    max = arr[j];
                    index = j;
                }
            }
            max1 = max;
            arr[index] = dummy;
            if(i == n){
                System.out.println(max);
            }
        }
    }
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6,7,4,7};
        int n = 2;
        nthLargest(arr, n);
    }
}
