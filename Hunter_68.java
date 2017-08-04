import java.util.Scanner;

public class Hunter_68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the size of array");
		int num=sc.nextInt();
		System.out.println("Enter the Element");
		int temp[]=new int[num];
		int p=0;
		for(int i=0;i<num;i++) {
			temp[i]=sc.nextInt();
		}for(int j=0;j<num-1;j++) {
			
				int diff=Math.abs(temp[j]-temp[j+1]);
				if(p<diff) {
					p=diff;
				}
			}
		
			
		System.out.println("Largest difference "+p);
		
sc.close();	}

}
	