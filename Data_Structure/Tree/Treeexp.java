import java.util.*;
class Node
{
	int data;
	Node left;
	Node right;
	Node()
	{
	 Scanner sc =new Scanner(System.in);
	 System.out.println("Enter Node data");
	 this.data=sc.nextInt();
	}
}

class TreeExp
{
	static Scanner sc =new Scanner(System.in);
	public static void main(String []a)
	{
		System.out.println("Enter size of tree");
		int n= sc.nextInt();
		if(n>0){
	Node root = new Node();
	for(int i=1; i< n; i++)
		addNode();
	}
	else
	System.out.println("Size of tree is not valid");	
	}
}