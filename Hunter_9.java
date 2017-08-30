import java.util.Scanner;

public class Hunter_9 {

	public static void hunter(int[] arr) {
		int n1=0,n2=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				n1=arr[i]+arr[j];
				n2=arr[i]-arr[j];
				if( n1==0 || n2==0 ) {
					System.out.println(arr[i]+" "+arr[j]);
				}
				
			}
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		hunter(arr);
	sc.close();}
}
