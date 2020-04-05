import java.util.*;
class Queue
{ 
	static Scanner sc=new Scanner(System.in);
	Queue next;
	int data;
	Queue()
	{
		System.out.println("Enter a number");
		this.data=sc.nextInt();
		this.next=null;
	}
}

class QueuePointer
{
	static Scanner sc=new Scanner(System.in);
	static int ch;
	static Queue front=null, rear=null;
	public static void main(String [] a)
	{
	do
	{
		choice();
	   switch(ch)
	   {
	    case 1:
	      insert();
		  break;
	    case 2:
			delete();
			break;
		case 3:
			update();
			break;
		case 4:
			search();
			break;
		case 5:
			display();
			break;
		case 6:
		    System.out.println("Exit........");
			break;
		default :
			System.out.println("Invalid input");
	   }
		
	}while(ch !=6);
	}
	
	// Choice method
    static void choice()
	{
	System.out.println(" 1. Isnert\n 2. Delete\n 3. Update\n 4. Search\n 5. Display \n 6. Exit");
		ch=sc.nextInt();
	}
	
	// Display
	
	static void display()
	{
		System.out.println("Elements are");
		Queue f=front;
		while(f !=null )
		{
			System.out.println(f.data);
				f=f.next;
		}
	}
	
	// Insert a data
	
	static void insert()
	{
		if(front == null && rear == null)
		{
			rear=new Queue();
			front=rear;
		}
		else
		{
			rear.next=new Queue();
			rear=rear.next;
		}
	}
	
	// Delete
	
	static void delete()
	{
		if(front==null)
		{
			System.out.println("Queue is empty");
		}
		else
			front=front.next;
	}
	
	// Search 
	
	static void search()
	{
		System.out.println("Enter searching element");
		int data=sc.nextInt();
		Queue f=front;
		while(f !=null )
		{
			if(f.data==data){
			System.out.println("Element found");
			return;
			}
			else
				f=f.next;
		}
		System.out.println("Element not found");
	}
	
	static void update()
	{
		if(rear !=null){
		System.out.println("Enter updating element");
		int data=sc.nextInt();
		Queue f=front;
		while(f !=null )
		{
			if(f.data==data){
			System.out.println("Enter new element");
			f.data=sc.nextInt();
			System.out.println("Updation successful");
			return;
			}
			else
				f=f.next;
		}
		}
		else
			System.out.println("Queue is empty");
	}
}