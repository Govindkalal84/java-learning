package gPratice;

import java.util.Scanner;

public class Sub4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("r");
		int n=sc.nextInt();
		int [] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		ntg(arr,k);
		
		
	}
	static void ntg(int[] arr,int k)
	{
		for (int i = 0; i < arr.length-k; i++) {
			for (int j = i; j < i+1; j++) {
				System.out.print(arr[j]);
				
			}
			System.out.print(arr[arr.length-1]);
			
		}
	}

}
