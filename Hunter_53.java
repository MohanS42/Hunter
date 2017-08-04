import java.util.Scanner;

public class Hunter_53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String temp="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		temp=sc.nextLine();
		System.out.println("enter the input length");
		int num=sc.nextInt();
		for(int i=1;i<temp.length()-1;i++) {
			System.out.print(String.valueOf(temp.charAt(0)));
			System.out.println(String.valueOf(temp.substring(i,i+num-1)));
		}
		
sc.close();	}

}
