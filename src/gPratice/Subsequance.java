package gPratice;

import java.util.Scanner;

public class Subsequance {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("r");
		String str=sc.nextLine();
		String str1=sc.nextLine();
		
	String res=	subsequance(str,str1);
	System.out.println(res);
		
				
	}
	static String subsequance(String str,String str1)
	{
		int i=0;
		int j=0;
		while(i<str.length()&& j<str1.length())
		{
			if(str.charAt(i)==str1.charAt(j))
			{
				i++;
				j++;
			}
			else
			{
				i++;
			}
		
		}
		if(j==str1.length())
		{
			return "yes";
		}
		else {
			return "no";
		}
	
	}
}
