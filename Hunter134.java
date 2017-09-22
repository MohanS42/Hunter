package demo;

import java.util.Scanner;

public class Hunter134 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int i1=sc.nextInt();
		int i2=sc.nextInt();
		int temp=0;
		while(i2!=0) {
			temp=i1%i2;
			i1=i2;
			i2=temp;
		}
		if(i1==1) {
			System.out.println("Co-prime");
		}else {
			System.out.println("Not Co-prime");
		}
         
		
sc.close();	}

}
