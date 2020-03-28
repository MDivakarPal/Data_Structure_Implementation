class LinkedListE
{
	Node head;
}
class Node
{
	int data;
	Node next;
	Node( int data)
	{
		this.data=data;
	}
}

class TwoListJoinig
{
	public static void main(String []a)
	{
		LinkedListE list1 = new LinkedListE();
		LinkedListE list2 = new LinkedListE();
		list1.head=new Node(101);
		addNode(list1,102);
		addNode(list1,103);
		addNode(list1,104);
		addNode(list1,105);
		addNode(list1,106);
		addNode(list1,107);
		System.out.println("List 1");
		traverseNode(list1);
		list2.head=new Node(201);
		addNode(list2,202);
		addNode(list2,203);
		addNode(list2,204);
		addNode(list2,205);
		addNode(list2,206);
		addNode(list2,207);
		System.out.println("List 2");
		traverseNode(list2);
		System.out.println("Joined list is -");
		joinList(list1,list2);
		traverseNode(list1);
	}
	
	static void addNode(LinkedListE l,int data)
	{
		Node next1=l.head;
		while(next1.next != null)
              next1=next1.next;
        next1.next=new Node(data);
        //System.out.println(next1.data);		
	}
	
	static void traverseNode(LinkedListE l)
	{
		Node start= l.head;
		while(start != null){
			System.out.println(start.data);
			start=start.next;
		}
	}
	
	static void joinList(LinkedListE l1,LinkedListE l2)
	{
		Node start = l1.head;
		//Node end = l2.head;
		while(start.next != null){

		start=start.next;}
		start.next=l2.head;
	}
}

