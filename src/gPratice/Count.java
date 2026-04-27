package gPratice;

import java.util.Scanner;

public class Count {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("r");
	int k=sc.nextInt();
	ntg(k);
}
static void ntg(int k)
{
	int sum=0;
	while(k>0)
	{
		int digit=k%10;
		sum=sum*10+digit;
		k=k/10;
		
	
	}
	System.out.println(sum);
	
}
}
