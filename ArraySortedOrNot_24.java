package Satya_Sir_Java.ArrayProgramming;

public class ArraySortedOrNot_24 {
    static void isArraySorted(int [] arr){
        int count1=0, count2=0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] <= arr[i+1]){
                count1++;
            }
            else if(arr[i] >= arr[i+1]){
                count2++;
            }
        }
        if(count1 == arr.length-1 || count2 == arr.length-1){
            System.out.println("Array Sorted");
        }
        else{
            System.out.println("Array not sorted");
        }
    }


    public static void main(String[] args) {
        int []arr={1,2,3,4};
        isArraySorted(arr);
    }
}
// boolean flag=false;
        // for(int i=0, j=arr.length-1; i<arr.length-1 && j>=1; i++, j--){
        //     if(arr[i] < arr[i+1]){
        //         flag = true;
        //     }
        //     else if(arr[j] > arr[j-1]){
        //         flag = true;
        //     }
        //     else{
        //         flag = false;
        //         break;
        //     }
        // }
        // if(flag){
        //     System.out.println("Sorted");
        // }
        // else{
        //     System.out.println("Not sorted");
        // }
