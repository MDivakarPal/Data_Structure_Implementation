import java.util.*;
class Queue
{
  static final Scanner sc=new Scanner(System.in);
  static int front=-1,rear=-1,n=0,queue[];
  public static void main(String []a)
  {
	  System.out.println("Enter the size of Queue");
	  n=sc.nextInt();
	  queue=new int[n];
	  for(int i=0;i<n;i++)
      insert();	
      //insert();
	  delete();
	  delete();
	  delete();
      display();	  
  }
  // Insertion in queue
  static void insert()
  {
	  System.out.println("Enter the data");
	  int data=sc.nextInt();
	  if(rear < front || rear+1>=n)
		  System.out.println("Queue is out of storage");
	  else{
	  if(front==-1 && rear==-1)
	  {
		  front=front+1;
		  rear=rear+1;
		  queue[rear]=data;
	  }
	  else
	  {
		  rear=rear+1;
		  queue[rear]=data;
	  }
	  }
  }
  // Displaying of queue elements
  static void display()
  { System.out.println("Inputed queue is");
  int fr=front;
  	  if(front == -1 || front> rear)
	     System.out.println("Queue is empty nothing to display");
	 else
	 {
	  while(fr <= rear)
	  {
		  System.out.println(queue[fr]);
		  fr++;
	  }
	 }
  }
  // Deletion in queue
  static void delete()
  {
	  if(front == -1 || front> rear)
	     System.out.println("Queue is empty");
	  else
		  front++;
  }
}