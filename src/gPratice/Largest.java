package gPratice;

import java.util.Scanner;

public class Largest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("r");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		int res=ntg(arr);
		System.out.println(res);
		
	}
	static int ntg(int[] arr)
	{
		int max=Integer.MIN_VALUE;
		int sec=Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]>max)
			{
				sec=max;
				max=arr[i];
			}
			else if(arr[i]>sec&& arr[i]!=max)
			{
				sec=arr[i];
			}
			
		}
		return max+sec;
	}

}
