package gPratice;

import java.util.Scanner;

public class A5 {
  public static void main(String[] args) {
	
	  Scanner sc=new Scanner(System.in);
	  System.out.println("r");
	  String str= sc.nextLine();
	  
	  remove(str);
}
  static void remove(String str)
  {
	  String t="";
	  int si=0;
	  int ei=0;
	  for (int i = 0; i <str.length(); i++) {
		  
		  if(str.charAt(i)!=' ')
		  {
			  si=i;
			  break;
		  }
		
	}
	  for(int i=str.length()-1;i>=0;i--)
	  {
		  if(str.charAt(i)!=' ')
		  {
			  ei=i;
			  break;
		  }
	  }
	  for(int i=si;i<=ei;i++)
	  {
		  if(str.charAt(i)!=' '||(str.charAt(i)==' '&&str.charAt(i+1)!=' '))
		  {
		  t=t+str.charAt(i);
	  }
	  }
	  System.out.println(t);
  }
 
  
}
