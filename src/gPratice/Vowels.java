package gPratice;

import java.util.Scanner;

public class Vowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("r");
		String str=sc.nextLine();
		
		
		spaceCount(str);
		
	}
	static void ntg(String str)
	{
		
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			
		
		char ch=str.charAt(i);
		if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'|| ch=='u'||
				ch=='A'|| ch=='E'|| ch=='I'||ch=='O'|| ch=='U')
		{
			count++;
		}
		}
		System.out.println(count);
				
	}
	
	// Consonent count 
	
	
	static void consonants(String str)
	{
		int cc=0;
		int vc =0;
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			
			if(ch>='a'&& ch<='z'|| ch>='A'&& ch<='Z')
			{
				if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'|| ch=='u'||
						ch=='A'|| ch=='E'|| ch=='I'||ch=='O'|| ch=='U')
				{
					vc++;
				}
				else {
				cc++;
			}
			}
		}
		System.out.println(cc);
	}
	static void spaceCount(String str)
	{
		int cc=0;
		int vc =0;
		int nc =0;
		int sc=0;
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			
			if(ch>='a'&& ch<='z'|| ch>='A'&& ch<='Z')
			{
				if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'|| ch=='u'||
						ch=='A'|| ch=='E'|| ch=='I'||ch=='O'|| ch=='U')
				{
					vc++;
				}
				else {
				cc++;
			}
			}
			else if(ch>='0'&& ch<='9')
			{
				nc++;
			}
			else if(ch!=' ')
			{
				sc++;
			}
		}
		System.out.println(vc);
		System.out.println(nc);
		System.out.println(cc);
		System.out.println(sc);
	}

}
