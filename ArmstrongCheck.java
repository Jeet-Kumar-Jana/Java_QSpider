package Satya_Sir_Java.NumberProgramming;

import java.util.Scanner;

public class ArmstrongCheck {
    public static void checkArmstrong(int num){

        int count = 0, temp1 = num, temp2 = num, sum =0;
        while(temp1 != 0){
            count++;
            temp1 /= 10;
        }
        while(temp2 != 0){
            int rem = temp2 % 10, prod=1;
            for(int i=1; i<=count; i++){
                prod *= rem;
            }
            sum += prod;
            temp2 /= 10;
        }
        System.out.println(sum == num ? "Armstrong" : "Not Armstrong");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number to check Armstrong or not:- ");
        int num = sc.nextInt();
        checkArmstrong(num);

    }
}
