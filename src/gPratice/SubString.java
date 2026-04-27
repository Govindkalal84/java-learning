package gPratice;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("r");
		String str=sc.nextLine();
		String  str1=sc.nextLine();
		
		//String res=substring(str,str1);
		int res=substrings(str,str1);
		
		System.out.println(res);
	}
	static String substring(String str,String str1)
	{
	int size=str1.length();
	
		for (int i = 0; i <=str.length()-size; i++) {
			
			String t="";
			for (int j = i; j < i+size; j++) {
				
				t=t+str.charAt(j);
				
			}
			
		
		
		if(t.equals(str1))
		{
			return "yes";
		}
		
		
	}
		return "no";
	
	}
	static int substrings(String str,String str1)
	{
	int size=str1.length();
	int count=0;
	
		for (int i = 0; i <=str.length()-size; i++) {
			
			String t="";
			for (int j = i; j < i+size; j++) {
				
				t=t+str.charAt(j);
				
			}
			
		
		
		if(t.equals(str1))
		{
			count++;
			
		}
		
		
	}
		return count;
	}
}