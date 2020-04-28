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
			for(int j=0;j<n;j++)
			insertNode(list.get(rear),sc.nextInt());
		}		
		System.out.println("In order traversing of the tree");
		inOrder(list.get(0));
		}
		else
			System.out.println("Enter size is not valid");
	}
	//  Level order traversing
	static int front1=-1,rear1=-1;
    static List <Node> list1 = new ArrayList<Node> ();
	public static void levelOrder(Node root) {
         if(root!=null)
        {
            System.out.print(root.data+" ");
            if(root.left!=null)
            {
                if(root.right!=null)
                {
                    front1++;
                    list1.add(front1,root.left);
                    front1++;
                    list1.add(front1,root.right);
                }
                else
                {
                    front1++;
                    list1.add(front1,root.left);
                }
            }
            else if(root.right!=null)
            {
                    front1++;
                    list1.add(front1,root.right);
            }
            try{
              rear1++;
              levelOrder(list1.get(rear1));
            }
            catch(Exception e)
            {
               // System.out.println("Size is = "+ front1);
            }
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
}