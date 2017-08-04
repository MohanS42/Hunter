import java.util.Scanner;

public class NotPossible {
  
	public static void main(String[] args) {
		
	int num=0;
	String temp="",temp1="";
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number: ");
    num=sc.nextInt();
    temp=String.valueOf(num);
    num +=1;
    temp1=String.valueOf(num);
    if(temp.length()<temp1.length()) {
    	System.out.println("not possible");
    }else {
    	System.out.println(num);
}
sc.close();}
}	