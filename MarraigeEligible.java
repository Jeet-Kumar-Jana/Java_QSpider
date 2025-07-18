//Write a program to check whether a man eligible for marraige or not.
import java.util.Scanner;
class MarraigeEligible{
        public static void main(String[] args) {
            int n;
            Scanner sc = new Scanner (System.in);
            System.out.println("Enter your age");
            n=sc.nextInt();
            System.out.println(n>=21?"Yes":"No");
        }
}