import java.util.*;
class LinkedListExp
{
	Node head;
}

class Node{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
	}
}

class CircularLinkedList
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String []a)
	{
		LinkedListExp list =new LinkedListExp();
		list.head=new Node(111);
		list.head.next=list.head;
		addNode(list,114);
		addNode(list,115);
		addNode(list,116);
		addNode(list,117);
		addNode(list,113);
		traverseNode(list);
		deleteNode(list);
	}
	
	static void addNode(LinkedListExp l,int data)
	{
		Node start = l.head;
		while(start.next != l.head){
		start=start.next;
		System.out.println("I am Calling");
		}
		start.next=new Node(data);
		start.next.next=l.head;
	}
	
	static void traverseNode(LinkedListExp l)
	{
		Node start = l.head.next;
		System.out.println(l.head.data);
		while(start != l.head)
		{
			System.out.println(start.data);
			start=start.next;
		}
		System.out.println(start.data);
	}
	
	static void deleteNode(LinkedListExp l)
	{
		System.out.println("Enter deleting element");
		int n=sc.nextInt();
		Node start = l.head;
		if(l.head.data == n)
		{
			Node start1 = l.head;
			while(start1.next != l.head)
				start1=start1.next;
			l.head=start.next;
			start1.next=l.head;
			System.out.println("Node deleted successfully");
			traverseNode(l);
			return;
		}
		while(start.next !=l.head )
		{
			if(start.next.data == n)
			{
				start.next=start.next.next;
				System.out.println("Node deleted successfully");
				traverseNode(l);
				return;
			}
            else
              start=start.next;				
		}
		System.out.println("Node deletion failed");
	}
}