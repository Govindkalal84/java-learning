package gPratice;

import java.util.Scanner;

public class twoarray {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("r");
		int n=sc.nextInt();
		
		int[] arr1=new int[n];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		
		int[] arr2=new int[m];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i]=sc.nextInt();
		}
		ntg(arr1,arr2);
	}
	static void ntg(int[] arr1,int[] arr2)
	{
		int i=0;
		int j=0;
		while(i<arr1.length&& j<arr2.length)
		{
			if(arr1[i]==arr2[j])
			{
				System.out.println(arr1[i]);
				i++;
				j++;
			}
			else if(arr2[j]>arr1[i])
			{
				i++;
			}
			else {
				j++;
			}
		}
	}

}
