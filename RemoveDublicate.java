import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class RemoveDublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String input="";
		System.out.println("Enter the String: ");
		input=sc.next();
		HashSet<Character> it=new HashSet<Character>();
	    for(int i=0;i<input.length();i++) {
	    	it.add(input.charAt(i));
	    }
	    Iterator<Character> mp=it.iterator();
	    while(mp.hasNext()) {
	    	System.out.print(mp.next());
	    }
		
	sc.close();}

}
