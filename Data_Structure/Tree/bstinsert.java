/*
BST- BST stands for Binary Search Tree.
in BST data of root is always greater than data of left node and less than data of right
*/


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

class BSTInsert
{
	public static void main(String[]a)
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter total no of nodes");
	   Node root=null;
	   int n=Integer.parseInt(sc.next());
	   System.out.println("Enter data");
	   for(int i=0;i<n;i++)
		   root=bstinsert(root,sc.nextInt());
	   inOrder(root);
	   int h=height(root);
	   System.out.println("Height = "+(h-1));
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
	
	
	// Height of BST
	static int height(Node root)
	{
		if(root == null)
			return 0;
		else
		{
			int l=height(root.left);
			int r=height(root.right);
			if(l>r)
				return l+1;
			else
				return r+1;
		}
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
}