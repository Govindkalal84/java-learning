package gPratice;

import java.util.Scanner;

public class Lcm {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("r");
		int n=sc.nextInt();
		int k=sc.nextInt();
		int r =sc.nextInt();
		
		ntg(n,k,r);
	}
	static void ntg(int n,int k,int r) 
	
	{
		int count=0;
		for (int i = 1; i <=n; i++) {
			if(i%k==0&& i%r==0)
			{
				//System.out.println(i);
				count++;
			}
			
		}
		System.out.println(count);
	}
}


