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
{   static int n=0;
	public static void main(String[]a)
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter total no of nodes");
	   Node root=null;
	   n=Integer.parseInt(sc.next());
	   System.out.println("Enter data");
	   for(int i=0;i<n;i++)
		   root=bstinsert(root,sc.nextInt());
	   inOrder(root);
	   int h=height(root);
	   System.out.println("Height = "+(h-1));
	   boolean res=checkBst(root);
	   printList1();
	   if(res)
		   System.out.println("I am a BST tree");
	   else
		   System.out.println("I am not BST tree");
	   
	   // Search a data in to BST
	   
	   System.out.println("Enter searhing Element");
	   if(searchBst(root, sc.nextInt()))
		   System.out.println("Data found");
	   else
		   System.out.println("Data not found");
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
	
	// Check BST method
	//static List <Integer> list1=new ArrayList<Integer>();
	static int list1[]=new int[n];
	static int dm=0;
	{
	System.out.println("Length = "+list1.length);
		
	}
	public static boolean checkBst(Node root)
	{
		boolean res=false;
		/*	if(root !=null)
			{
				if(root.left!=null)
				{
					if(root.data>root.left.data)
					{
						if(root.right!=null)
						{
							if(root.data<root.right.data)
							{
								res=true;
								checkBst(root.left);
								checkBst(root.right);
							}
							else
								res=false;
						}
						else
						{
							res=true;
							checkBst(root.left);
						}
					}
					else
						res=false;
				}
				else
				{
					if(root.right!=null)
					{
						if(root.data<root.right.data)
						{
							res=true;
							checkBst(root.right);
						}
						else
						{
							res=false;
						}
					}
					else
						res=true;
				}
			}*/
			
			try{
		if(root!=null)
		{
			checkBst(root.left);
            list1[dm]=root.data;
			dm=dm+1;
			inOrder(root.right);
		}
			}
			catch(Exception e)
			{
				
			}
		return res;
	}
	
	public static void printList1()
	{
		    System.out.println("Size is "+list1.length);
		    int i=0;
		    for( i=0;i<list1.length;i++)
			{System.out.print(list1[i]+" ");}
	}
	//Search in BST tree
	
	static boolean searchBst(Node root, int data)
	{
	    boolean res=false;
		if(root !=null)
		{
			if(root.data==data)
				res=true;
			else if(root.left!=null)
			{
				if(root.data>data)
					searchBst(root.left,data);
				else if(root.right !=null)
				{
					if(root.data<data)
					searchBst(root.right,data);
				}
			}
			else if(root.right!=null)
			{
				if(root.data<data)
					searchBst(root.right,data);
			}
		}
		else
			res=false;
		return res;
	}
}