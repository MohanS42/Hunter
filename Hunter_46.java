import java.util.Scanner;

public class Hunter_46 {

	public static void main(String args[])
	{

		int result=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the Total number: ");
		int num=sc.nextInt();
		if(num%2==0) {
			result=num/2;
			System.out.println(num/2+" "+num/2);
			System.out.println(result);
			
		}else {
		      int temp=(num/2)+1;
		      int temp1=num/2;
		      result=temp-temp1;
		      System.out.println(temp+" "+temp1);
		      System.out.println(result);
		}
	sc.close();}

}