package gPratice;

import java.util.Scanner;

public class Stroe2array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("r");
		int n=sc.nextInt();
		
		
		int[] arr1= new int[n];
		for (int i = 0; i < arr1.length; i++) {
			
			arr1[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int[] arr2=new int[m];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i]=sc.nextInt();
		}
		int[] res=ntg(arr1,arr2);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i]+" ");
			
		}
		
	}
	static int[] ntg(int[] arr1,int[] arr2)
	{
		int i=0;
		int j=0;
		int k=0;
		int res[] =new int[arr1.length+arr2.length];
		
		while(i<arr1.length&& j<arr2.length)
		{
		
			if(arr2[j]>arr1[i])
			{
				res[k]=arr1[i];
				i++;
				k++;
			}
			else
			{
				res[k]=arr2[j];
				j++;
				k++;
				
			}
		}
	
			while(i<arr1.length)
			{
				
					res[k]=arr1[i];
					i++;
					k++;
			}
			while(j<arr2.length)
			{
				res[k]=arr2[j];
				j++;
				k++;
			}
		


		return res;
		
	}

}
