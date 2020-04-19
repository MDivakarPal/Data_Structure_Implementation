import java.util.*;
class Hashing
{
	class HashTable{
		int data;
		HashTable next;
		HashTable(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	static HashTable tab[]=new HashTable[10];
	static 
	{
		for(int i=0;i<10;i++)
			tab[i]=null;
	}
	public static void main(String[]a)
	{   Hashing h=new Hashing();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total no of key");
		int n=sc.nextInt();
		System.out.println("Enter your datas");
		for(int i=0;i<n;i++)
			h.chaining(sc.nextInt());
		
		h.printTab();
		
		System.out.println("Enter searching data");
		h.search(sc.nextInt());
	}
	
	public void chaining(int n)
	{
		//Hashing h=new Hashing();
		int index=(2*n+3)%10;
		if(tab[index]==null)
			tab[index]=new HashTable(n);
		else
		{
			HashTable start= tab[index];
			while(start.next!=null)
				 start=start.next;
			 start.next=new HashTable(n);
		}
	}
	
	void printTab()
	{
		for(int i=0;i<tab.length;i++)
		{
			HashTable start= tab[i];
			while(start!=null)
			{
				System.out.print(start.data+" ");
				start=start.next;
			}
		}
	}
	
	void search(int n)
	{
		int index = (2*n+3)%10;
		if(tab[index]!=null){
		if(tab[index].data==n)
		{
			System.out.println("Data found");
			return;
		}
		else if(tab[index].next!=null)
		{
			HashTable start=tab[index].next;
			while(start!=null)
			{
				if(start.data==n)
				{
					System.out.println("Data found");
					return;
				}
				else
					start=start.next;
			}
		}
		else
		{System.out.println("Data not found");
	   return;
		}
		}
		else
		{System.out.println("Data not found");
	return;
	    }
		System.out.println("Data not found");
		
	}
	
}