import java.io.*;
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }
	
}
class Solution
{
	public static Node insert(Node head,int data)
	{
  	//Complete this method
		Node node = new Node(data);
		head.next = node;
		
		System.out.println(head.data+"H");
		return node;
	}


public static void display(Node head)
{
      Node start=head;
      while(start!=null)
      {
          System.out.print(start.data+" * ");
          System.out.print(start.next+" # ");
          start=start.next;
          
          
      }
}
public static void main(String args[])
{
      Scanner sc=new Scanner(System.in);
      Node head=null;
      int N=sc.nextInt();
      while(N-->0){
          int ele=sc.nextInt();
          head = new Node(ele);          
          head=insert(head,ele);
         
      }
      display(head);

}
}