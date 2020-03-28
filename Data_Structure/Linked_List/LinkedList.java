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
	public static void main(String a[])
	{
		LinkedListExp list1=new LinkedListExp();
		list1.head=new Node(1);
		Node second=new Node(2);
		Node third =new Node(3);
		Node fourth =new Node(4);
		Node fifth =new Node(5);
		list1.head.next= second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		//fifth.next=null;
		linkedListTraverse(list1);
		//System.out.println(second.);
	}
	
	static void linkedListTraverse(LinkedListExp l)
	{
	   Node next1=l.head;
	   do
	   {
		   System.out.println(next1.data);
		   next1=next1.next;
	   }while(next1.next !=null);
	   System.out.println(next1.next);
	}
}
