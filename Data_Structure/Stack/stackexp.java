import java.util.*;
class StackExp
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String a[])
	{
		int size=0,top=-1,data=0;
		System.out.println("Enter Size of stack");
		size=sc.nextInt();
		int stck[] = new int[size];
		for(int i=0;i<size;i++){
			data=sc.nextInt();
		top=insert(stck,top,data);
		}
		System.out.println("Stack is ");
		trverseStack(stck,top);
		System.out.println("Deletion is performed");
		top=delete(top);
		trverseStack(stck,top);
		top=insert(stck,top,59);
				trverseStack(stck,top);
		
	}
	static int insert(int stck[],int top, int data)
	{
		//top=top+1;
		if(top+1>=stck.length)
		    System.out.println("Stack is overflow");
		else{
		stck[top+1]=data; top++;}
		return top;
	}
	
	static void trverseStack(int stck[],int top)
	{
		if(top<0)
			System.out.println("Stack is underflow");
		else
		{
			for (int i=top; i>=0;i--)
				System.out.println(stck[i]);
		}
	}
	
	static int delete(int top )
	{
		if(top<0)
			System.out.println("Stack is underflow nothing to delete");
		 else {
			 top=top-1;
		 }
		 return top;
	}
}