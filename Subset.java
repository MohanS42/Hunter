import java.util.Arrays;
import java.util.Scanner;

public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int temp=0;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the size of array");
   int s=sc.nextInt();
   int arr[]=new int[s];
   System.out.println("Enter the 1st array: ");
   for(int i=0;i<s;i++) {
	   arr[i]=sc.nextInt();
   }
   System.out.println("Enter the 2nd Array: ");
   int m=sc.nextInt();
   int arrr[]=new int[m];
   for(int j=0;j<=m;j++) {
	   arrr[j]=sc.nextInt();
	   Arrays.sort(arr);
	   Arrays.sort(arrr);
	   for(int i=0;i<s-m;i++) {
		   for( j=0;j<m;j++) {
			   if(arr[i]==arrr[j]) {
				   arr[i]=-1;
				   temp++;
			   }
				   
			   }if(temp==m) {
				   System.out.println("subset");
			   }else 
				   System.out.println("not subset");
			   
		   }
	   }
   }
	}


