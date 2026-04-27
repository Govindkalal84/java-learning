package gPratice;

import java.util.Scanner;

public class Arms {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("r");
		int n=sc.nextInt();
		int n1=sc.nextInt();
		
		ntg(n,n1);
		
			}
	static int  countdigits(int n)
	{
		int count=0;
		
		while(n>0)
		{
			n=n/10;
			count++;
		}
            return count;
	}

	
	static boolean ams(int n)
	{
		int count=countdigits(n);
		int ams=0;
		int orginal=n;
		
		while(n>0)
		{
			int last=n%10;
			ams=ams+(int)Math.pow(last,count);
			
			n=n/10;
			
		}
		
		return ams==orginal;
	}
	
	static void ntg(int n,int n1)
	{
		int count=0;
	for(int i=n;i<=n1;i++)
	{
		if(ams(i))
		{
			//System.out.println(i);
			count++;
		}
	}
	System.out.println(count);
	}
}