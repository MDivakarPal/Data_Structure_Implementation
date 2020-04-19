import java.util.*;

class Hashing
{
	
	static String tab[]=new String[10];
	public static void main(String a[])
	{
		Hashing h=new Hashing();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total no of key");
		int n=sc.nextInt();
		System.out.println("Enter your datas");
		for(int i=0;i<n;i++)
			h.linearProbs(sc.nextInt());
		
		h.printTab();
		System.out.println("Enter searching data");
		h.search(sc.nextInt());
	
	}
	
	// Linear Probs
	
	void linearProbs(int n)
	{
		int u=(2*n+3)%10;
		for(int i=0;i<10;i++)
		{
			if(tab[(u+i)%10]==null)
			{
				tab[(u+i)%10]=String.valueOf(n);
				break;
			}
		}
	}
	
	void printTab()
	{
		for(int i=0;i<10;i++)
			System.out.print(tab[i]+" ");
	}
	
	void search(int n)
	{
		int index=(2*n+3)%10;
		if(tab[index]==String.valueOf(n))
		{
			System.out.println("Data found");
			return;
		}
		else 
		{
			for(int i=0;i<10;i++)
			{
				if(tab[(index+i)%10]==String.valueOf(n))
					{
						System.out.println("Data found");
					    return;
					}
			}
		}
		
		System.out.println("Data not found");
	}
	
}