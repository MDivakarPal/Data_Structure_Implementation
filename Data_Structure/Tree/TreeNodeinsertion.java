/*
Node insertion and Traversing
*/

import java.util.*;
class Tree
{
	int data;
	Tree left,right;
	Tree(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}

class NodeInsert
{
	static Scanner sc=new Scanner (System.in);
	static Tree head=null, root;
	public static void main(String []a)
	{
		System.out.println("Enter total no of nodes");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
			insertNode();
		System.out.println("In order Traversal");
		inorder(head);
		System.out.println("\nPost order Traversal");
		System.out.println();
		postorder(head);
		System.out.println("\nPre order Traversal");
		System.out.println();
		preorder(head);
	}
	static void insertNode()
	{
		System.out.println("Enter data");
		if(head==null)
		{
			head=new Tree(sc.nextInt());
			root=head;
			return;
		}
		else
		{
			if(root.left==null)
			{
				root.left=new Tree(sc.nextInt());
			}
			else
			{
				root.right=new Tree(sc.nextInt());
				root=root.left;
			}
		}
	}
	
	
	// Inoreder Tree Traversal of Binary Tree
	static void inorder(Tree root)
	{
		if(root!=null)
		{
			inorder(root.left);
			System.out.print(root.data+", ");
			inorder(root.right);
		}
	}
	
	// Preorder Tree Traversal of Binary Tree
	
	static void preorder(Tree root)
	{
		if(root!=null)
		{
			System.out.print(root.data+", ");
			preorder(root.left);
			preorder(root.right);
		}
	}	
	
	static void postorder(Tree root)
	{
		if(root!=null)
		{
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data+", ");
		}
	}
}