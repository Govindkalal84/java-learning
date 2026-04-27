package gPratice;

import java.util.Scanner;

public class Rearrange1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("r");
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
		int i=0;
		int j=0;
		while(i<arr.length) 
		{
			if(arr[i]<0)
			{
				i++;
				
			}
			else
			{
				arr[j]=arr[i];
				i++;
				j++;
			}
		}
		while(j<arr.length)
		{
			arr[j]=-1;
			j++;
		}
		
		
	}
	static void ntgr(int[] arr)
	{
		int j=0;
	for (int i = 0; i < arr.length; i++) {
		
		if(arr[i]<0)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			j++;
		}
			
	}	
	}
	static void ntgrr(int[] arr)
	{
		int i=0;
		int j=0;
		while(i<arr.length)
		{
			if(arr[i]==0)
			{
				i++;
			}
			else
			{
				arr[j]=arr[i];
				i++;
				j++;
			}
			
		}
		while(j<arr.length)
		{
			arr[j]=0;
			j++;
		}
		
	}
}
