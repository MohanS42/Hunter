import java.util.Scanner;

public class Hunter_102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rem = 0;
		int temp = num;
		while(temp > 0)
		{
			num = temp;
		while(num > 0)
		{
			int n = num%10;
			 rem = rem+n;
			num = num/10;
		}
		temp = temp/10;
		}
		System.out.println(rem+"");
	
		
sc.close();	}

}
