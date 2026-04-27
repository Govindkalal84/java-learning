package gPratice;

import java.util.Scanner;

public class Merage {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("r");
	int n=sc.nextInt();
	
	int[] arr1=new int[n];
			for (int i = 0; i < arr1.length; i++) {
				arr1[i]=sc.nextInt();
			}
			
			int n1=sc.nextInt();
			
	 int[] arr2 =new int[n1];
	 for (int i = 0; i < arr2.length; i++) {
		arr2[i]=sc.nextInt();
	}
	 int[] result=ntg(arr1,arr2);
	 for (int i = 0; i < result.length; i++) {
		 
		 System.out.println(result[i]);
		
	}
}
static int[] ntg(int[] arr1 ,int[] arr2)
{
	int i=0;
	int k=0;
	int j=0;
	int[] result=new int[arr1.length+arr2.length];
	
	while(i<arr1.length && j<arr2.length)
	{
		if(arr1[i]<=arr2[j])
			
		{
			result[k]=arr1[i];
			i++;
			k++;
		}
		else
		{
			result[k]=arr2[j];
			j++;
			k++;
		}
		
	}

	
	while(i<arr1.length)
	{
		result[k]=arr1[i];
		i++;
		k++;
	}
	while(j<arr2.length)
	{
		result[k]=arr2[j];
		j++;
		k++;
		
	}
	return result;
}

}
