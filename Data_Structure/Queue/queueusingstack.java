/*
Implementation of queue using Two Stack :-
We can implement queue using two stack always second stack use to store popped element 
 of first stack.
*/

import java.util.*;
class Stack
{
	int data;
	Stack prev,next;
	Stack(int data,Stack prev)
	{
		this.data=data;
		this.prev=prev;
		next=null;
	}
}
class QueueUsingStack
{
	static Scanner sc=new Scanner(System.in);
	static Stack s1=null,s2=null;
	public static void main(String []a)
	{
		push(1,s1);
		push(2,s1);
		push(3,s1);
	    pop();
		push(4,s1);
		push(5,s1);
		pop();
		pop();
		push(45,s1);
		pop();
		pop();
		pop();
	}
	static Stack push(int data,Stack top)
	{
		if(top==null)
		{
			top=new Stack(data,top);
		}
		else {
			top.next=new Stack(data,top);
			top=top.next;}
		return top;
	}
	
	static void pop()
	{
		if(s2 == null)
		{
			while(s1 != null)
			{
				s2=push(s1.data,s2);
				s1=s1.prev;
			}
			pop();
		}
		else 
		{
			System.out.print(s2.data+" ,");
			s2=s2.prev;
		}
	}
}
