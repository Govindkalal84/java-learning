package gPratice;

import java.util.Scanner;

public class ams1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("r");
		int n= sc.nextInt();
		int n1=sc.nextInt();
		
		ntgrr(n,n1);
	
	//boolean res =ams(n);
	//System.out.println(res);
	}
	
	static int countdigits(int n)
	{
		int count=0;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		return count;
	}
	static  boolean ams(int n) 
	{
		int original=n;
		int count=countdigits(n);
		int ams=0;
		while(n>0)
		{
			 int digit=n%10;
			ams =ams+(int)Math.pow(digit, count);
			n=n/10;
			
		}
		return ams==original;
	}
	static void ntgrr(int n,int n1)
	{
		
		for (int i = n1; i >=n; i--) {
			
			if(ams(i))
			{
				System.out.println(i);
				return;
			}
			
		}
	}
	static void upto(int n)
	{
		int count=0;
		
		for (int i = 1; count < n; i++) {
			
			if(ams(i))
			{
				System.out.println(i);
				count++;
			}
			
		}
	}
	static void max(int n, int n1)
	{
		int max=-1;
		for (int j = n; j <=n1; j++) {
			
		
		if(ams(j)) {
			max=j;
			
		}
	}
		if(max!=-1)
		{
			System.out.println(max);
		}

}
	}
