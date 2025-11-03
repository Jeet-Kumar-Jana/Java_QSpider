package Satya_Sir_Java.ArrayProgramming;

public class CountEvenOddNumbers10 {
    static void countOddEven(int []a){
        int odd=0, even=0;
        for(int i=0; i<a.length; i++){
            if(a[i] % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.print("Numbers of Odd element present :- "+odd);
        System.out.println();
        System.out.print("Numbers of Even element present :- "+even);
    }
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6,7};
        countOddEven(arr);
    }
}
