// Write a program to check which number is greater among 3 numbers.

import java.util.Scanner;

public class BigAmong3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter third number: ");
        int c = sc.nextInt();
        System.out.println(a>b && a>c?a+" is the Bigger number":(b>a && b>c)?b+" is the Bigger number":c+" is the Bigger number");
    }
}
