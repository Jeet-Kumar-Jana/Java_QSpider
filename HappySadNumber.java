package Satya_Sir_Java.NumberProgramming;

import java.util.Scanner;

public class HappySadNumber{
    public static void checkHappy(int n){

        int num = n, sum=0;

        while(n >=10){
            while(n !=0){
                int rem = n % 10;
                int sq = rem * rem;
                sum += sq;
                n /= 10;
            }
            n = sum;
            sum = 0;
        }
        System.out.println(n == 1 || n == 7 ? num+" is a Happy Number" : num+" is Not a Happy Number");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check whether it is Happy or Sad number:- ");
        int num = sc.nextInt();
        checkHappy(num);
    }
}