package gPratice;

import java.util.Scanner;

public class factors {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("r");
		int k=sc.nextInt();
		int n=sc.nextInt();
		int n1=sc.nextInt();
		
	ntg(k,n,n1);
	}
	public static void ntg(int k,int n,int n1)
	{
		int count=0;
		for (int i = 1; count <k; i++) {
			if(n%i==0&& n1%i==0)
			{
				System.out.println(i);
				count++;
			}
			
		}
	}

}
