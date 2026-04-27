package gPratice;

import java.util.Scanner;

public class Prt {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("r");
	    int n=sc.nextInt();
	    
	    int[] arr=new int[n];
	    for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
	    
	    int m=sc.nextInt();
	    int[] arr1=new int[m];
	    for (int i = 0; i < arr1.length; i++) {
			arr1[i]=sc.nextInt();
		}
	    int[] res =ntg(arr,arr1);
	    for (int i = 0; i < res.length; i++) {
	    	System.out.print(res[i]);
			
		}
	}
	static int[] ntg(int[] arr,int[] arr1)
	{
		int i=0;
		int j=0;
		int k=0;
		int[] res=new int[arr.length+arr1.length]; 
		while(i<arr.length && j<arr1.length)
		{
			if(arr[i]<=arr1[j])
			{
				res[k]=arr[i];
				i++;
				k++;
				
			}
			else
			{
			res[k]=arr1[j];
			j++;
			k++;
			}
			
			}
		while(i<arr.length)
		{
			res[k]=arr[i];
			i++;
			k++;
		}
		while(j<arr1.length)
		{
			res[k]=arr1[j];
			k++;
			j++;
		}
		return res;
		}
	}


