class Tree
{
	int data;
	Tree left;
	Tree right;
	Tree(int data)
	{
		this.data=data;
	}
	static void setter(Tree left, Tree right, Tree root)
	{
		root.left=left;
		root.right=right;
	}
}

class TreeTraversal
{
	public static void main(String []a)
	{
      Tree root,left,right;
	  root=new Tree(10);
	  left=new Tree(11);
	  right=new Tree(12);
	  Tree.setter(left,right,root);
	  left=new Tree(20);
	  right=new Tree(26);
	  Tree.setter(left,right,root.left);
	  left= new Tree(48);
	  right= new Tree(56);
	  Tree.setter(left,right,root.left);
	  preorder(root);
	}
	
	static void preorder(Tree root)
	{
		if(root !=null)
		{
			System.out.print(root.data+", ");
			preorder(root.left);
			preorder(root.right);
		}
	}
}