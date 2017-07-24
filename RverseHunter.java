import java.util.Scanner;

public class RverseHunter {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub

	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the String: ");
	     	String temp=sc.next();
	     	StringBuilder in=new StringBuilder(temp);
	     	in.append(temp);
	     	in=in.reverse();
	      for(int i=0;i<temp.length();i++) {
	    	
	System.out.print( in.charAt(i));}
	
	// System.out.print("\n"+str);


	 sc.close();  }
		
	}




