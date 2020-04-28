import java.util.*;
class Node{
	int data;
	Node left,right;
	Node(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}

class Test
{
	static Scanner sc=new Scanner (System.in);
	static List <Node> list=new ArrayList<Node> ();
	static int front=-1,rear=0;
	public static void main(String[]a)
	{
		int n,i=1;
		System.out.println("Enter total no of nodes");
		n=sc.nextInt();
		Node root;
		if(n>=1){
		System.out.println("Enter nodes");
		if(i==1){
			root=new Node(sc.nextInt());
			front++;
			list.add(front,root);
			for(int j=1;j<n;j++)
			insertNode(list.get(rear),sc.nextInt());
		}		
		System.out.println("Level order traversing of the tree");
		System.out.println("In order traversing of the tree");
		inOrder(list.get(0));
		System.out.println(checkBst(list.get(0)));
		printList1();
		}
		else
			System.out.println("Enter size is not valid");
	}
	
	
	static void inOrder(Node root)
	{
		if(root!=null)
		{
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
	}
	
	static void insertNode(Node root,int data)
	{
		if(root.left==null)
		{
			root.left=new Node(data);
			front++;
			list.add(front,root.left);
		}
		else if(root.right ==null)
		{
			root.right=new Node(data);
			front++;
			list.add(front,root.right);
			//list.remove(rear);
			rear++;
		}
	}
		static List<Integer> list1=new ArrayList<Integer>();
	public static boolean checkBst(Node root)
	{
		boolean res=true;
		int i=0;
		if(root!=null)
		{
			checkBst(root.left);
            list1.add(i,root.data);
			i++;
			inOrder(root.right);
		}
		return res;
	}
	
	public static void printList1()
	{
		    int i=0;
		    for( i=0;i<list1.size();i++)
			System.out.println(list1.get(i));
	}
}
