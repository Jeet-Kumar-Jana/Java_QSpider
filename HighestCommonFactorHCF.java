package Satya_Sir_Java.NumberProgramming;

// Highest Common Factor of two given numbers
import java.util.Scanner;

public class HighestCommonFactorHCF {
    public static void hcf(int n1, int n2){
        int range = n1 <= n2 ? n1 : n2, fact=0;
        for(int i=1; i<=range; i++){
            if(n1 % i == 0 && n2 % i == 0){
                fact = i; 
            }
        }
        System.out.println(fact);
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number :- ");
        int n1 = sc.nextInt();
        System.out.print("Enter 2nd Number :- ");
        int n2 = sc.nextInt();
        hcf(n1, n2);
    }
}
