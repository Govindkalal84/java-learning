package gPratice;

import java.util.Scanner;

public class P02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("r");
		int n=sc.nextInt();
		int m=sc.nextInt();
//		
         bet(n,m);
	}
	static boolean prime(int n)
	{
	
		for (int i = 2; i*i <=n; i++) {
			
			if(n%i==0)
			{
				return false;
			}		
		}
		return true;
	}
	static void bet(int n,int m)
	{
		//int count=0;
		for (int i = 0; i <=m; i++) {
			
			if(prime(i))
			{
			  System.out.println(i);
			}
			
		}
		//System.out.println(count);
	}

}
