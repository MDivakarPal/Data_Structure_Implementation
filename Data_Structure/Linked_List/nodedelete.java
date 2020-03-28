import java.util.*;
class LinkedListExp
{
	Node head;
}
	class Node{
		int data;
		Node next;
		Node (int d)
		{
			this.data=d;
		}
	}


class LinkedListMain{
	static Scanner sc = new Scanner(System.in);
	public static void main(String a[])
	{
		LinkedListExp list1=new LinkedListExp();
		list1.head  = new Node(1);
		Node second = new Node(2);
		Node third  = new Node(3);
		Node fourth = new Node(4);
		Node fifth  = new Node(5);
		list1.head.next= second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		linkedListTraverse(list1);
		nodeDelete(list1);
        
	}
	
    static void nodeDelete(LinkedListExp l)
	{
		System.out.println("Enter deleting node");
		Node next1 =l.head;
		int n=sc.nextInt();
		 if(next1.data == n)
		 {
		   l.head=next1.next;
		   linkedListTraverse(l);
	       return;
	     }
		while(next1.next != null)
		{
			if( next1.next.data== n)
			{
				next1.next.gc();
			    next1.next=next1.next.next;
				linkedListTraverse(l);
				return;
			}
			else
				next1=next1.next;
		}
		System.out.println("Node not found");
	}
	
	static void linkedListTraverse(LinkedListExp l)
	{
	   System.out.println("Inputed nodes are");
	   Node next1=l.head;
	   do
	   {
		   System.out.println(next1.data);
		   next1=next1.next;
	   }while(next1!=null);
	}
}
