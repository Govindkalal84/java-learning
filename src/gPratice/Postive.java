package gPratice;

import java.util.Scanner;

public class Postive {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println(" r");
	int n=sc.nextInt();
	
	int[] arr=new int[n];
	for (int i = 0; i < arr.length; i++) {
		arr[i]=sc.nextInt();
		
	}
	ntg(arr);
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
		
	}
	}
	static void ntg(int[] arr)
	{
//		int i=arr.length-1;int j=arr.length-1;
//		while(i>=0 )
		
		int j=arr.length-1;
		
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]<0)
			{
				continue;
			}
			
			else
			{
			arr[j]=arr[i];
				//i--;
				j--;
			}
		}
//		while(j>=0)
		for( ;j>=0;j--)
		{
			arr[j]=-1;
//			j--;
		}
	}

}
