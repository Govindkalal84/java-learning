package gPratice;

import java.util.Scanner;

public class Subarray1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("r");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
			
			
			
		
		ntgr(arr);
	}
	static void ntg(int[] arr,int size)
	{
		for (int i = 0; i <=arr.length-size; i++) {
			for (int j = i; j < i+size; j++) {
				System.out.print(arr[j]+" ");
			}
			System.out.println();
			
		}
	}
	static void ntgr(int[] arr)
	{
		for (int size = 0; size < arr.length; size++) {
			ntg(arr,size);
		}
	}

}
