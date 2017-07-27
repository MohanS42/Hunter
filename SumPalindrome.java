import java.util.Scanner;

public class SumPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int temp=sc.nextInt();
		int num=0;
		while(temp>0) {
			int remain=temp%10;
			num=num+remain;
			temp=temp/10;
			
		}System.out.println(num);
		int sum1=num;
		int rev=0;
		while(num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(rev==sum1)
		{
			System.out.println("The sum of the given number is Palindrome");
		}
		else
		{
			System.out.println("The sum of the given number is not Palindrome");
		}
	}
}