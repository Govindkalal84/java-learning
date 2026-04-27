package gPratice;

import java.util.Scanner;

public class Maxoccurance {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("r");
		int n=sc.nextInt();
		
		int[] arr= new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		ntg(arr);
	}
	static void ntg(int[] arr)
	{
		
		int maxcount=1;
		int res=arr[0];
		int count=1;
		for(int i=0;i<arr.length-1;i++)
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
				
			}  
				count=1;
		}                          
		}
		if(count>maxcount)
			
		{
			maxcount=count;
			res=arr[arr.length-1];
		
	}
		System.out.println(res+" "+maxcount);

}
}
