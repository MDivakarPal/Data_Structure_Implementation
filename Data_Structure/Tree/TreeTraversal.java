class Tree
{
	int data;
	Tree left;
	Tree right;
	Tree(int data)
	{
		this.data=data;
	}
	static void setter(Tree left, Tree right, Tree root1)
	{
		root1.left=left;
		root1.right=right;
	}
}

class TreeTraversal
{
	public static void main(String []a)
	{
      Tree root1,left,right;
	  root1=new Tree(10);
	  left=new Tree(11);
	  right=new Tree(12);
	  Tree.setter(left,right,root1);
	  left=new Tree(20);
	  right=new Tree(26);
	  Tree.setter(left,right,root1.left);
	  left= new Tree(48);
	  right= new Tree(56);
	  Tree.setter(left,right,root1.left);
	  preorder(root1);
	  boolean res=checkBst(root1);
	   if(res)
		   System.out.println("I am a BST tree");
	   else
		   System.out.println("I am not BST tree");

	}
	
	static void preorder(Tree root1)
	{
		if(root1 !=null)
		{
			System.out.print(root1.data+", ");
			preorder(root1.left);
			preorder(root1.right);
		}
	}
	
	public static boolean checkBst(Tree root1)
	{
		boolean res=false;
			if(root1 !=null)
			{
				if(root1.left!=null)
				{
					if(root1.data>root1.left.data)
					{
						if(root1.right!=null)
						{
							if(root1.data<root1.right.data)
							{
								res=true;
								checkBst(root1.left);
								checkBst(root1.right);
							}
							else
								res=false;
						}
						else
						{
							res=true;
							checkBst(root1.left);
						}
					}
					else
						res=false;
				}
				else
				{
					if(root1.right!=null)
					{
						if(root1.data<root1.right.data)
						{
							res=true;
							checkBst(root1.right);
						}
						else
						{
							res=false;
						}
					}
					else
						res=true;
				}
			}
			return res;
	}
}