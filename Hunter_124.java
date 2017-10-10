import java.util.Scanner;

public class Hunter_124 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		String str = sc.nextLine();
		String s = "([a-z]+[A-Z]+\\w+)+"; 
		System.out.println(str.matches(s));
sc.close();	}


}
