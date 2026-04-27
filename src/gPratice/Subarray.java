package gPratice;

import java.util.Scanner;

public class Subarray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("s");
	int n=sc.nextInt();
	
	int[] arr=new int[n];
	for (int i = 0; i < arr.length; i++) {
		arr[i]=sc.nextInt();
		
	}
	int size=sc.nextInt();
	int k=sc.nextInt();
	
	ntg(arr,size,k);
}

static void ntg(int[] arr,int size,int k)
{
	 //int count=0;
	for (int i = 0; i <= arr.length-size; i++) {
		
		int sum=0;
		for (int j = i; j < i+size; j++) {
			
			sum=sum+arr[j];
//			System.out.print(arr[j]);
		}
			if(sum==k)
			{
				for (int j = i; j < i+size; j++) {
					System.out.print(arr[j]);
					
				}
				System.out.println();
			}
			
		}
	
		
	

}
}
