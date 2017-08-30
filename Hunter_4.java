import java.util.Scanner;

public class Hunter_4 {

  public static void main(String[] args) {
	  
	  int count=0;
	  Scanner sc = new Scanner (System.in);
	  int n = sc.nextInt();
	  int a[] = new int[n];
	  for(int i=0;i<n;i++) {
		  a[i] = sc.nextInt();
	  }
	  for(int j=0;j<a.length;j++) {
		  count=0;
		  for(int k=0;k<a.length;k++) {
			  if(j!=k && a[j]==a[k]) {
				  count++;
			  }
		  }if(count==0) {
			  System.out.println(a[j]);
		  }
	  }
 sc.close(); }
}

