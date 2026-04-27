package gPratice;

import java.util.Scanner;

public class Resultant1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("r");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int res[]=ntg(arr);
		for (int s = 0; s < res.length; s++) {
			System.out.println(res[s]);
			
		}
		
	}
	static int[]  ntg(int[] arr)
	{
		int p=1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0)
			{
			p=p*arr[i];
			
		}}
	
		int[] res=new int[arr.length];
		for (int i = 0; i < res.length; i++) {
			
			if(arr[i]!=0)
			{
			res[i]=p/arr[i];
			
		}}
	
	return res;
	}
}
