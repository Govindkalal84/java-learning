package gPratice;

import java.util.Scanner;

public class Subarraysum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("r");
		int n= sc.nextInt();
		
		
		int[] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			
		}
		int k=sc.nextInt();
		
		ntg(arr,k);
		
		
	}
	static void ntg(int[] arr,int k)
	
	{
		//int count=0;
		for (int size = 1; size <= arr.length; size++) {
			
			
			for (int i = 0; i <= arr.length-size; i++) {
				
				int sum=0;
				for (int j = i; j <i+size; j++) {
					sum=sum+arr[j];
					
				}
				if(sum==k) {
					for (int j = i; j < i+size; j++) {
						System.out.println(arr[j]);
						
					}
					System.out.println();
				}
//				System.out.println(count);
				
			}
///			System.out.println();
		}
		//System.out.println(count);
	}

}
 