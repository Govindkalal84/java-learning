package gPratice;

import java.util.Scanner;

public class A1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("r");
		String str=sc.nextLine();
		
		vowels(str);
		
	}
	
	static void vowels(String str)
	{
		int cc=0;
		int vc=0;
		int nc=0;
		int sc=0;
		for (int i = 0; i < str.length(); i++) {
			
			char ch=str.charAt(i);
			if(ch>='a'&& ch<='z'|| ch>='A'&&ch<='Z')
			{
			if(ch=='a'|| ch=='e'|| ch=='i' || ch=='o'|| ch=='u'||
				ch=='A'|| ch=='E'|| ch=='I' || ch=='O'|| ch=='U')
			{
			    cc++;
			}
			else
			{
				vc++;
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
		System.out.println(sc);
	}

}
