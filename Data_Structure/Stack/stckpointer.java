class Stack
{
	int data;
	Stack next;
	Stack prev;
	Stack(int data)
	{
		this.data=data;
	}
}

class StackExp
{
	public static void main(String a[])
	{  System.out.println("Stack is");
	    Stack top=null;
		top=push(top,14);
		top=push(top,1441);
		top=push(top,1412);
		top=push(top,141);
		display(top);
		System.out.println("Element after pop");
	    top=pop(top);
		display(top);
		
	}
	static Stack push(Stack top, int data)
	{

		if(top == null)
		{
			top=new Stack(data);
			top.prev=null;
		}
		else
		{
			top.next=new Stack(data);
			top.next.prev=top;
			top=top.next;
		}
		return top;
	}
	
	static void display(Stack top)
	{
		if(top == null)
		 System.out.println("Stack is underflow");
	    else
		{
			while(top.prev != null)
			{   //System.out.println("I am push");
				System.out.println(top.data);
				top=top.prev;
			}
			System.out.println(top.data);
		}
	}
	static Stack pop(Stack top)
	{
		if(top==null)
			System.out.println("Stack is underflow");
		else
		{
			top=top.prev;
			top.next=null;
		}
		return top;
	}
}
