import java.util.*;
class Node
{
  int data ;
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
    static int n=0;
    static Node root=null;
	static Node res[]=new Node[2];
	public static void main(String[]a)
	{
		Test t=new Test();
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter total no of nodes");
	   n=Integer.parseInt(sc.next());
	   System.out.println("Enter data");
	   for(int i=0;i<n;i++)
		   root=bstinsert(root,sc.nextInt());
	    System.out.println("Traversing is ");
		inOrder(root);
	   res[1]=root;
       res[0]=null;
	   System.out.println("Enter deleting element ");
	   int d=sc.nextInt();
	   search(root,d);
	   if(res[0]!=null)
	   {
		System.out.println("\nRoot element is "+res[1].data+" \t Search element is "+res[0].data );
		t.delete(res[0],d);
       }
		else 
			System.out.println("\nData not found");		
    }
	// Insertion in Bst
	static Node bstinsert(Node root, int data)
	{
		if(root==null)
			root=new Node(data);
		else
		{
			if(root.data>data)
			{
				if(root.left !=null)
					bstinsert(root.left,data);
				else
					root.left=new Node(data);
			}
			else
			{
				if(root.right !=null)
					bstinsert(root.right,data);
				else
					root.right=new Node(data);
			}
		}
		return root;
	}
	// Search
	static Node[] search(Node root , int data)
	{
		if(root.data==data)
		{
			res[0]=root;
			return res;
		}
		else
		{
			if(root.left!=null && root.data > data)
			{
				res[1]=root;
				search(root.left,data);
			}
			else
			{
				if(root.right!=null && root.data<data)
				{
					res[1]=root;
					search(root.right,data);
				}
			}
		return res;	
		}
	}
	static Node pre=null;
	static int st=0;
	static void predecessor(Node parent,Node root)
	{
			if(root.right==null)
			{
				if(st==0)
				parent.left=null;
			else
			{
				parent.right=null;
			}
				pre=root;
				System.out.println("Matched "+pre.data);
				
			}
			else
			{	
		    st=1;
		    predecessor(root,root.right);
		    }
	}
	// Traversing of BST
	static void inOrder(Node root)
	{
		if(root!=null)
		{
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
	}
	
	
	// Deletion 
	void delete(Node root1, int data)
	{
		// CASE 1 left and right both subtrees are empty
		if(root1.left == null && root1.right==null)
		{
			if(root1 == res[1])
			{
			root=null;
			}
			else{
			if(res[1].data>data)
				res[1].left=null;
			else
			res[1].right=null;
			}
		}
		else if(root1.left!=null && root1.right==null)		// CASE 2 Only right subtree is empty
		{
			if(res[1].data>data)	
			{res[1].left=root1.left;root1.left=null;}
			else
			{res[1].right=root1.left;
		    root1.left=null;
			}
			
		}
		else if(root1.left==null && root1.right!=null)		// CASE 2 Only left subtree is empty
		{
			if(res[1].data>data)	
			{res[1].left=root.right;root.right=null;}
			else
			{
			res[1].right=root1.right;
		    root1.right=null;
			}
			
		}
		else if(root1.right!=null && root1.left!=null)		// CASE 3 each subtrees are non empty
		{
			predecessor(root1,root1.left);
			pre.left=root1.left;
			pre.right=root1.right;
		   	if(root1==root)
			{
				System.out.println("I am");
				root=pre;
			}
			else
			{
			if(res[1].data>data)
				res[1].left=pre;
			else
			res[1].right=pre;
			}
		}
		System.out.println("After deletion your tree is");
		inOrder(root);
	}
}