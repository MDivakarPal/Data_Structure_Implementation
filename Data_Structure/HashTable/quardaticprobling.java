/*
In this method insert ki key at first free location from (u+i^2)% 
where i=0 to m-1 and u is calculated location using given hash 
function.
*/

import java.util.*;

class Hashing
{
	 static String a1[]=new String[10];
	{
		for(int i=0;i<10;i++)
			a1[i]=null;
	}
	public static void main(String []a)
	{
		System.out.println("Enter total no of keys");
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		System.out.println("Enter your keys");
		for(int i=0;i<m;i++)
			quardatic(sc.nextInt());
		printTab();
		
		System.out.println("\n Enter your searching number");
		search(sc.nextInt());
	}
	
	static void quardatic(int n)
	{
		int u=(2*n+3)%10;
		for(int i=0;i<9;i++)
		{
			if(a1[(u+(i*i))%10]==null)
			{
				a1[(u+(i*i))%10]=String.valueOf(n);
				break;
			}
		}
	}
	
	static void printTab()
	{
		for(int i=0;i<a1.length;i++)
			System.out.print(a1[i]+" ");
	}
	
	static void search(int n)
	{
		int u=(2*n+3)%10;
		if(a1[u]==String.valueOf(n))
		{
			System.out.println("Data found");
			return;
		}
		else
		{
			for(int i=1;i<10;i++)
			{
				if(a1[(u+(i*i))%10]==String.valueOf(n))
				{
					System.out.println("Data found");
					return;
				}	
			}
		}
		
		System.out.println("Data not found");
	}
}