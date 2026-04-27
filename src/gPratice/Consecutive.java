package gPratice;

import java.util.Scanner;

public class Consecutive {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("r");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		ntg(arr);
	}
	static void ntg(int[] arr)
	
	{
		int count=1;int max=0;int ei=0;int si=0;
		for (int i = 0; i < arr.length-1; i++) {
			
			if(arr[i+1]-arr[i]==1)
			{
				count++;
				
			}
			else
			{
				if(count>max)
				{
				    max=count;	
				    ei=i;
				}
				//System.out.println(count+" ");
				count=1;
			}
			
		}
		if(count>max)
		{
			max=count;
			ei=arr.length-1;
		}
//		System.out.println(count);
	//	System.out.println(max);
		si=ei-max+1;
		for (int i = si; i <=ei; i++) {
			System.out.print(arr[i]+" ");
			
		}
	}

}
