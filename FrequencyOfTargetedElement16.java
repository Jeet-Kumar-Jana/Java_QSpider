package Satya_Sir_Java.ArrayProgramming;

public class FrequencyOfTargetedElement16 {
    static void frequency(int []arr, int target){
        int count =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                count++;
            }
        }
        System.out.println("Frequency of "+target+" is :- "+count);
    }
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6,7,3,4,2,3,1,2,5,3,6,7,3,4};
        int target = 3;
        frequency(arr, target);
    }
}
