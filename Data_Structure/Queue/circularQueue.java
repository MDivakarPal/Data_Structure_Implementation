import java.util.*;
class CircularQueue
{
	static int queue[],front=-1,rear=-1,n=0;
	static Scanner sc=new Scanner(System.in);
	public static void main(String []a)
	{
		System.out.println("Enter size of queue");
		n=sc.nextInt();
		queue=new int[n];
		delete();
		for(int i=0;i<n;i++)
			insert();
		delete();
		insert();
		display();
	}
	static void insert()
	{
	     System.out.println("Enter element");
		 int data=sc.nextInt();
		if(front == -1 && rear ==-1)
		{
			front=0;rear=0;
			queue[rear]=data;
			rear++;
		}
		else if(rear < n && rear!=front)
		{
			queue[rear]=data;
			rear++;
		}
		else if(rear >= n && Math.abs(rear-front) <= n-1)
		{
			rear=0;
			queue[rear]=data;
			rear++;
		}
		else
			System.out.println("Queue is overflow");
	}
	
	static void display()
	{
		System.out.println("Elements are");
		int fr=front;
		while(fr != rear)
		{
			System.out.println(queue[front]);
			fr++;
		}
	}
	
	static void delete()
	{
		if(front == -1)
			System.out.println("Queue is underflow");
		else 
			front++;
	}
}