package skilrack;

import java.util.Scanner;

public class Skip_Bad_tiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int k=0;
	    int count = 0;
	    String []str = new String[n];
	    for(int i=0;i<str.length;i++) {
	    	str[i] = sc.next();
	    }
	    while( k<n-1) {
	    	if(k > str.length-3) {
	    		k+=1;
	    	}else {
	    		k+=2;
	    	}
	    	if(!str[k].equals("B")) {
	    		count++;
	    	}else {
	    		k -=1;
	    		count++;
	    	}
	    }
	    	System.out.println(count);
	    	sc.close();}
}



/*INPUT
 * 7
 * G G B G G B G
 * OUTPUT
 * 4 
 */

