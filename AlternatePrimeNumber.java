package Satya_Sir_Java.NumberProgramming;

import java.util.Scanner;

public class AlternatePrimeNumber {
    public static void alternatePrime(int s, int e){
        int index = 0;
        for(int j=s; j<=e; j++){
            int count = 0;
            for(int i=1; i<=j; i++){
                if(j % i == 0){
                    count++;
                }
            }
            if(count == 2){
                index++;
                if(index % 2 == 1)
                    System.out.println(j);
            }
        }   
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting range of Prime number :- ");
        int s = sc.nextInt();
        System.out.print("Enter ending range of Prime number :-");
        int e = sc.nextInt();
        alternatePrime(s, e);
    }
}
