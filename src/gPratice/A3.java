package gPratice;

import java.util.Scanner;

public class A3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("r");
		String str=sc.nextLine();
		
		special(str);
				
	}
	static void special(String str)
	{
		String t="";
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			
			if(ch>='a'&&ch<='z'|| ch>='A'&&ch<='Z'||ch>='0'&&ch<='9')
			{
				t=t+ch;
			}
			
		}
		System.out.println(t);
	}

}
