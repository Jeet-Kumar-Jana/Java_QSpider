// Check whether a number is odd or even.
import java.util.Scanner;
class OddEven{
	public static void main(String [] args){
		int n;
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter a Number:- ");
		n=sc.nextInt();
		System.out.println(n%2==0?"Number is Even":"Number is Odd");
	}
}
