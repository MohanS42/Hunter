package demo;

import java.util.Scanner;

public class Hunter132 {
public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		if(n<=0) {
			System.out.println("Undefined Number");
		}else {
		    for(int i=n;i>=0;i--){
			for(int j=0;j<i;j++){
				System.out.print('*');
			}
			System.out.print(" ");
			for(int j=0;j<i;j++){
				System.out.print('*');
			}
			System.out.println();
		}
		}
	sc.close();}
}