package Satya_Sir_Java.ArrayProgramming;

public class CommonFromTwoArray25 {
    static void commonElements(int []a, int []b){
        System.out.print("[");
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                if(a[i] == b[j]){
                    if(i==a.length-1){
                        System.out.print(a[i]);
                    }
                    else{
                        System.out.print(a[i]+", ");
                    }
                }
            }
        }
        System.out.print("]");
    }



    public static void main(String[] args) {
        int []a = {1,2,3,4,5};
        int []b = {8,5,9,2,1};
        commonElements(a, b);
    }
}
