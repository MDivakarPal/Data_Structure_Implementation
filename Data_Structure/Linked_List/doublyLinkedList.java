class DoublyLinkedList
{
	Node head;
}

class Node
{
	Node prev;
	int data;
	Node next;
	Node(int data){
		this .data=data;
	}
}

class DoublyLinkedListMain
{
	public static void main(String []a){
	DoublyLinkedList list1=new DoublyLinkedList();
	list1.head=new Node(101);
	addNode(list1,102);
	addNode(list1,103);
	addNode(list1,104);
	addNode(list1,105);
	addNode(list1,106);
	System.out.println("List is ");
	traverseForward(list1);
	}
	
	static void addNode(DoublyLinkedList l, int data)
	{
		Node start = l.head;
		//Node prev =null;
		while (start.next != null)
		{
			  start=start.next;
		}
		start.next=new Node(data);
		start.next.prev=start;
	}
	
	static void traverseForward(DoublyLinkedList l)
	{
		Node start=l.head.next;
		while(start != null)
		{
			System.out.println(start.data+" , "+start.prev.data);
			start=start.next;
		}
	}
	
}