import java.util.*;
class Stack
{
	int data;
	Stack next,prev;
	Stack(int data, Stack prev)
	{
		this.data=data;
		this.prev=prev;
		this.next=null;
	}
}

class Solution
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] a)
	{   
	    char ch;
		String str= sc.nextLine();
		System.out.println(str.length());
		for(int i=0;i<str.length();i++){
		ch=(str.charAt(i));
		System.out.println(ch);
		    switch(ch){
			 case '+' :
			    System.out.println(1);
				break;
			 case '-' :
			    System.out.println(2);
				break;
			case '*' :
			    System.out.println(3);
				break;
			case '/' :
			    System.out.println(4);
				break;
			case "("
			     System.out.println((int)ch ));
			break;
			case ")"
			     System.out.println(6);
			}
		}
	} 
}