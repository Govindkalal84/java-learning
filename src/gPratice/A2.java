package gPratice;

import java.util.Scanner;

public class A2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("r");
		String str= sc.nextLine();
		
		ntg(str);
	}
	static void ntg(String str)
	{
		String t="";
		for (int i = 0; i < str.length(); i++) {
			
		char ch=str.charAt(i);
		if(ch>='A'&& ch<='Z')
		{
		t=t+(char)+(ch+32);
		}
		else if(ch>='a'&& ch<='z')
		{
			t=t+(char)(ch-32);
		}
			
		
		else
		{
			t=t+ch;
		}
		}
		System.out.println(t);
	}
   

}
