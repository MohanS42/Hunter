package Beginner;

import java.util.Scanner;

public class Re {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,siz=0,temp1=0,temp=0;
     
		Scanner sc=new Scanner(System.in);
            System.out.println("Enter the size of array:");
            
       siz=sc.nextInt();
       int arr[]=new int[siz];
       System.out.println("Enter the numbers");
       for(i=0;i<siz;i++) 
    	    arr[i]=sc.nextInt();
       {
	for(i=0;i<siz;i++){
    	   for( j = i+1;j<siz;j++){
    		   if(arr[i]==arr[j])
    		   {
    			   temp=arr[i];
    			   temp1=1;
    			   break;
    		   }
    	   }}
    	   if(temp1==1)
    	   {
    		   System.out.println("Repeated number is:"+temp);
    	   }	   
    	 sc.close();
	}

       }}                 