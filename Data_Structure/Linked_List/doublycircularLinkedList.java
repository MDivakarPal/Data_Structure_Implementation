class DoublyLinkedList
{
	Node head;
}
class Node
{
	Node prev;
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
	}
}
class DoublyLinkedListCircular
{
	public static void main(String [] a)
	{
		DoublyLinkedList list =new DoublyLinkedList();
		list.head=new Node(1115);
		list.head.next=list.head;
		list.head.prev=list.head;
	}
	static void addNode(DoublyLinkedList l, int data)
	{
		Node start = l.head;
		while(start.next != l.head)
			  start=start.next;
		start.next=new Node(data);
		start.next.prev=start;
		start.next.next=l.head;
		l.prev=start.next;
	}
	static void traverseNode(DoublyLinkedList l)
	{
		Node start = l.head;
	}
}