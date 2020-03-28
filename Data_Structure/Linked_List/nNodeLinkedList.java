import java.util.*;
class LinkedListExp
{
	Node head;
}
	class Node{
		int data;
		Node next;
		Node ()
		{ 
		    Scanner sc= new Scanner(System.in);
		    System.out.println("Enter node data");
			this.data=sc.nextInt();
		}
}
class LinkedListMain{
static LinkedListExp list1=new LinkedListExp();
static Scanner sc=new Scanner(System.in);
	public static void main(String a[])
	{
		System.out.println("Enter Total No of Nodes");
		int n=sc.nextInt();
	    list1.head=new Node();
        for (int i=1;i<n;i++)
		{
          addnode(list1);
		}
		//linkedListTraverse(list1);
		update(list1);
		linkedListTraverse(list1);
		System.out.println(nodeSearch(list1).data);
		//nodeDelete(list1);
		//linkedListTraverse(list1);
		//System.out.println(second.);
	}
	
	// Traversing
	static void linkedListTraverse(LinkedListExp l)
	{
	   System.out.println("Inputed nodes are");
	   Node next1=l.head;
	   do
	   {
		   System.out.println(next1.data);
		   next1=next1.next;
	   }while(next1!=null);
	   //System.out.println(next1);
	}
	
	// Add 
	static void addnode(LinkedListExp l)
	{
		Node next1=l.head;
		while(next1.next != null)
              next1=next1.next;
        next1.next=new Node();
        //System.out.println(next1.data);		
	}
	
	
	// Updation
	static void update(LinkedListExp l)
	{
		System.out.println("Enter your updating element");
		int data1=sc.nextInt();
		Node next1= l.head;
		while(next1 != null)
		{
			if(next1.data== data1)
			{
				System.out.println("Enter your new data value");
				next1.data=sc.nextInt();
			    break;
			}
			else
			{
				next1=next1.next;
			}
		}
		System.out.println("Inputed data value is not available in list");
	}
	
	// Searching in singly linked list
	static Node nodeSearch(LinkedListExp l)
	{
	   Node next1= l.head;
       System.out.println("Enter your Searching element");
	   int data=sc.nextInt();
	   Node loc=null;
	   while(next1 != null)
	   {
		   if(next1 .data == data) 
		   {
			   loc=next1;
			   System.out.println("data found");
			   return loc;
			   //break;
		   }
		   else
		     next1=next1.next;		   
	    }
       	 return loc;   
	}
	
	// Deletion in singly linked list
	static void nodeDelete(LinkedListExp l)
	{
		Node loc= nodeSearch(l);
		 while(loc != null)
		 {
			 loc.data=loc.next.data;
			 Node cLoc=loc.next;
			 loc.next=loc.next.next;
			 loc=cLoc;
		 }
	}
}
/*
Updation
Add
Delete
Traversing
*/