package gPratice;

import java.util.Scanner;

public class D123O {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("r");
		int n=sc.nextInt();
		
		
		int[] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		occur(arr);
	}
	static void occur(int[] arr)
	{
		int count=1;
		int maxcount=1;
		int res=arr[0];
		
		for (int i = 0; i < arr.length-1; i++) 
		{
			if(arr[i]==arr[i+1])
			{
				count++;
		}	
			else
			
			{
				if(count>maxcount)
				{
					maxcount=count;
					res=arr[i];
				//System.out.println(arr[i]+" "+count);
				}
			     count=1;
		}}
		if(count>maxcount)
		{
		//System.out.println(arr[arr.length-1]+" "+count);
			maxcount=count;
			res=arr[arr.length-1];
	}
		System.out.println(res+" "+maxcount);
	}
	static void occur1(int[] arr)
	{
		
		
		for (int i = 0; i <arr.length-1; i++) 
		{
			if(arr[i]!=arr[i+1])
			{
				System.out.println(arr[i]);
			
		}	
			
			

}
		System.out.println(arr[arr.length-1]);
	}
}
