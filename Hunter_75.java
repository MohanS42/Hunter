import java.util.Scanner;

public class Hunter_75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size=sc.nextInt();
		System.out.println("Eneter the element: ");
		int a[]=new int[size];
		for(int i=0;i<size;i++) {
			        a[i]=sc.nextInt();
		  }for(int j=0;j<size;j++) {
			      if(j==size-1) {
				  System.out.print(-1+" ");
				  break;
			}
			if(a[j]>a[j+1]) {
				System.out.print(a[j+1]+" ");
			}else if((a[j]<a[j+1]))
				System.out.print(-1+" ");
			}
	sc.close();	} 	
	}


